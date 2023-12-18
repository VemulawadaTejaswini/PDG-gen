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
		double pi=Math.PI;

       
           
        r = as.nextFloat();
        System.out.println(r);
           
           
        s=pi*r*r;
        t=2.0*pi*r;

        System.out.println(s+" "+t);

	}

}