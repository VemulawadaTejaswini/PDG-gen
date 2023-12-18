import java.util.*;
import java.lang.*;
class Main
{
  public static void findDivisors(int[] a,int n)
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<=n;j+=i)
        a[j]++;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // double max=Math.pow(10,7);
    int[] a=new int[n+2];
    //Arrays.fill(a,0);
    findDivisors(a,n);
    long ans=0;
    for(int i=1;i<=n;i++)
    {
      ans=ans+(i*a[i]);
    }
    System.out.println(ans);
  }
}