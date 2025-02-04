import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N+1];
    int[] b = new int[N+1];
    int[] c = new int[N+1];
    for(int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int[][] dp = new int[N+1][3];
    for(int i = 1; i <= N; i++) {
      dp[i][0] = Math.max(dp[i - 1][1] + a[i], dp[i - 1][2] + a[i]);
      dp[i][1] = Math.max(dp[i - 1][0] + b[i], dp[i - 1][2] + b[i]);
      dp[i][2] = Math.max(dp[i - 1][0] + c[i], dp[i - 1][1] + c[i]);
    }
    System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
  }
}
