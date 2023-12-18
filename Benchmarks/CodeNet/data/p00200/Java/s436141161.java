import java.util.*;


public class Main {
	
	int n, m, k, start, goal, r;
	int[][] cost, time;
	
	final int INF = Integer.MAX_VALUE;
	int[] min;
	
	int dijkstra(int[][] V) {
		int[] min = new int[m + 1];
		Arrays.fill(min, INF);
		min[start] = 0;
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.offer(new int[]{start, 0});
		while (!que.isEmpty()) {
			int[] p = que.poll();
			int from = p[0];
			if (min[from] < p[1]) continue;
			for (int to = 1; to <= m; to++) {
				int v = V[from][to];
				if (v != INF && min[from] + v < min[to]) {
					min[to] = min[from] + v;
					que.offer(new int[]{to, min[to]});
				}
			}
		}
		return min[goal];
	}
	
	int solve() {
		if (r == 0) {
			return dijkstra(cost);
		} else {
			return dijkstra(time);
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			} else {
				cost = new int[m + 1][m + 1];
				time = new int[m + 1][m + 1];
				for (int i = 1; i <= m; i++) {
					Arrays.fill(cost[i], INF);
					Arrays.fill(time[i], INF);
				}
				for (int i = 0; i < n; i++) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					int c = sc.nextInt();
					int t = sc.nextInt();
					cost[a][b] = c;
					cost[b][a] = c;
					time[a][b] = t;
					time[b][a] = t;
				}
				k = sc.nextInt();
				for (int i = 0; i < k; i++) {
					start = sc.nextInt();
					goal = sc.nextInt();
 					r = sc.nextInt();
					output += solve() + "\n";
				}
			}
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}