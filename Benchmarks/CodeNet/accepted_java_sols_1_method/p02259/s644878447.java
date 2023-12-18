import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int swap = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    swap++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(' ');
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println(swap);
    }
}
