import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// aoj DPL_2_A Traveling Salesman Problem
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int v = sc.nextInt();
		int e = sc.nextInt();

		@SuppressWarnings("unchecked")
		List<Edge>[] edges = new List[v];
		for (int i = 0; i < v; i++) {
			edges[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			edges[s].add(new Edge(s, t, d));
		}

		final int INF = Integer.MAX_VALUE;
		int min = INF;
		for (int s = 0; s < v; s++) {
			int[][] dp = new int[v][1 << v];
			for (int[] tmp : dp) {
				Arrays.fill(tmp, INF);
			}
			dp[s][1 << s] = 0;
			
			for (int S = 1; S < 1 << v; S++) {
				for (int j = 0; j < v; j++) {
					if ((S & (1 << j)) == 0 || dp[j][S] == INF) {
						continue;
					}

					for (Edge i : edges[j]) {
						if ((S & (1 << i.v)) != 0) {
							continue;
						}
						
						dp[i.v][S | (1 << i.v)] = Math.min(dp[i.v][S | (1 << i.v)], dp[j][S] + i.w);
					}
				}
			}
			
			for (int i = 0; i < v; i++) {
				for (Edge j : edges[i]) {
					if (j.v != s || j.w == INF || dp[i][(1 << v) - 1] == INF) {
						continue;
					}

					min = Math.min(min, dp[i][(1 << v) - 1] + j.w);
				}
			}
		}

		if (min != INF) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}

		sc.close();
	}

	private static class Edge {
//		int u; // from
		int v; // to
		int w; // cost
		
		Edge(int u, int v, int w) {
//			this.u = u;
			this.v = v;
			this.w = w;
		}
	}
}