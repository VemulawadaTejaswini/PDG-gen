import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	
	
	void run() {
		int a, b, c, d, e, f;
		double x, y;
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			x = (double)(e*c-b*f)/(a*e-b*d);
			y = (double)(a*f-c*d)/(a*e-b*d);
			if (Math.abs(x) < 10E-5) x = 0.0;
			if (Math.abs(y) < 10E-5) y = 0.0;
			System.out.printf("%.3f %.3f\n",x, y);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}