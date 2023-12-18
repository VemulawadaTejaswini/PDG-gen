// http://drken1215.hatenablog.com/entry/2019/09/29/103500

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    int[] c = new int[M]; // compress as bit set.
    for (int i = 0; i < M; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      for (int j = 0; j < b[i]; j++) {
        int t = sc.nextInt();
        t--; // Make chest 0-indexed.
        c[i] += 1 << t;
      }
    }
    int INF = Integer.MAX_VALUE / 2;
    // [At 1-indexed i-th(>0) shop][chest-bits]
    int[][] dp = new int[M+1][1 << N]; // = cost (<= 10^8)
    for (int[] d : dp) {
      Arrays.fill(d, INF);
    }
    dp[0][0] = 0; // [no-shop][no-chest]

    for (int idxKey = 0; idxKey < M; idxKey++) {
      for (int j = 0; j < (1 << N); j++) { // 0-indexed treasure-chest bit-set
        // Don't use idxKey.
        dp[idxKey+1][j] = Math.min(dp[idxKey+1][j], dp[idxKey][j]);

        // Use idxKey. (Suppose access to bit-set `j` is already created.)
        int nj = j | c[idxKey];
        dp[idxKey+1][nj] = Math.min(dp[idxKey+1][nj], dp[idxKey][j] + a[idxKey]);
      }
    }
    int ans = (dp[M][(1 << N) - 1] < INF) ? dp[M][(1 << N) - 1] : -1;
    System.out.println(ans);
  }
}
