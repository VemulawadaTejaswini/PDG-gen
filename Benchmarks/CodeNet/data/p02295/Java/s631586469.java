import java.util.Arrays;
import java.util.Scanner;

public class Main {

	class P {
		double x, y;

		P(double x_, double y_) {
			x = x_;
			y = y_;
		}

		P add(P p) {
			return new P(x + p.x, y + p.y);
		}

		P sub(P p) {
			return new P(x - p.x, y - p.y);
		}

		P mul(double v) {
			return new P(x * v, y * v);
		}

		P div(double v) {
			return new P(x / v, y / v);
		}

		double dot(P p) {
			return x * p.x + y * p.y;
		}

		double det(P p) {
			return x * p.y - y * p.x;
		}

		double abs2() {
			return x * x + y * y;
		}

		double abs() {
			return Math.sqrt(abs2());
		}

		P norm() {
			return div(abs());
		}

		P rot90() {
			return new P(-y, x);
		}

		P proj(P src, P dst) {
			P p_sd = dst.sub(src).norm();
			return src.add(p_sd.mul(sub(src).dot(p_sd)));
		}

		P reflect(P src, P dst) {
			P middle = proj(src, dst);
			return add(middle.sub(this).mul(2));
		}

		public String toString() {
			return String.format("%f %f", x, y);
		}
	}

	P isLL(P p1, P p2, P q1, P q2) {
		double d = p2.sub(p1).det(q1.sub(q2));
		if (Math.abs(d) < 1e-10)
			return null;
		return p1.add(p2.sub(p1).mul(q1.sub(q2).det(p1.sub(q2)) / d));
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			P p1 = new P(sc.nextDouble(), sc.nextDouble());
			P p2 = new P(sc.nextDouble(), sc.nextDouble());
			P q1 = new P(sc.nextDouble(), sc.nextDouble());
			P q2 = new P(sc.nextDouble(), sc.nextDouble());

			P x = isLL(p1, p2, q1, q2);
			System.out.println(String.format("%.20f %.20f", x.x, x.y));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}