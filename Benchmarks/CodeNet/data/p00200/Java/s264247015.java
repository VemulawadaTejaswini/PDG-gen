import java.util.*;


public class Main {
	
	int n, m, k, start, goal, r;
	int[] a, b, cost, time;
	
	final int INF = 1001;
	List<int[]>[] G;
	int[] min;
	
	int dijkstra() {
		Queue<int[]> que = new LinkedList<int[]>();
		min[start] = 0;
		que.offer(new int[]{0, start}); // m:cost, n:station
		
		while (!que.isEmpty()) {
			int[] p = que.poll();
			int from = p[1];
			if (min[from] < p[0]) continue;
			for (int i = 0; i < G[from].size(); i++) {
				int[] n = G[from].get(i);
				int cost = n[0];
				int to = n[1];
				int total = min[from] + cost;
				if (total < min[to]) {
					min[to] = total;
					que.offer(new int[]{total, to});
				}
			}
		}
		return min[goal];
	}
	
	@SuppressWarnings("unchecked")
	int solve() {
		min = new int[m + 1];
		for (int i = 1; i < min.length; i++) {
			min[i] = INF;
		}
		
		G = new ArrayList[m + 1]; 
		for (int i = 1; i < G.length; i++) {
			G[i] = new ArrayList<int[]>();
		}
		
		if (r == 0) {
			for (int i = 0; i < G.length; i++) {
				G[a[i]].add(new int[] {cost[i], b[i]});
				G[b[i]].add(new int[] {cost[i], a[i]});
			}
			return dijkstra();
		} else {
			for (int i = 0; i < G.length; i++) {
				G[a[i]].add(new int[] {time[i], b[i]});
				G[b[i]].add(new int[] {time[i], a[i]});
			}
			return dijkstra();
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
				a = new int[n];
				b = new int[n];
				cost = new int[n];
				time = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
					b[i] = sc.nextInt();
					cost[i] = sc.nextInt();
					time[i] = sc.nextInt();
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