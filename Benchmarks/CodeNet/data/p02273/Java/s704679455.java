import java.util.Scanner;

public class Main {

	static double _theta = Math.PI / 6;
	static double _2r3 = 2 * Math.sqrt(3);
	static double _6sub2r3 = 6 - _2r3;
	static Main m = new Main();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Vec right = m.new Vec(0, 0);
		Vec left = m.new Vec(100, 0);
		koch(n, right, left);
		System.out.println(left);
	}

	static void koch(int n, Vec l, Vec r) {
		if (n == 0) {
			System.out.println(l);
			return;
		}
		Vec inleft = m.new Vec((2 * l.x + r.x) / 3, (2 * l.y + r.y) / 3);
		double tmpx = (_6sub2r3 * l.x + _2r3 * r.x) / 6 - l.x;
		double tmpy = (_6sub2r3 * l.y + _2r3 * r.y) / 6 - l.y;
		double x = tmpx * Math.cos(_theta) - tmpy * Math.sin(_theta) + l.x;
		double y = tmpx * Math.sin(_theta) + tmpy * Math.cos(_theta) + l.y;
		Vec incent = m.new Vec(x, y);
		Vec inright = m.new Vec((l.x + 2 * r.x) / 3, (l.y + 2 * r.y) / 3);
		koch(n - 1, l, inleft);
		koch(n - 1, inleft, incent);
		koch(n - 1, incent, inright);
		koch(n - 1, inright, r);
	}

	class Vec {
		double x = 0;
		double y = 0;

		public Vec(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return new StringBuilder(30).append(x).append(' ').append(y).toString();
		}
	}
}
