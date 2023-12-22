import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int m = 0; m < a.length - 1; m++) {
            System.out.print(a[m] + " ");
        }
        System.out.print(a[a.length - 1] + "\n");
        for (int i = 1; i < a.length; i++) {

            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

            for (int m = 0; m < a.length - 1; m++) {
                System.out.print(a[m] + " ");
            }
            System.out.print(a[a.length - 1] + "\n");

        }
    }
}

