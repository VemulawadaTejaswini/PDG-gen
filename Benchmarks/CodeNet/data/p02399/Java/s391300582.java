import java.util.Scanner;
import java.math.*;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
       
        int a;
        int b;
        int d,r;
        double f;

       
           
        a = as.nextInt();
        b = as.nextInt();

        d=a/b;
        r=a%b;
        double fa=(float)a;
        double fb=(float)b;
        f=fa/fb;


        

        BigDecimal fr = new BigDecimal(f);
        fr = fr.setScale(6,BigDecimal.ROUND_HALF_UP);

        System.out.println(d+" "+r+" "+f);
  
        
           
           
           

           
   
 }
 
}