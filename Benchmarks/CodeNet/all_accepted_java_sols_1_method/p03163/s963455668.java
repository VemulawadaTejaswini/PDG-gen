import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    int[] val=new int[n];
    int[] weights=new int[n];
    for(int i=0;i<n;i++)
    {
      weights[i]=sc.nextInt();
      val[i]=sc.nextInt();
      
    }
    long[] dp=new long[w+1];
    for(int i=1;i<=n;i++)
    {
      for(int j=w;j>=weights[i-1];j--)
      {
        dp[j]=Math.max(dp[j],dp[j-weights[i-1]]+val[i-1]);
      }
    }
    System.out.println(dp[w]);
  }
}
    