import java.util.*;
import java.lang.Math;


public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		double x1, x2, x3, y1, y2, y3, xp, yp, r;
		double a, b, c, d, e, f;
		
		n = sc.nextInt();
		
		for(int i=0; i < n; i++){
		
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			a = 2 * (x2 - x1);
			b = 2 * (y2 - y1);
			c = Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2);
			d = 2 * (x3 - x1);
			e = 2 * (y3 - y1);
			f = Math.pow(x1, 2) - Math.pow(x3, 2) + Math.pow(y1, 2) - Math.pow(y3, 2);
			
			xp = (b * f - c * e) / (e * a - b * d);
	        yp = (d * c - a * f) / (e * a - d * b);
	        
	        r = Math.sqrt(Math.pow(x1 - xp, 2) + Math.pow(y1 - yp, 2));
	        
	        System.out.printf("%.3f %.3f %.3f\n", xp, yp, r);
		}
	}

}