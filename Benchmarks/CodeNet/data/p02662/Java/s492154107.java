import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();

        }

        int mod = 998244353;
        long[][] dp = new long[3003][3003];
        dp[0][0] = 1;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= s ; j++) {
              dp[i + 1][j] += (dp[i][j] * 2);
              dp[i + 1][j] %= mod;
              if (j >= a[i]) {
                  dp[i + 1][j] += dp[i][j-a[i]] % mod;
              }
            }
        }

        System.out.println(dp[n][s]);
    }

}