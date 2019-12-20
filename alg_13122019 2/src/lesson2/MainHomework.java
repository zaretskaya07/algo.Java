package lesson2;

public class MainHomework {
    public static void main(String[] args) {
        long startTime, stopTime, elapsedTime;
        HomeWorkWithArray ArrCopy;

        HomeWorkWithArray Arr = new HomeWorkWithArray(100000);
        for (int i = 0; i < Arr.size(); i++) {
            Arr.insert((int) (Math.random() * 2_147_483_647));
        }

        ArrCopy = Arr.clone();
        startTime = System.currentTimeMillis();
        ArrCopy.sortBubble();
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Пузырьковая сортировка: " + elapsedTime + " мс");

        ArrCopy = Arr.clone();
        startTime = System.currentTimeMillis();
        ArrCopy.sortSelect();
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Сортировка методо выбора: " + elapsedTime + " мс");

        ArrCopy = Arr.clone();
        startTime = System.currentTimeMillis();
        ArrCopy.sortInsert();
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Сортировка методо вставки: " + elapsedTime + " мс");
    }
}
