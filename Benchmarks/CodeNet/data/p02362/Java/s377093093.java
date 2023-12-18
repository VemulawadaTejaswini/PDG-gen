import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int r = sc.nextInt();
		Edge[] edges = new Edge[E];
		for (int i = 0; i < E; i++) {
			edges[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		solve(V, E, r, edges);
	}
	
	public static void solve(int V, int E, int r, Edge[] edges) {
		int[] cost = new int[V];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[r] = 0;
		
		for (int i = 0; i < V; i++) {
			boolean update = false;
			for (int j = 0; j < E; j++) {
				Edge edge = edges[j];
				if (cost[edge.src] == Integer.MAX_VALUE) {
					continue;
				}
				
				if (cost[edge.src] + edge.cost < cost[edge.dest]) {
					update = true;
					cost[edge.dest] = cost[edge.src] + edge.cost;  
				}
			}
			
			if (i == V-1) {
				if (update) {
					System.out.println("NEGATIVE CYCLE");
				} else {
					for (int k = 0; k < V; k++) {
						if (cost[k] == Integer.MAX_VALUE) {
							System.out.println("INF");
						} else {
							System.out.println(cost[k]);
						}
					}
				}
			}
			update = false;
		}
	}
}

class Edge {
	int src;
	int dest;
	int cost;
	public Edge(int s, int d, int c) {
		src = s;
		dest = d;
		cost = c;
	}
}