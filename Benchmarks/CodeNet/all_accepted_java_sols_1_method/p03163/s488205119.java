import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int n = Integer.parseInt(hiki[0]);
    int w = Integer.parseInt(hiki[1]);
    int[] weight = new int[n];
    int[] value = new int[n];
    for(int i = 0;i < n;i ++){
      hiki = scan.nextLine().split(" ");
      weight[i] = Integer.parseInt(hiki[0]);
      value[i] = Integer.parseInt(hiki[1]);
    }
    long[][] dp = new long[n][w + 1];
    dp[0][weight[0]]=value[0];
    for(int i = 1;i < n;i ++){
      for(int j = 0;j <= w;j ++){
        if(dp[i-1][j] > 0){
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j]);
          if(j+weight[i] <= w)
          	dp[i][j+weight[i]] = Math.max(dp[i-1][j] + value[i], dp[i][j+weight[i]]);
        }
      }
      dp[i][weight[i]] = Math.max(value[i], dp[i][weight[i]]);
    }
    long max = 0;
    for(int i = 0;i <= w;i ++){
      max = Math.max(max, dp[n-1][i]);
    }
    System.out.println(max);
  }
}
