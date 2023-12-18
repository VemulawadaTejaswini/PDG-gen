import java.util.Scanner;

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
	       
        float r;
		double t;
		double s;

       
           
        r = as.nextFloat();
        System.out.println(r);
           
           
        s=3.141592653589*r*r;
        t=2.0*3.141592653589*r;

        System.out.println(s+" "+t);

	}

}