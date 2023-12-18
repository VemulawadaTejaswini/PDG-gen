import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            long n=sc.nextLong();
        
            double d=sc.nextDouble();
            long c=(long)d;
            long frac=(long)((d*100)%(c*100l));
            long k=n*frac;
            long ans=n*c*100l+k;
            ans/=100l;
            System.out.println(ans);
        
        }
            
    }
   
}