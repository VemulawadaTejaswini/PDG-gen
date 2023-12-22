import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int wMax=sc.nextInt();
    int[] w=new int[n];
    int[] v=new int[n];
    for(int i=0;i<n;i++){
      w[i]=sc.nextInt();
      v[i]=sc.nextInt();
    }
    long[][] dp=new long[n+1][wMax+1];
    /*
      dp[i][j]:=i番目以上の品を使わずに重さj以下で実現できる最大価値
      dp[0][j]=0
      dp[i][0]=0
      dp[i][j]=MAX(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
    */
    for(int i=1;i<=n;i++){
      for(int j=1;j<=wMax;j++){
        dp[i][j]=dp[i-1][j];
        if(j-w[i-1]>=0){
          dp[i][j]=Math.max(dp[i-1][j-w[i-1]]+v[i-1],dp[i][j]);
        }
      }
    }
    long ans=dp[n][wMax];
    System.out.println(ans);
    /*
      System.err.println(Arrays.toString(w));
      System.err.println(Arrays.toString(v));
      System.err.println(Arrays.deepToString(dp));
    */
  }
}