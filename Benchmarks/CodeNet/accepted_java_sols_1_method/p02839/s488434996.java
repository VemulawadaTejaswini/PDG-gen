import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] A = new int[H][W];
    int[][] B = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) A[i][j] = sc.nextInt();
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) B[i][j] = sc.nextInt();
    sc.close();
    
    int m = (H + W) * 80;
    boolean[][][] dp = new boolean[H + 1][W + 1][m * 2 + 1];
    dp[0][1][m] = true;
    for (int i = 1; i < H + 1; i++) {
      for (int j = 1; j < W + 1; j++) {
        int c = Math.abs(A[i - 1][j - 1] - B[i - 1][j - 1]);
        boolean[] d = dp[i][j];
        for (int k = 0; k < d.length; k++) {
          if (dp[i - 1][j][k]) {
            d[k - c] = true;
            d[k + c] = true;
          }
          if (dp[i][j - 1][k]) {
            d[k - c] = true;
            d[k + c] = true;
          }
        }
      }
    }
    boolean[] d = dp[H][W];
    int ans = Integer.MAX_VALUE;
    for (int k = 0; k < d.length; k++)
      if (d[k]) ans = Math.min(ans, Math.abs(m - k));
    System.out.println(ans);
  }
}
