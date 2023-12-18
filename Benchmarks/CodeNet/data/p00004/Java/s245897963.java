import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
	    int a, b, c, d, e, f;
	    double x, y;
	    Scanner s = new Scanner(System.in);
	    while (s.hasNext()) {
	    	a = s.nextInt();
	    	b = s.nextInt();
		    c = s.nextInt();
		    d = s.nextInt();
	    	e = s.nextInt();
	    	f = s.nextInt();
	    	x = (c * e - b * f) / (a * e - d * b);
	        BigDecimal x2 = new BigDecimal(String.valueOf(x));
	        double x3= x2.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        	y = (c * d - a * f) / (b * d - a * e);
	        BigDecimal y2 = new BigDecimal(String.valueOf(y));
	        double y3= y2.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
	        System.out.printf("%.3f %.3f\n", x3, y3);
	    }
	}
}