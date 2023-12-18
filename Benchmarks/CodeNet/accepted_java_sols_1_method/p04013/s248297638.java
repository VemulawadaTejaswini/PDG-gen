import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int[] x = new int[n+1];
    int max = 0;
    for(int i=1;i<=n;i++){
      x[i]=sc.nextInt();
      max = Math.max(max,x[i]);
    }
    long[][][] dp = new long[n+1][n+1][max*n+1];
    dp[0][0][0]=1;
    for(int i=1;i<=n;i++){
      for(int j=0;j<=i;j++){
        for(int k=0;k<=n*max;k++){
          if(i==0&&j==0&&k==0)continue;
          else if(j>=1&&k>=x[i]){
            dp[i][j][k]=dp[i-1][j][k]+dp[i-1][j-1][k-x[i]];
          }
          else dp[i][j][k]=dp[i-1][j][k];
        }
      }
    }
    long ans = 0;
    for(int i=1;i<=n;i++)if(a*i<=max*n+1)ans+=(long)dp[n][i][a*i];
    System.out.println(ans);
  }
}