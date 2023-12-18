import java.util.*;
import java.io.*;

class Main {




  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int[][] points = new int[N][3];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        points[i][j] = in.nextInt();
      }
    }

    int[][] dp = new int[N][3];
    dp[0][0] = points[0][0];
    dp[0][1] = points[0][1];
    dp[0][2] = points[0][2];

    for (int i = 1; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        dp[i][j] = Math.max(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]) + points[i][j];
      }
    }


    System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
  }

  

  
}