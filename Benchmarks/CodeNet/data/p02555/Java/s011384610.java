import java.util.*;

public class Main{
  public static int mod=1000000007;
  public static long dp[];
  public static long func(int s,int sum)
  {
    if(sum>s)
    return 0;
    if(sum==s)
    return 1;
    if(dp[sum]!=-1)
    return dp[sum];
    long ans=0;
    for(int i=3;i<=s;i++)
    {
      ans+=func(s,sum+i)%mod;
    }
    return dp[sum]=ans%mod;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    dp=new long[s+1];
    for(int i=0;i<=s;i++)
    dp[i]=-1;
    System.out.println(func(s,0));
  }
}
