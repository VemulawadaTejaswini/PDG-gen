import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int dp[]=new int[n];
    dp[0]=0;
    dp[1]=Math.abs(a[0]-a[1]);
    for(int i=1;i<n;i++)
    {
        dp[i]=Integer.MAX_VALUE;
        for(int j=i-1;j>=i-k && j>=0;j--)
        {
            //if(j>=0)
            dp[i]=Math.min(dp[i],Math.abs(a[i]-a[j])+dp[j]);
        }
    }
      //dp[i]=Math.min(Math.abs(a[i-1]-a[i])+dp[i-1],Math.abs(a[i-2]-a[i])+dp[i-2]);
    System.out.println(dp[n-1]);
  }
}