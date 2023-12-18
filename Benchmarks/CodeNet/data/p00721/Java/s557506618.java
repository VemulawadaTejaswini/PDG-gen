
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	class E {
		int from;
		int to;
		int cost;

		E(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}

	class V {
		int x;
		int y;

		V(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	int wh(int w, int i, int j) {
		return (j * w + i);
	}

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if ((w | h) == 0) {
				break;
			}

			char map[][] = new char[h][w];
			LinkedList<V> node = new LinkedList<V>();
			int dp[][] = new int[w * h][w * h];
			for (int i = 0; i < w * h; i++) {
				Arrays.fill(dp[i], Integer.MAX_VALUE / 4);
			}
			for (int i = 0; i < h; i++) {
				String buffer = sc.nextLine();
				map[i] = buffer.toCharArray();
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '*') {
						node.addLast(new V(j, i));
					}
					if (map[i][j] == 'o') {
						node.addFirst(new V(j, i));
					}
					if (map[i][j] != 'x') {
						if (h > j + 1) {
							dp[wh(w, i, j)][wh(w, i, j + 1)] = 1;
							dp[wh(w, i, j + 1)][wh(w, i, j)] = 1;
						}
						if (w > i + 1) {
							dp[wh(w, i, j)][wh(w, i + 1, j)] = 1;
							dp[wh(w, i + 1, j)][wh(w, i, j)] = 1;
						}
						if (0 < j) {
							dp[wh(w, i, j)][wh(w, i, j - 1)] = 1;
							dp[wh(w, i, j - 1)][wh(w, i, j)] = 1;
						}
						if (0 < i) {
							dp[wh(w, i, j)][wh(w, i - 1, j)] = 1;
							dp[wh(w, i - 1, j)][wh(w, i, j)] = 1;
						}
					}
				}
			}
			int wh = w * h;
			for (int i = 0; i < wh; i++) {
				for (int j = 0; j < wh; j++) {
					for (int k = 0; k < wh; k++) {
						dp[i][j] = Math.min(dp[i][k] + dp[k][j], dp[i][j]);
					}
				}
			}
			LinkedList<E> hen = new LinkedList<E>();
			boolean mmm = false;
			for (int i = 0; i < node.size(); i++) {
				V temp = node.get(i);
				for (int j = i + 1; j < node.size(); j++) {
					V temp2 = node.get(j);
					int cost = dp[wh(w, temp.x, temp.y)][wh(w,
							temp2.x, temp2.y)];
					hen.add(new E(i, j, cost));
					hen.add(new E(j, i, cost));
					if(cost > 1e5){
						System.out.println(-1);
						mmm = true;
						break;
					}
				}
				if(mmm) break;
			}
			if(mmm){
				continue;
			}
			
			V[] node2 = (V[]) node.toArray();
			int[][] dp2 = new int[1 << node.size()][node.size()];
			dp2[1][0] = 0;
			for (int i = 0; i < 1 << node.size(); i++) {
				for (int prev = 0; prev < node.size(); prev++) {
					int sh = 1 << prev;
					if ((i & sh) != 0) {
						continue;
					}
					int next = (i | sh);
					E a = hen.getFirst();
					for (int l = 0; l < node.size(); l++) {
						for (E e : hen) {
							if (e.from == prev) {
								if (e.to == l) {
									a = e;
									break;
								}
							}
						}
						dp2[next][prev] = Math.min(dp2[next][prev], dp2[i][l]
								+ a.cost);
					}
				}
			}
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < node.size(); i++) {
				res = Math.min(res, dp2[1 << node.size() - 1][i]);
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}