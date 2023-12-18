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
    boolean[][][] dp = new boolean[H][W][m * 2 + 1];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int c = Math.abs(A[i][j] - B[i][j]);
        boolean[] d = dp[i][j];
        if (i == 0 && j == 0) {
          d[m - c] = true;
          d[m + c] = true;
          continue;
        }
        for (int k = 0; k < d.length; k++) {
          if (0 < i && dp[i - 1][j][k]) {
            if (-1 < k - c) d[k - c] = true;
            if (k + c < d.length) d[k + c] = true;
          }
          if (0 < j && dp[i][j - 1][k]) {
            if (-1 < k - c) d[k - c] = true;
            if (k + c < d.length) d[k + c] = true;
          }
        }
      }
    }
    boolean[] d = dp[H - 1][W - 1];
    int ans = d.length;
    for (int k = 0; k < d.length; k++)
      if (d[k])
        ans = Math.min(ans, Math.abs(m - k));
//    System.out.println(Arrays.toString(dp[H - 1][W - 1]));
    System.out.println(ans);
  }
}
