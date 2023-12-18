import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class line {
		double x1, x2;
		double y1, y2;

		line(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}

		line(line a) {
			x1 = a.x1;
			x2 = a.x2;
			y1 = a.y1;
			y2 = a.y2;
		}

		void shift(double x, double y) {
			x1 -= x;
			x2 -= x;
			y1 -= y;
			y2 -= y;
		}

		void rot(double x, double y) {
			line t = new line(this);

			y1 = t.x1 * y - t.y1 * x;

			y2 = t.x2 * y - t.y2 * x;
		}

		boolean cross(line tar) {
			line t = new line(this);
			line r = new line(tar);

			r.shift(t.x1, t.y1);
			t.shift(t.x1, t.y1);

			r.rot(t.x2, t.y2);
			if (r.y1 * r.y2 < 0) {
				return true;
			}
			return false;
		}
	}

	void run() {
		int n = sc.nextInt();
		for (int z = 0; z < n; z++) {
			int x[] = new int[5];
			int y[] = new int[5];

			for (int i = 0; i < 5; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			line[] tri = new line[3];
			for (int i = 0; i < 3; i++) {
				int j = i % 3;
				int k = (i + 1) % 3;
				tri[i] = new line(x[j], y[j], x[k], y[k]);
			}
			line tar = new line(x[3], y[3], x[4], y[4]);

			int cross = 0;
			for (int i = 0; i < 3; i++) {
				if (tri[i].cross(tar)) {
					if (tar.cross(tri[i])) {
						cross++;
					}
				}
			}
			System.out.println(
					(cross == 1 ? "OK" : "NG"));
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}