import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        shellSort(a);
        System.out.println(Main.count);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void shellSort(int[] a) {
        int[] gaps = new int[100];
        int idx = 0;
        for (int g = 1; g <= a.length && idx < 100; g = g * 3 + 1, idx++) {
            gaps[idx] = g;
        }
        System.out.println(idx);
        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(gaps[i]);
            if (i != 0) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
            insertionSort(a, gaps[i]);
        }
    }

    private static void insertionSort(int[] a, int gap) {
        for (int i = gap; i < a.length; i++) {
            int target = a[i];
            int j = i - gap;
            while (j >= 0 && a[j] > target) {
                a[j + gap] = a[j];
                j -= gap;
                count++;
            }
            a[j + gap] = target;
        }
    }
}