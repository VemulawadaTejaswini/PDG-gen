import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    long ans=0;
    for( int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    
    }
    Arrays.sort(a);
    ans+=(long)a[n-1];
    int p=2;
   for( int i=n-2;p<=n&&i>=0;i--)
   {
     if(p==n)
       break;

        ans+=(long)a[i];
        p++;
       if(p==n)
       break;
     ans+=(long)a[i];
     p++;
   }
     
    
    System.out.println(ans);
  }
}
