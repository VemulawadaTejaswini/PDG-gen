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
		// 0時0分
		if(h == 0 && m == 0) {
			System.out.println(ans);
			return;
		}
		h = h * 30 + m * 0.5;
		m = m * 6;
		double angle = h - m;
		// 重なっている場合
		if(angle == 0) {
			System.out.println(ans);
			return;
		} else if(angle == 180) {
			System.out.println(a+b);
			return;
		}
		if(angle < 0 || angle > 180) {
			angle = m - h;
		}
		ans = a*a + b*b -2*a*b*Math.cos(angle/180*Math.PI);
		System.out.println(Math.sqrt(ans));
	}
}