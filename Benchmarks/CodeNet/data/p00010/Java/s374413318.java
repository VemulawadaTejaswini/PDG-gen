import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			double x1,y1,x2,y2,x3,y3;
			
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			
			double a1, a2, b1, b2, c1, c2, px, py;

			a1 = 2 * (x2 - x1);
			b1 = 2 * (y2 - y1);
			c1 = x1*x1 - x2*x2 + y1*y1 - y2*y2;
			
			a2 = 2 * (x3 - x1);
			b2 = 2 * (y3 - y1);
			c2 = x1*x1 - x3*x3 + y1*y1 - y3*y3;
			
			double temp = a1*b2 - a2*b1;
			
			px = (b1*c2 - b2*c1) / temp;
			py = (c1*a2 - c2*a1) / temp;
			
			double r = Math.sqrt((x1-px)*(x1-px) + (y1-py)*(y1-py));
			
			System.out.printf("%.3f %.3f %.3f", px, py, r);
		}
	}
}