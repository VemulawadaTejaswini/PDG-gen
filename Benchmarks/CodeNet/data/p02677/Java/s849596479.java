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
		h = h * 30 + m * 0.5;
		m = m * 6;
		double angle = Math.abs(h - m);
		ans = a*a + b*b -2*a*b*Math.cos(angle/180*Math.PI);
		System.out.println(Math.sqrt(ans));
	}
}