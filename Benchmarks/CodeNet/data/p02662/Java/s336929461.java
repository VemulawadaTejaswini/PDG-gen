import java.util.Scanner;

public class Main {

  static final long MOD = 998244353;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    long dp[][] = new long[n + 1][s + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= n; i++) {
      int a = sc.nextInt();
      for (int j = 0; j <= s; j++) {
        dp[i][j] = (dp[i][j] + (2 * dp[i - 1][j])) % MOD;
        if (j >= a) {
          dp[i][j] = (dp[i][j] + dp[i - 1][j - a]) % MOD;
        }
      }
    }
    System.out.println(dp[n][s]);
  }
}
