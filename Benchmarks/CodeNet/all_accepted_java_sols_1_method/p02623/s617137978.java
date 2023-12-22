
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n + 1];
        long[] b = new long[m + 1];
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        for (int i = 1; i < m + 1; i++) {
            b[i] = b[i - 1] + sc.nextLong();
        }

        int j = b.length - 1;
        for (int i = 0; i < n + 1; i++) {
            if (a[i] > k) {
                break;
            }
            while (j > 0 && a[i] + b[j] > k) {
                j--;
            }
            max = Math.max(i + j, max);

        }
        System.out.println(max);
    }
}