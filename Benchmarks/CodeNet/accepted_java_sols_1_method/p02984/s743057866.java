import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum1 += a[i];
        }
        a[n] = a[0];
        long[] d = new long[n];
        for (int i = 1; i < n; i++) {
            d[2 * i % n] = d[(2 * i - 2) % n] + (a[(2 * i - 1) % n] - a[(2 * i - 2) % n]) * 2;
        }
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += d[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(d[i] + (sum1 - sum2) / n);
        }
    }
}