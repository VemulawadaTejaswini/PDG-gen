import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
         Scanner in=new Scanner(System.in);
        int t,n,k,i,j=0,x;
        double m;
        
            n=in.nextInt();
            x=in.nextInt();
            t=in.nextInt();
            m=Math.ceil((double)n/x);
            m=m*t;
            System.out.println((int)m);
            
        
     }
}
