import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			g[v].add(u);
		}
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int[][] d = new int[n][3];
		for (int i = 0; i < d.length; i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
		}

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{s, 0});
		d[s][0] = 0;

		while (!q.isEmpty()) {
			int[] vx = q.poll();
			int v = vx[0];
			int state = vx[1];
			int next = (vx[1] + 1) % 3;
			for (int i = 0; i < g[v].size(); i++) {
				if (d[g[v].get(i)][next] != Integer.MAX_VALUE) continue;
				d[g[v].get(i)][next] = d[v][state] + 1;
				q.offer(new int[]{g[v].get(i), next});
			}
		}

		if (d[t][0] == Integer.MAX_VALUE) {
			System.out.println(-1);
			return;
		}

		System.out.println(d[t][0] / 3);
	}
}
