import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Long[] a = new Long[n];

        boolean allNegative = true;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            if (a[i] >= 0) {
                allNegative = false;;
            }
        }

        Arrays.sort(a, Comparator.comparingLong(v -> Math.abs(v)));

        if (allNegative) {
            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans = modmul(ans, a[i], MOD);
            }

            if (ans < 0) {
                ans += MOD;
            }
            System.out.println(ans);
            return;
        }

        long ans = 1;
        int index = n - 1;
        for (int count = 0; count < k - 1 ; count++) {
            ans = modmul(ans, a[index], MOD);
            index--;
        }

        if (k % 2 == 0) {
            ans = modmul(ans, a[index], MOD);
        } else {
            for (int i = index; i >= 0; i--) {
                if (a[i] >= 0) {
                    ans = modmul(ans, a[i], MOD);
                }
            }
        }

        if (ans < 0) {
            ans += MOD;
        }
        System.out.println(ans);
    }

    static long modmul(long a, long b, long mod) {
        long r = (a * b) % mod;
        return r >= 0 ? r : r + mod;
    }
}