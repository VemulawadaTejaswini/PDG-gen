import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static final long MOD = 998244353;
  private int[][] lr;
  private int[] dp;

  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }
  int solve(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    lr = new int[k][2];
    for(int i = 0; i < k; i++){
      lr[i][0] = sc.nextInt();
      lr[i][1] = sc.nextInt();
    }
    sc.close();
    dp = new int[n + 1];
    Arrays.fill(dp, -1);
    dp[1] = 1;
    return dfs(n);
  }
  int dfs(int n){
    if(dp[n] != -1){
      return dp[n];
    }
    int ans = 0;
    for(int i = 0; i < lr.length; i++){
      for(int j = lr[i][0]; j <= lr[i][1]; j++){
        if(n - j > 0){
          ans += dfs(n - j);
          ans %= MOD;
        }
      }
    }
    dp[n] = ans;
    return dp[n];
  }
}
