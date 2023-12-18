import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			Circle[] info = new Circle[N];
			for (int i = 0; i < N; i++) {
				info[i] = new Circle(sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble());
			}
			double min = Integer.MAX_VALUE;
			double dist = 0;
			Arrays.sort(info, new CircleComparator());
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (j > i + 100) {
						break;
					}
					dist = Math.hypot(info[i].x - info[j].x, info[i].y
							- info[j].y);
					min = Math.min(min, dist - info[i].r - info[j].r);
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	class Circle {
		double r;
		double x;
		double y;

		Circle(double r, double x, double y) {
			this.r = r;
			this.x = x;
			this.y = y;
		}
	}

	class CircleComparator implements Comparator<Circle> {
		public int compare(Circle p1, Circle p2) {
			double cmp = p1.x - p2.x;
			if (cmp == 0)
				cmp = p1.y - p2.y;
			if (cmp < 0)
				cmp = -1;
			else
				cmp = 1;
			return (int) cmp;
		}
	}
}