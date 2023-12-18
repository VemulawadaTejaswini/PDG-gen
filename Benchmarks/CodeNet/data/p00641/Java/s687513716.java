import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static final int MOD = 10007;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Path[][] path = new Path[N][2];
			for (int i = 0; i < N; ++i) {
				int p = sc.nextInt();
				int v = sc.nextInt();
				path[i][0] = new Path(i, p, v);
				p = sc.nextInt();
				v = sc.nextInt();
				path[i][1] = new Path(i, p, v);
			}
			boolean[] visited = new boolean[N];
			int ans = 1;
			for (int i = 0; i < N; ++i) {
				if (visited[i]) continue;
				Path cur = path[i][0];
				visited[i] = true;
				int max = cur.val;
				int maxC = 1;
				int size = 1;
				while (true) {
					if (visited[cur.to]) break;
					++size;
					if (path[cur.to][0].to == cur.from) {
						cur = path[cur.to][1];
					} else {
						cur = path[cur.to][0];
					}
					if (cur.val > max) {
						max = cur.val;
						maxC = 1;
					} else if (cur.val == max) {
						++maxC;
					}
				}
				ans *= maxC;
				ans %= MOD;
			}
			System.out.println(ans);
		}
	}

	static class Path {
		int from;
		int to;
		int val;

		Path(int from, int to, int val) {
			this.from = from;
			this.to = to;
			this.val = val;
		}
	}

}