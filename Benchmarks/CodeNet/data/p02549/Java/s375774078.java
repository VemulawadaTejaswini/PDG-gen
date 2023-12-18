import java.util.*;

public class Main{
  public static long mod=998244353;
  public static long dp[];
  public static long func(int n,int a[][],
  int pos)
  {
    if(pos>n)
    return 0;
    if(pos==n)
    return 1;
    if(dp[pos]!=-1)
    return dp[pos];
    long ans=0;
    for(int i=0;i<a.length;i++)
    {
      for(int elem=a[i][0];elem<=a[i][1];elem++)
      ans+=func(n,a,pos+elem)%mod;
    }
    return dp[pos]=ans%mod;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[m][2];
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      a[i][0]=x;
      a[i][1]=y;
    }
    dp=new long[n+1];
    for(int i=0;i<=n;i++)
    dp[i]=-1;
    System.out.println(func(n,a,1));
  }
}

  