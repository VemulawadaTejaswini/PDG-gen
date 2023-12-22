import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  int b[]=new int[n];
  int c[]=new int [n];
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();

    b[i]=sc.nextInt();

    c[i]=sc.nextInt();

  }
  int dp[][]=new int[n+1][3];
  for(int i=0;i<n;i++)
  {
    dp[i+1][0]=Math.max(dp[i][1],dp[i][2])+a[i];
    dp[i+1][1]=Math.max(dp[i][0],dp[i][2])+b[i];
    dp[i+1][2]=Math.max(dp[i][1],dp[i][0])+c[i];

  }
  System.out.println(Math.max(Math.max(dp[n][0],dp[n][1]),dp[n][2]));
}
}