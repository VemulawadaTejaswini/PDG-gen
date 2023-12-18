import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		double cx = sc.nextDouble();
		double cy = sc.nextDouble();
		double r = sc.nextDouble();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			System.out.println(solve(cx, cy, r, x1, y1, x2, y2));
		}
		sc.close();
	}

	static class Vector2d {
		Vector2d(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double x;
		double y;

		public String toString() {
			return String.format("%1$.6f %2$.6f", x, y);
		}

		public static double product(Vector2d v1, Vector2d v2) {
			return v1.x;
		}

	}

	static class Vector2dComparator implements Comparator<Vector2d> {
		@Override
		public int compare(Vector2d v1, Vector2d v2) {
			double x = v1.x - v2.x;
			double y = v1.y - v2.y;
			if (x == 0) {
				if (y < 0) {
					return -1;
				} else {
					return 1;
				}
			} else if (x < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	public static String solve(double cx, double cy, double r, double x1, double y1, double x2, double y2) {
		List<Vector2d> ans = new ArrayList<>();
		double lx = x2 - x1;
		double ly = y2 - y1;
		double pcx = cx - x1;
		double pcy = cy - y1;
		double lSqNorm = lx * lx + ly * ly;
		double discriminant = Math.sqrt(r * r * lSqNorm - Math.pow(lx * pcy - ly * pcx, 2));
		double k1 = (lx * pcx + ly * pcy + discriminant) / lSqNorm;
		double k2 = (lx * pcx + ly * pcy - discriminant) / lSqNorm;
		ans.add(new Vector2d(x1 + k1 * (x2 - x1), y1 + k1 * (y2 - y1)));
		ans.add(new Vector2d(x1 + k2 * (x2 - x1), y1 + k2 * (y2 - y1)));
		ans.sort(new Vector2dComparator());
		return String.format("%1$.8f %2$.8f %3$.8f %4$.8f", ans.get(0).x, ans.get(0).y, ans.get(1).x, ans.get(1).y);
	}


}

