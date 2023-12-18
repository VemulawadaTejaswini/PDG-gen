import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int j = partition(a, 0, a.length - 1);
        for (int i = 0; i < n; i++) {
            if (i == j) {
                System.out.print("[");
            }
            System.out.print(a[i]);
            if (i == j) {
                System.out.print("]");
            }
            if (i == a.length - 1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
    }

    private static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        i++;
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }
}