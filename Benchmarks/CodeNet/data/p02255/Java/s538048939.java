import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        printArray(n, a);
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            printArray(n, a);
        }
    }

    private static void printArray(int n, int[] a) {
        for (int k = 0; k < n; k++) {
            if (k != 0) {
                System.out.print(" ");
            }
            System.out.print(a[k]);
        }
        System.out.println();
    }

}