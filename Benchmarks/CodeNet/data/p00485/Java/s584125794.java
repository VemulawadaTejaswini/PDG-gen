import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[][] g = new int[N][N];
		for (int i = 0; i < M; ++i) {
			int a = Integer.parseInt(sc.next()) - 1;
			int b = Integer.parseInt(sc.next()) - 1;
			int l = Integer.parseInt(sc.next()) * 2;
			g[a][b] = g[b][a] = l;
		}
		PriorityQueue<Long> q = new PriorityQueue<Long>();
		for (int i = 0; i < K; ++i) {
			q.add(Long.parseLong(sc.next()) - 1);
		}
		int[] dist = new int[N];
		Arrays.fill(dist, -1);
		int ans = 0;
		while (!q.isEmpty()) {
			long st = q.poll();
			int t = (int) st;
			long d = st >> 32;
			if (dist[t] >= 0) continue;
			dist[t] = (int) d;
			ans = (int) d;
			for (int i = 0; i < N; ++i) {
				if (dist[i] == -1 && g[t][i] > 0) {
					q.add(((d + g[t][i]) << 32) + i);
				}
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if (g[i][j] == 0) continue;
				ans = Math.max(ans, (dist[i] + dist[j] + g[i][j]) / 2);
			}
		}
		System.out.println((ans + 1) / 2);
	}
}