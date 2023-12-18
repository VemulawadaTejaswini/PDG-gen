import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int W = sc.nextInt();
    long[] w = new long[n+1];
    int[] v = new int[n+1];
    int maxV = 0;
    long INF = (long)Math.pow(10,15);
    int sum = 0;
    for(int i=1;i<=n;i++){
      w[i]=sc.nextLong();
      v[i]=sc.nextInt();
      maxV = Math.max(maxV,v[i]);
      sum += v[i];
    }
    long[] dp = new long[n*maxV+1];
    for(int i = 0;i <= n*maxV;i++)dp[i]=INF;
    dp[0]=0;
    for(int i=0;i<=n;i++){
      for(int j=sum;j>=v[i];j--){
        dp[j]=Math.min(dp[j],dp[j-v[i]]+w[i]);
      }
    }
    int num = 0;
    for(int i=1;i<=n*maxV;i++){
      if(dp[i]<=W)num=i;
    }
    System.out.println(num);
  }
}