import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []ar=new int[n];
    int []a=new int[n];
    for(int i=0;i<n;++i)
    {
      ar[i]=sc.nextInt();
    }
    long sum=0;
    int mod=1000000007;
    for(int i=n-2;i>=0;--i)
    {
      a[i]=(a[i+1]+ar[i+1])%mod;
    }
    for(int j=0;j<n-1;++j)
      {
        sum=(sum+ar[j]*a[j])%mod;
      }
    System.out.println(sum);
  }
}
