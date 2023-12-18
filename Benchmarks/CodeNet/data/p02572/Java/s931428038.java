import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
        Scanner in=new Scanner(System.in);
        int n;
        long sum=0;
        n=in.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
          	a[i]=in.nextLong();
        }
       for(int i=0;i<n;i++)
       {
         	for(int j=i+1;j<n;j++)
            {
              	sum=sum+((a[i]*a[j])%1000000007);
            }
         	sum=sum%(1000000007);
        // System.out.println(i+" "+sum);
       }
       System.out.println(sum);
     }
}

