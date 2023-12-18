import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        bubbleSort(a);
    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    int swap = a[j-1];
                    a[j-1] = a[j];
                    a[j] = swap;
                    swaps++;
                }
            }
        }
        System.out.println(printArray(a));
        System.out.println(swaps);
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
