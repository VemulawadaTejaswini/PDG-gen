import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N+1];
    int[] b = new int[N+1];
    int[] c = new int[N+1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    // 0 = a
    // 1 = b
    // 2 = c
    int[][] dp = new int[N+1][3];
    dp[0][0] = 0;
    dp[0][1] = 0;
    dp[0][2] = 0;
    for(int i = 1; i <= N; i++) {
      dp[i][0] = a[i] + Math.max(dp[i-1][1], dp[i-1][2]);
      dp[i][1] = b[i] + Math.max(dp[i-1][0], dp[i-1][2]);
      dp[i][2] = c[i] + Math.max(dp[i-1][0], dp[i-1][1]);
    }
    System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
  }
}