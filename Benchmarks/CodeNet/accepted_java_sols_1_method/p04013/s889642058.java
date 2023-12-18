import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt() - a;
    }
    long[][] dp = new long[n][5001];
    dp[0][2500]++;
    dp[0][x[0] + 2500]++;
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < 5001; j++) {
        dp[i][j] += dp[i - 1][j];
        if((j >= x[i]) && ((j - x[i]) < 5001)) dp[i][j] += dp[i - 1][j - x[i]];
      }
    }
    System.out.println(dp[n - 1][2500] - 1);
  }
}