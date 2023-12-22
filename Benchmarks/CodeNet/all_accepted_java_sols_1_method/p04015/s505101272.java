import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    long[][][] dp = new long[n][n + 1][n * 50 + 1];
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
    dp[0][0][0] = 1;
    dp[0][1][x[0]] = 1;
    for(int i = 1; i < n; i++) {
      dp[i][0][0] = 1;
      for(int j = 1; j <= n; j++) {
        for(int k = 0; k <= (n * 50); k++) {
          if(k >= x[i]) {
            dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i]];
          } else {
            dp[i][j][k] = dp[i - 1][j][k];
          }
        }
      }
    }
    long ans = 0;
    for(int j = 1; j <= n; j++) {
      ans += dp[n - 1][j][a * j]; 
    }
    System.out.println(ans);
  }
}