import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int n = sc.nextInt();
        int m = sc.nextInt();
        long dp[] = new long[100100];
        Arrays.fill(dp, 0);
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 3;
        for (int i = 6; i < 100100; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        if (m == 0) {
            // System.out.println(n + 2);
            System.out.println(dp[n + 2]);
            return;
        }
        for (int i = 0; i < m - 1; i++) {
            int sa = a[i + 1] - a[i];
            if (sa == 1) {
                System.out.println(0);
                return;
            }
        }
        long ans = 1;
        ans *= dp[a[0] + 1];

        for (int i = 1; i < m; i++) {
            int sa = a[i] - a[i - 1];
            // System.out.println(sa);
            ans = ans * dp[sa] % mod;
        }
        ans = ans * dp[n + 1 - a[m - 1]] % mod;
        // System.out.println(n + 1 - a[m - 1]);
        /*
         * for (int i = 0; i < n; i++) { // System.out.println(dp[i]); }
         */

        System.out.println(ans);

    }
}