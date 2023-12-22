import java.io.*;
import java.util.*;

class Main {
  public static void main(String... args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String[] sp = br.readLine().split(" ");
    int t = Integer.valueOf(br.readLine());
    for (int k = 0; k < t; k++) {
      String[] a = br.readLine().split("");
      String[] b = br.readLine().split("");
      int n = a.length;
      int m = b.length;
      int[][] dp = new int[1001][1001];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (a[i].equals(b[j])){
            dp[i+1][j+1] = dp[i][j] + 1;
          } else {
            dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
          }
        }
      }

      System.out.println(dp[n][m]);
    }
  }
}

