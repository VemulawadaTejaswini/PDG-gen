import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		double x;
		double y;
		double theta;

		P(double x, double y, double theta) {
			this.x = x;
			this.y = y;
			this.theta = theta;
		}

		void goForward(double length) {
	//		System.out.println ("gf"+length);
		
			double nx = Math.cos(theta) * length;
			double ny = Math.sin(theta) * length;
			x += nx;
			y += ny;
		}

	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int d = sc.nextInt();

			if ((n | d) == 0) {
				break;
			}
			P p = new P(0, 0, Math.PI / 2);

			for (int i = 0; i < n; i++) {
				double l = sc.nextInt();
				double r = sc.nextInt();
				int t = sc.nextInt();
				if (l == r) {
					p.goForward(l * t / 180.0 * Math.PI);
				} else if (l == -r) {
					l *= t / 180.0 * Math.PI;
					p.theta -= l / d;
				} else if (l == 0) {
					l *= t / 180.0 * Math.PI;
					r *= t / 180.0 * Math.PI;

					double nx =p.x + d * Math.cos(p.theta + Math.PI / 2);
					double ny =p.x + d * Math.sin(p.theta + Math.PI / 2);

					// System.out.println(nx+" "+ny);

					double xx = p.x - nx;
					double yy = p.y - ny;
					double rr = Math.sqrt(xx * xx + yy * yy);
					double rot = 0;
					if (l > r) {
						rot = -(l + r) / (2 * rr);
					} else {
						rot = (1 + r) / (2 * rr);
					}
					rot += Math.atan2(yy, xx);
					p.x = nx + rr * (Math.cos(rot));
					p.y = ny + rr * (Math.sin(rot));
					p.theta = rot - Math.PI/2;

				} else {
					l *= t / 180.0 * Math.PI;
					r *= t / 180.0 * Math.PI;

					double lx = p.x + d * Math.cos(p.theta + Math.PI / 2);
					double ly = p.y + d * Math.sin(p.theta + Math.PI / 2);

					double nx = lx + 2 * d * Math.cos(p.theta - Math.PI / 2)
							* ((double) l / (l - r));
					double ny = ly + 2 * d * Math.sin(p.theta - Math.PI / 2)
							* ((double) l / (l - r));
					
					double xx = p.x - nx;
					double yy = p.y - ny;

					double rr = Math.sqrt(xx * xx + yy * yy);

					double rot = 0;

					if (Math.abs(l) > Math.abs(r)) {
						rot += -(l + r) / (2 * rr);
					} else {
						rot += (l + r) / (2 * rr);

					}
	//				System.out.println(nx+" "+ny+" r"+rr);
					rot += Math.atan2(yy, xx);

					p.x = nx + rr * (Math.cos(rot));
					p.y = ny + rr * (Math.sin(rot));
					p.theta = rot-Math.PI/2;
				}
	//			System.out.println(p.x + " " + p.y + " " + p.theta);
			}
			System.out.println(p.x);
			System.out.println(p.y);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}