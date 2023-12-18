import java.util.Scanner;
import java.lang.Math;

public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		double  a = scan.nextDouble();
		double  b = scan.nextDouble();
		double  h = scan.nextDouble();
		double  m = scan.nextDouble();
		double ans = 0;
		if(h == 0 && m == 0) {
			System.out.print(ans);
			return;
		}
		h = h * 30 + m * 0.5;
		m = m * 6;
		double angle = h - m;
		if(h - m < 0 || h - m > 180) {
			angle = m - h;
		}
		double result = a*a + b*b -2*a*b*Math.cos(Math.toRadians(angle));
		System.out.println(Math.sqrt(result));
	}
}