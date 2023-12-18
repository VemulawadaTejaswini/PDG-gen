import java.util.Scanner;
import java.math.BigDecimal;



public class Main{
       public static void main(String[] args){
       int i,j,a,b,c,d,e,f;
       double s,t;
    	double[] x = new double[1000];
    	double[] y = new double[1000];
    
        Scanner scan = new Scanner(System.in);
        

       
        i = 0;
        while(scan.hasNextInt()){
        	a = scan.nextInt();
        	b = scan.nextInt();
        	c = scan.nextInt();
        	d = scan.nextInt();
        	e = scan.nextInt();
        	f = scan.nextInt();
        	
        	x[i] = (double)(b*f-c*e)/(b*d-a*e);
        	y[i] = (double)(a*f-c*d)/(a*e-b*d);
        	
        	BigDecimal bx = new BigDecimal(String.valueOf(x[i]));
			BigDecimal by = new BigDecimal(String.valueOf(y[i]));
        	x[i] = bx.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        	y[i] = by.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();

        	
     		
        	i++;
        }
      
        
        j = 0;
        while(j < i){
        	System.out.printf("%.3f",x[j]);
     		System.out.print(" ");
     		System.out.printf("%.3f",y[j]);
     		System.out.println();
        	j++;
       		}
       		}
}