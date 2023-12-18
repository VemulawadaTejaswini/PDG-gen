import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    long sum[] = new long[n];
    long mod = 1000000007;
    long arr[] = new long[n];
    for(int i = 0 ; i < n ; i++)
    {
      arr[i] = sc.nextLong();
    }
    sum[n-1] = arr[n-1];
    for(int i = n-2 ; i >= 0 ; i--)
    {
      sum[i] = sum[i+1]+arr[i];
      sum[i] %= mod;
    }
    long ans = 0;
    for(int i = 0 ; i < n-1 ; i++)
    {
      ans += arr[i]*sum[i+1]%mod;
      ans %= mod;
    }
    System.out.println(ans);
  }
  }
