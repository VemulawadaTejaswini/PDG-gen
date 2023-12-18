import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Vector2d> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			p.add(new Vector2d(x, y));
		}
		sc.close();
		p.sort(new Vector2dComparator());
		System.out.println(String.format("%1$.7f", solve(p)));
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

		public static double norm(Vector2d v1, Vector2d v2) {
			return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2));
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

	public static double solve(List<Vector2d> p) {

		double d;
		if (p.size() == 1) {
			// 点が1個の場合は距離∞
			d = Double.MAX_VALUE;
		} else if (p.size() == 2) {
			// 点が2個の場合は普通に計算
			d = Vector2d.norm(p.get(0), p.get(1));
		} else {
			// 3個以上の場合は、まず左半分と右半分の最小距離の小さい方
			double dTemp = Math.min(solve(p.subList(0, p.size() / 2)), solve(p.subList(p.size() / 2, p.size())));
			// そのあと、左と右の間でdを更新できるペアを探す
			// 左右間ペア候補を絞る
			double midX = p.get(p.size() / 2).x;
			List<Vector2d> yl = p.stream().filter(v -> 0 < midX - v.x && midX - v.x <= dTemp).collect(Collectors.toList());
			List<Vector2d> yr = p.stream().filter(v -> 0 <= v.x - midX && v.x - midX <= dTemp).collect(Collectors.toList());
			// 左右間ペアでdを更新
			d = updateByLRPair(yl, yr, dTemp);
		}
		return d;
	}

	// 左右間ペアでdを更新
	public static double updateByLRPair(List<Vector2d> yl, List<Vector2d> yr, double d) {
		double ans = d;
		for(Vector2d vl: yl) {
			for(Vector2d vr: yr.stream().filter(v -> Math.abs(v.y - vl.y) <= d).collect(Collectors.toList())) {
				if(ans > Vector2d.norm(vl, vr)) {
					ans = Vector2d.norm(vl, vr);
				}

			}
		}
		return ans;
	}

}

