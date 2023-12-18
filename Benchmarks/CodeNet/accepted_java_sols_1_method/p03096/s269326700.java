import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod = 1000000007;
    int[] idx = new int[200000];
    Arrays.fill(idx,-1);
    int before = -1;
    long[] dp = new long[n+1];
    dp[0]=1;
    for(int i=0;i<n;i++){
      int c = sc.nextInt()-1;
      if(idx[c]==-1)dp[i+1]=dp[i];
      else{
        if(before!=c)dp[i+1]=(dp[i]+dp[idx[c]])%mod;
        else dp[i+1]=dp[i];
      }
      before=c;
      idx[c]=i+1;
    }
    System.out.println(dp[n]);
  }
}