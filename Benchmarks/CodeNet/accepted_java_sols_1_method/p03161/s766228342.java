import java.util.*;
import java.io.*;

class Main {




  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int K = in.nextInt();
    int[] hs = new int[N];
    for (int i = 0; i < N; i++) {
      hs[i] = in.nextInt();
    }

    int[] dp = new int[N];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    dp[1] = Math.abs(hs[1] - hs[0]);


    for (int i = 2; i < N; i++) {
      for (int j = 1; j <= K; j++) {
        if (i - j < 0) break;
        dp[i] = Math.min(dp[i], 
                       dp[i - j] + Math.abs(hs[i] - hs[i - j]));
      }
    }

    System.out.println(dp[N - 1]);
  }

  

  
}