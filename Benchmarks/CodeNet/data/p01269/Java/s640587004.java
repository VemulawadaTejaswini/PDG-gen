import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int L = sc.nextInt();
			int[][] d = new int[N][N];
			int[][] e = new int[N][N];
			for (int i = 0; i < M; ++i) {
				int A = sc.nextInt() - 1;
				int B = sc.nextInt() - 1;
				int D = sc.nextInt();
				d[A][B] = d[B][A] = D;
				int E = sc.nextInt();
				e[A][B] = e[B][A] = E;
			}
			boolean[][] visited = new boolean[N][L + 1];
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(0, L, 0));
			while (true) {
				State cur = q.poll();
				if (visited[cur.p][cur.m]) continue;
				visited[cur.p][cur.m] = true;
				if (cur.p == N - 1) {
					System.out.println(cur.e);
					break;
				}
				for (int i = 0; i < N; ++i) {
					if (d[cur.p][i] == 0) continue;
					if (!visited[i][cur.m]) {
						q.add(new State(i, cur.m, cur.e + e[cur.p][i]));
					}
					if (d[cur.p][i] <= cur.m && !visited[i][cur.m - d[cur.p][i]]) {
						q.add(new State(i, cur.m - d[cur.p][i], cur.e));
					}
				}
			}
		}
	}

	static class State implements Comparable<State> {
		int p, m, e;

		public State(int p, int m, int e) {
			this.p = p;
			this.m = m;
			this.e = e;
		}

		public int compareTo(State o) {
			return this.e - o.e;
		}
	}

}