import java.util.*;

public class Main {
  private static final int INF = 1_000_000_005;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    
    int vmax = 100001;
    int[][] dp = new int[N+1][vmax];
    for (int i = 0; i < N+1; i++) {
      for (int j = 0; j < vmax; j++) {
        dp[i][j] = INF;
      }
    }
    dp[0][0] = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < vmax; j++) {
        if (dp[i][j]+w[i] <= W) {
          dp[i+1][j+v[i]] = Math.min(dp[i+1][j+v[i]], dp[i][j]+w[i]);
        }
        dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
      }
    }
    
    long ans = 0;
    for (int j = 0; j < vmax; j++) {
      if (dp[N][j] != INF) {
        ans = Math.max(ans, j);
      }
    }
    System.out.println(ans);
  }
}