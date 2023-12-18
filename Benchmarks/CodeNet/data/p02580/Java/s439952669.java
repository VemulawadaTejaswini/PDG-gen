import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int M = sc.nextInt();
			int[] h = new int[H];
			int[] w = new int[W];
			Set<Integer> hset = new HashSet<>();
			Set<Integer> wset = new HashSet<>();
			Set<Point> pset = new HashSet<>();
			for (int i = 0; i < M; i++) {
				int tmph = sc.nextInt() - 1;
				int tmpw = sc.nextInt() - 1;
				hset.add(tmph);
				wset.add(tmpw);
				h[tmph]++;
				w[tmpw]++;
				pset.add(new Point(tmph, tmpw));
			}
			int max = 0;
			for (int i : hset) {
				for (int j : wset) {
					int tmp = h[i] + w[j];
					if (pset.contains(new Point(i, j))) {
						tmp--;
					}
					max = Math.max(max, tmp);
				}
			}
			System.out.println(max);
		}
	}

	static class Point {
		int h;
		int w;

		public Point(int h, int w) {
			this.h = h;
			this.w = w;
		}

		@Override
		public boolean equals(Object o) {
			Point p = (Point) o;
			return this.h == p.h && this.w == p.w;
		}

		@Override
		public int hashCode() {
			int val = 31;
			val += 31 * val + h;
			val += 31 * val + w;
			return val;
		}
	}
}