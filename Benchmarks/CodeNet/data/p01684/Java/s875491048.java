import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double uw = sc.nextInt();
			double uh = sc.nextInt();
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			if (a == 0) {
				break;
			}
			if (a < b) {
				double temp = a;
				a = b;
				b = temp;
			}
			a = Math.sqrt(a/Math.PI);
			b = Math.sqrt(b/Math.PI);
			if (a * 2 > uw || a * 2 > uh) {
				System.out.println("impossible");
				return;
			}
			double dx = uw - a - b;
			double dy = uh - a - b;
			double dmax = Math.sqrt(dx * dx + dy * dy);
			double left = 0;
			double right = dmax;
			double s = 0;
			while(right-left >= 1E-5) {
				double d = (right + left) / 2;
				double t1 = Math.acos((a * a + d * d - b * b) / 2 * d * a);
				double t2 = Math.acos((b * b + d * d - a * a) / 2 * d * b);
				s = a * a * t1 + b * b * t2 - 2 * d * a * t1;
				if (s > c) {
					left = d;
				}else{
					right = d;
				}
			}
			double d = (right + left) / 2;
			if (Math.abs(c-s) > 0.0001) {
				System.out.println("impossible");
				return;
			}
			double xa = a;
			double ya = a;
			double xb = a + d * (dx / dmax);
			double yb = a + d * (dy / dmax);
			System.out.println(xa + " " + ya + " " + a + " " + xb + " " + yb + " " + b);
		}
	}

}