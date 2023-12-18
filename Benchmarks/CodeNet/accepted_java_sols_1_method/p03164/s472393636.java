import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int wMax=sc.nextInt();
    int[] w=new int[n];
    int[] v=new int[n];
    int sumV=0;
    for(int i=0;i<n;i++){
      w[i]=sc.nextInt();
      v[i]=sc.nextInt();
      sumV+=v[i];
    }
    long[][] dp=new long[n+1][sumV+1];
    for(int j=1;j<=sumV;j++){
      dp[0][j]=Integer.MAX_VALUE;
    }
    /*
      dp[i][j]:=i番目以上の品を使わずに価値jを実現する最小容量
      dp[i][0]=0
      dp[0][j]=inf
      dp[i][j]=MIN(dp[i-1][j-v[i]]+w[i],dp[i-1][j])
    */
    for(int i=1;i<=n;i++){
      for(int j=1;j<=sumV;j++){
        dp[i][j]=dp[i-1][j];
        if(j-v[i-1]>=0){
          dp[i][j]=Math.min(dp[i-1][j-v[i-1]]+w[i-1],dp[i][j]);
        }
      }
    }
    long ans=0;
    for(int i=sumV;i>=0;i--){
      if(dp[n][i]<=wMax){
        ans=i;
        break;
      }
    }
    System.out.println(ans);
    /*
    System.err.println(Arrays.toString(w));
    System.err.println(Arrays.toString(v));
    for(int i=0;i<=n;i++){
      for(int j=0;j<=sumV;j++){
        System.err.print(dp[i][j]==Integer.MAX_VALUE?"INF":dp[i][j]);
        System.err.print(" ");
      }
      System.err.println();
    }
    */
  }
}