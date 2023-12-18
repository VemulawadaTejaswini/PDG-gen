import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

class Main
{

    public static void main(final String args[])
    {
        final Scanner sc = new Scanner(System.in);
        
       
        
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int k=sc.nextInt();
        
   int s=h1*60+m1;
        int g=h2*60+m2;
        
        int result=g-s-k;
 
        
        System.out.print(result);
    }
}    