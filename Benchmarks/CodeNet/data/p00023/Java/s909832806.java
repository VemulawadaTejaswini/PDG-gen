import java.util.Scanner;


public class Main {

	public static boolean eq(double a, double b) {
		return Math.abs(b-a) < 1e-10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0 ; i < n ; i++) {
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();

			double ab = Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));

			int sgn;
			if (ra > rb) {
				sgn = +1;
			} else {
				sgn = -1;
				double t = ra;
				ra = rb;
				rb = t;
			}

			if (ab > (ra+rb)) {
				System.out.println(0);
			} else if (eq(ab, ra+rb)) {
				System.out.println(1);
			} else if (ab < ra-rb) {
				System.out.println(sgn*2);
			} else {
				System.out.println(1);
			}

		}


	}
}