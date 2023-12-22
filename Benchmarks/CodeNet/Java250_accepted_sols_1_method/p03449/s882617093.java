import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] dp=new int[2][n];
    for(int i=0;i<2;i++){
      for(int j=0;j<n;j++){
        dp[i][j]=sc.nextInt();
      }
    }
    for(int i=1;i<n;i++){
      dp[0][i]=dp[0][i-1]+dp[0][i];
    }
    dp[1][0]=dp[0][0]+dp[1][0];
    for(int i=1;i<n;i++){
      dp[1][i]=dp[1][i]+Math.max(dp[0][i],dp[1][i-1]);
    }
    System.out.println(dp[1][n-1]);
  }
}