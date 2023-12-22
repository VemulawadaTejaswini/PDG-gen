import java.util.Scanner;
import java.math.*;


/**
 * @author kawakami
 *
 */
/**
 * @author kawakami
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
	       
		double r,t,s;

	       
        
        r = as.nextDouble();
           
           
        s=3.141592653589*r*r;
        t=2.0*3.141592653589*r;
        
        BigDecimal ros = new BigDecimal(s);
        BigDecimal rot = new BigDecimal(t);
        
        ros=ros.setScale(6,BigDecimal.ROUND_HALF_UP);
        rot=rot.setScale(6,BigDecimal.ROUND_HALF_UP);

        System.out.println(ros+" "+rot);           


	}

}