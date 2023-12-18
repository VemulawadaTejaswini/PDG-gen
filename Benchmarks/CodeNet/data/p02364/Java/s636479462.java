import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static  Map<Integer, List<int[]>> adj = new HashMap<Integer, List<int[]>>();
	static int V, E;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		// 隣接リストの作成
		for(int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			// s -> v
			if(adj.containsKey(s)) {
				int[]pair = {v, w};
				adj.get(s).add(pair);
			}else {
				List<int[]> list = new ArrayList<int[]>();
				int[]pair = {v, w};
				list.add(pair);
				adj.put(s, list);
			}
			// v -> s
			if(adj.containsKey(v)) {
				int[]pair = {s, w};
				adj.get(v).add(pair);
			}else {
				List<int[]> list = new ArrayList<int[]>();
				int[]pair = {s, w};
				list.add(pair);
				adj.put(v, list);
			}
		}
		sc.close();
		int ans = prim();
		System.out.println(ans);

	}
	static class Edge implements Comparable<Edge>{
		int from;
		int to;
		int cost;
		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Edge e) {
			return this.cost - e.cost;
		}
	}
	static int prim() {
		int totalCost = 0;
		boolean[] color = new boolean[V];
		Queue<Edge> pq = new PriorityQueue<Edge>();
		pq.add(new Edge(0, 0, 0));
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(color[e.to]) continue;
			color[e.to] = true;
			totalCost += e.cost;
			if(adj.containsKey(e.to)) {
				List<int[]> list = adj.get(e.to);
				for(int i = 0; i < list.size(); i++) {
					pq.add(new Edge(e.from, list.get(i)[0], list.get(i)[1]));
				}
			}
		}
		return totalCost;
	}
}
