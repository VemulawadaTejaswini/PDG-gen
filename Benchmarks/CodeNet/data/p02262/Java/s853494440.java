import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }

        shellSort(array, size);
        System.out.println(count);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] array, int size, int gap) {
        for (int i = gap; i < size; i++) {
            int value = array[i];
            int j = i - gap;
            while (j >= 0 && array[j] > value) {
                array[j + gap] = array[j];
                j -= gap;
                count++;
            }
            array[j + gap] = value;
        }
    }

    private static void shellSort(int[] array, int size) {
        int[] gaps = new int[]{4, 2, 1};
        System.out.println(gaps.length);
        System.out.println(concat(gaps));
        for (int gap : gaps) {
            insertionSort(array, size, gap);
        }
    }

    private static String concat(int[] array) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int value : array) {
            joiner.add(String.valueOf(value));
        }
        return joiner.toString();
    }
}