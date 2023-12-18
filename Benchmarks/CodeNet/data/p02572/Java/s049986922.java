import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
        Scanner in=new Scanner(System.in);
        int n;
        long sum=0,ans=0;
        n=in.nextInt();
        long a[]=new long[n];
        long suf[]=new long[n];
        for(int i=0;i<n;i++)
        {
          	a[i]=in.nextLong();
          	suf[i]=a[i];
        }
       for(int i=n-2;i>=0;i--)
       {
         	suf[i]=suf[i]+suf[i+1];
       }
       long m=1000000007;
       for(int i=0;i<n-1;i++)
       {
         	ans=ans+(a[i]%m)*(suf[i+1]%m);
       }
       System.out.println(ans%m);
     }
}

