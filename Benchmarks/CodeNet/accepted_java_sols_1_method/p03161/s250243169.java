import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] line0 = reader.readLine().split(" ");
    int N = Integer.parseInt(line0[0]);
    int K = Integer.parseInt(line0[1]);
    int[] dp = new int[N +1];
    int[] h = new int[N + 1];
    String[] line = reader.readLine().split(" ");
    for (int i = 1; i <= N; i++){
      h[i] = Integer.parseInt(line[i - 1]);
    }
    Arrays.fill(dp, 1<<30);
    dp[1] = 0;
    dp[2] = Math.abs(h[2] - h[1]);
    for (int i = 1; i <= N; i++){
      for (int j = 1; j <= K; j++){
        if( i - j >= 1){
          dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
        }
      }
    }
    System.out.println(dp[N]);
  }
}
