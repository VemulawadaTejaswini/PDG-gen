import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] abc = new int[N][3];
    for (int i = 0; i < N; i++) {
      abc[i][0] = sc.nextInt();
      abc[i][1] = sc.nextInt();
      abc[i][2] = sc.nextInt();
    }
    sc.close();

    long[][] dp = new long[N][3];
    for (int j = 0; j < 3; j++) dp[0][j] = abc[0][j];
    for (int i = 1; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        dp[i][j] = Math.max(
            abc[i][j] + dp[i - 1][(j + 1) % 3], 
            abc[i][j] + dp[i - 1][(j + 2) % 3]);
      }
    }
    long ans = 0;
    for (int j = 0; j < 3; j++) ans = Math.max(ans, dp[N - 1][j]);
    System.out.println(ans);
  }
}