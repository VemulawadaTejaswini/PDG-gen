import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	private static class Edge implements Comparable<Edge> {
		int cost = Integer.MAX_VALUE;
		int from;
		int to;

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<List<Edge>> G = new ArrayList<List<Edge>>();
		for (int i = 0; i < n; i++) {
			G.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < n; i++) {
			String line = br.readLine().trim();
			String[] nums = line.split(" ");
			int k = Integer.parseInt(nums[1]);
			for (int j = 0; j < k; j++) {
				Edge e = new Edge();
				e.to = Integer.parseInt(nums[2 + j * 2]);
				e.cost = Integer.parseInt(nums[2 + j * 2 + 1]);
				G.get(i).add(e);
			}
		}

		PriorityQueue<Edge> q = new PriorityQueue<Edge>();
		long[] cost = new long[n];
		cost[0] = 0;
		for (int i = 1; i < n; i++) {
			cost[i] = Integer.MAX_VALUE;
		}
		Edge s = new Edge();
		s.cost = 0;
		s.from = 0;
		q.offer(s);

		while (!q.isEmpty()) {
			Edge e = q.poll();
			int v = e.from;
			if (cost[v] < e.cost) {
				continue;
			}

			List<Edge> adjs = G.get(v);
			for (int i = 0; i < adjs.size(); i++) {
				Edge adj = adjs.get(i);
				if (cost[adj.to] > cost[v] + adj.cost) {
					cost[adj.to] = cost[v] + adj.cost;
					Edge to = new Edge();
					to.cost = (int) cost[adj.to];
					to.from = adj.to;
					q.offer(to);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + cost[i]);
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}
}