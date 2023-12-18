import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static List<List<edge>> graph;

	static int[] d;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		graph = new ArrayList<>();

		d = new int[n];

		for (int i = 0; i < n; i++) {
			String[] node_edge = br.readLine().split(" ");

			int k = Integer.parseInt(node_edge[1]);
			List<edge> node_edges = new ArrayList<>();
			for (int j = 0; j < k; j++) {
				node_edges.add(
						new edge(i, Integer.parseInt(node_edge[2 + j * 2]), Integer.parseInt(node_edge[3 + j * 2])));
			}
			graph.add(node_edges);
		}
		/*
		 * for(int i=0; i<graph.size(); i++){ for(edge e: graph.get(i)){
		 * System.out.println(e.from+""+e.to+""+e.cost); } }
		 */
		dijk(0);

		for (int i = 0; i < d.length; i++) {
			System.out.println(i + " " + d[i]);
		}
	}

	static void dijk(int sx) {

		Arrays.fill(d, Integer.MAX_VALUE / 2);
		d[sx] = 0;

		Queue<node> dq = new PriorityQueue<>();

		dq.offer(new node(0,0));

		while(!(dq.isEmpty())){
			node nd = dq.poll();

			int v = nd.v;

			int now_total_cost = nd.nowcost;

			
			if(d[v] < now_total_cost){
				continue;
			}

			for(edge e: graph.get(v)){
				if(d[e.to]> d[v]+e.cost){
					d[e.to] = d[v]+e.cost;
					dq.offer(new node(e.to,d[e.to]));
				}
			}
		}

	}

	static class node implements Comparable<node>{
		int nowcost;

		int v;
		public node(int node_number, int nowcost) {
			this.v = node_number;
			this.nowcost = nowcost;
		}
		@Override
		public int compareTo(node o) {
			// TODO ?????????????????????????????????????????????
			return nowcost-o.nowcost;
		}
	}

	static class edge {

		int to;

		int from;

		int cost;

		public edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}

}