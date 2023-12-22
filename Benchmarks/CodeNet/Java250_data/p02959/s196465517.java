import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] lis_a = new long[n+1];
        long[] lis_b = new long[n];

        for (int i = 0; i < n + 1; ++i) {
            lis_a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; ++i) {
            lis_b[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = n; i >= 0; --i) {
            if (i == n) {
                long x = Math.min(lis_a[i], lis_b[i - 1]);
                sum += x;
                lis_b[i - 1] -= x;
            } else if (i == 0) {
                long x = Math.min(lis_a[i], lis_b[i]);
                sum += x;
                lis_b[i] -= x;
            } else {
                long x = Math.min(lis_a[i], lis_b[i] + lis_b[i - 1]);
                sum += x;
                if (lis_b[i] >= x) {
                    lis_b[i] -= x;
                } else {
                    lis_b[i - 1] -= x - lis_b[i];
                    lis_b[i] = 0;
                }
            }
        }

        System.out.println(sum);
    }
}
