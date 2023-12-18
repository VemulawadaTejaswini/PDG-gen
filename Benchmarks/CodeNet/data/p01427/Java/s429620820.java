import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	double EPS = 1e-8;

	void solver() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] table = new char[h][w];
		for (int i = h - 1; i >= 0; i--) {
			table[i] = sc.next().toCharArray();
		}
		ArrayList<Pair> vd = new ArrayList<>();
		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= w; j++) {
				int cnt = 0;
				for (int k = 0; k < 4; k++) {
					int ni = i - k % 2;
					int nj = j - k / 2;
					if (0 <= ni && ni < h && 0 <= nj && nj < w && table[ni][nj] == '#')
						cnt++;
					if (cnt % 2 == 1) {
						if (0 <= i - 1 && i - 1 < h && 0 <= j && j < w && table[i - 1][j] == (cnt == 1 ? '#' : '.')) {
							// # .		. #
							// # #		. .
							vd.add(new Pair((double) j / (double) i, 1));
						}
						if (0 <= i && i < h && 0 <= j - 1 && j - 1 < w && table[i][j - 1] == (cnt == 1 ? '#' : '.')) {
							// # #		. .
							// . # 		# .
							vd.add(new Pair((double) j / (double) i, -1));
						}
					}
				}
			}
		}
		vd.sort(null);
		int res = 1, cur = 1;
		for (int i = 0; i < vd.size(); i++) {
			int idx = i;
			while (idx < vd.size() && Math.abs(vd.get(i).a - vd.get(idx).a) < EPS) {
				cur += vd.get(idx++).b;
			}
			i = idx;
			res = Math.max(cur, res);
		}
		System.out.println(res);
	}

	class Pair implements Comparable<Pair> {
		double a;
		int b;

		Pair(double a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			return Double.compare(this.a, o.a);
		}
	}
}