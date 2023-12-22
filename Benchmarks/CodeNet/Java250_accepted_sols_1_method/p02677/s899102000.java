import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		final double PI = Math.PI;
		double ht = ((h*60+m)/720 )*2*PI;
		double mt = (m/60)*2*PI;
		double hx = a*Math.cos(ht);
		double hy = a*Math.sin(ht);
		double mx = b*Math.cos(mt);
		double my = b*Math.sin(mt);
		
		double dx = hx-mx;
		double dy = hy-my;

		double ans = Math.sqrt(dx*dx+dy*dy);
		System.out.printf("%.10f", ans);
	}
}
