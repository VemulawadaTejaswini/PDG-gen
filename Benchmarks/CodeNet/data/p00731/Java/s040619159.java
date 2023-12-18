import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[][][] ft = new boolean[2][5][7];

	class State implements Comparable<State> {
		int i;
		int j;
		int foot;
		int cost;

		State(int i, int j, int foot, int cost) {
			this.i = i;
			this.j = j;
			this.foot = foot;
			this.cost = cost;
		}

		@Override
		public int compareTo(State arg0) {
			return this.cost - arg0.cost;
		}
	}

	class ij {
		int i;
		int j;

		ij(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public boolean equals(Object obj) {
			return ((ij) obj).i == i && ((ij) obj).j == j;
		}
	}

	void run() {
		ft[0][0][4] = true;
		ft[0][1][4] = true;
		ft[0][1][5] = true;
		ft[0][2][4] = true;
		ft[0][2][5] = true;
		ft[0][2][6] = true;
		ft[0][3][4] = true;
		ft[0][3][5] = true;
		ft[0][4][4] = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				ft[1][i][j] = ft[0][i][6 - j];
			}
		}

		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			int[][] map = new int[h + 4][w + 6];

			int[][][] cost = new int[h + 4][w + 6][2];
			for (int i = 0; i < cost.length; i++) {
				for (int j = 0; j < cost[i].length; j++) {
					cost[i][j][0] = Integer.MAX_VALUE >> 2;
					cost[i][j][1] = Integer.MAX_VALUE >> 2;
				}
			}

			LinkedList<ij> goal = new LinkedList<ij>();
			PriorityQueue<State> Q = new PriorityQueue<State>();
			for (int i = 2; i < h + 2; i++) {
				for (int j = 3; j < w + 3; j++) {
					if (sc.hasNextInt()) {
						map[i][j] = sc.nextInt();
					} else {
						String a = sc.next();
						if (a.equals("S")) {
							map[i][j] = -2;
							Q.add(new State(i, j, 0, 0));
							Q.add(new State(i, j, 1, 0));
							cost[i][j][0] = 0;
							cost[i][j][1] = 0;
						}
						if (a.equals("T")) {
							map[i][j] = -3;
							goal.add(new ij(i, j));
						}
					}
				}
			}

			int ans = -1;
			for (; !Q.isEmpty();) {
				State s = Q.poll();

				if (goal.contains(new ij(s.i, s.j))) {
					if (ans == -1 ||ans > s.cost) {
						ans = s.cost;
					}
					continue;
				}

				if (s.cost < cost[s.i][s.j][s.foot]) {
					continue;
				}

				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 7; j++) {
						if (ft[s.foot ^ 1][i][j]) {
							int mvalue = map[s.i + i - 2][s.j + j - 3];
							if (mvalue == 0) {
								continue;
							}
							if (mvalue < 0) {
								mvalue = 0;
							}
							if (cost[s.i + i - 2][s.j + j - 3][1 - s.foot] > s.cost
									+ mvalue) {
								cost[s.i + i - 2][s.j + j - 3][1 - s.foot] = s.cost
										+ mvalue;
								Q.add(new State(s.i + i - 2, s.j + j - 3,
										1 - s.foot, cost[s.i + i - 2][s.j + j
												- 3][1 - s.foot]));
							}
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}