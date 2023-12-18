import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class State implements Comparable<State> {
		double t;
		int c, v, pre;

		State(double t, int c, int v, int pre) {
			this.t = t;
			this.c = c;
			this.v = v;
			this.pre = pre;
		}

		@Override
		public int compareTo(State arg0) {
			return this.t - arg0.t > 0 ? 1 : -1;
		}

	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			n++;
			int[][] d = new int[n][n];
			int[][] c = new int[n][n];
			double[][] t = new double[n][31];
			for (int j = 0; j < n; j++) {
				Arrays.fill(d[j], Integer.MAX_VALUE >> 3);
				Arrays.fill(c[j], 0);
				Arrays.fill(t[j], Double.MAX_VALUE / 4);
			}
			int s = sc.nextInt();
			int g = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int d1 = sc.nextInt();
				int c1 = sc.nextInt();
				d[x][y] = d1;
				d[y][x] = d1;
				c[x][y] = c1;
				c[y][x] = c1;
			}

			PriorityQueue<State> q = new PriorityQueue<State>();

			t[s][0] = 0;
			q.add(new State(0, s, 0, -1));
			while (!q.isEmpty()) {
				State pop = q.poll();
				if (t[pop.c][pop.v] < pop.t) {
					continue;
				}
				if (pop.c == g && pop.v == 1)
					continue;
				for (int i = 1; i < n; i++) {
					if (pop.pre == i) {
						continue;
					}
					for (int dv = -1; dv <= 1; dv++) {
						int nv = pop.v + dv;
						if (nv > 30) {
							continue;
						}
						if (nv <= 0) {
							continue;
						}
						if (c[pop.c][i] < nv) {
							continue;
						}

						double dt = (double) d[pop.c][i] / (double) (nv);
						if (t[i][nv] > t[pop.c][pop.v] + dt) {
							t[i][nv] = t[pop.c][pop.v] + dt;
							q.add(new State(t[i][nv], i, nv, pop.c));
						}
					}
				}
			}
			if (t[g][1] >= Double.MAX_VALUE / 4) {
				System.out.println("unreachable");
			} else {
				System.out.println(t[g][1]);
			}
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}