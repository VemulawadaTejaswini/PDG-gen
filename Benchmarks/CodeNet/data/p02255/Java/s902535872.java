import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = in.nextInt();
        }
        insertionSort(a);
    }

    private static void insertionSort(int[] a) {
        int length = a.length;
        System.out.println(printArray(a));
        for (int i = 1; i < length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            System.out.println(printArray(a));
        }
    }

    private static String printArray(int[] a) {
        int length = a.length;
        String arrayString = "";
        for (int i = 0; i < length - 1; i++) {
            arrayString = arrayString + a[i] + " ";
        }
        arrayString = arrayString + a[length - 1];
        return arrayString;
    }
}
