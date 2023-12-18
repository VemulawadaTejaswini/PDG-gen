import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int n = Integer.parseInt(sc.next());  // a
            int m = Integer.parseInt(sc.next());  // b
            int k = Integer.parseInt(sc.next());
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(sc.next());
            }
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(sc.next());
            }

            // calc
            int maxcnt = 0, cnt = 0, bi = 0;
            long sum_a = 0, sum_b = 0;

            for (int i = 0; i < n; i++) {
                if (sum_a + a[i] <= k) {
                    sum_a += a[i];
                }
                sum_b = 0;

                for (bi = 0; bi < m && sum_a + sum_b + b[bi] <= k; bi++) {
                    sum_b += b[bi];
                }

                if (sum_a + a[i] > k) {
                    maxcnt = Math.max(i + bi, maxcnt);
                    break;
                } else {
                    maxcnt = Math.max((i + 1) + bi, maxcnt);
                }
            }

            System.out.println(maxcnt);
        }
    }
}