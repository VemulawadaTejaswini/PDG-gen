import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, K;
	static int[][] g;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			K = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			g = new int[N][N];
			for (int[] a : g) {
				Arrays.fill(a, Integer.MAX_VALUE);
			}
			for (int i = 0; i < K; ++i) {
				int t = sc.nextInt();
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				if (t == 0) {
					System.out.println(calc(a, b));
				} else {
					int c = sc.nextInt();
					g[a][b] = g[b][a] = Math.min(g[a][b], c);
				}
			}
		}
	}

	static int calc(int start, int goal) {
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(new State(start, 0));
		int[] best = new int[N];
		Arrays.fill(best, Integer.MAX_VALUE);
		while (!q.isEmpty()) {
			State cur = q.poll();
			if (cur.pos == goal) return cur.cost;
			for (int i = 0; i < N; ++i) {
				if (g[cur.pos][i] == Integer.MAX_VALUE) continue;
				int nc = cur.cost + g[cur.pos][i];
				if (nc < best[i]) {
					q.add(new State(i, nc));
					best[i] = nc;
				}
			}
		}
		return -1;
	}

	static class State implements Comparable<State> {
		int pos, cost;

		State(int pos, int cost) {
			this.pos = pos;
			this.cost = cost;
		}

		public int compareTo(State o) {
			return this.cost - o.cost;
		}
	}

}