import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int cnt = scan.nextInt();
    while (cnt != 0) {
      int[] dp = new int[cnt];
      int[] res = new int[cnt];
      Arrays.fill(dp, Integer.MIN_VALUE);
      Arrays.fill(res, Integer.MIN_VALUE);
      
      dp[0] = scan.nextInt();
      res[0] = dp[0];
      for (int i = 1; i < cnt; i++) {
        int v = scan.nextInt();
        dp[i] = Math.max(v, dp[i-1] + v);
        res[i] = Math.max(res[i-1], dp[i]);
      }
      
      System.out.println(res[cnt-1]);
      cnt = scan.nextInt();
    }
  }
}

