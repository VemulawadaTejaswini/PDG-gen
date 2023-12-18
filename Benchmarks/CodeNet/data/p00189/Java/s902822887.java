import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			if (m == 0) {
				break;
			}
			Graph g = new Graph(10);
			boolean[] use = new boolean[10];
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				use[a] = use[b] = true;
				g.addEdge(a, b, c);
				g.addEdge(b, a, c);
			}
			int minindex = -1;
			int ans = Integer.MAX_VALUE;
			for(int i=0;i<10;i++) {
				if(!use[i]) {
					continue;
				}
				int[] dist = g.dijkstra(i);
				int sum = 0;
				for(int j=0;j<10;j++) {
					if (use[j]) {
						sum+=dist[j];
					}
				}
				if (sum < ans) {
					minindex = i;
					ans = sum;
				}
			}
			System.out.println(minindex + " " + ans);
		}
	}

}

class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;
	
	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}
	public int[] dijkstra(int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		while(!q.isEmpty()) {
			Node node = q.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				continue;
			}
			for(Edge e:graph[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}
	class Edge {
		int to;
		int cost;
		public Edge(int to,int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		int dist;
		int id;
		public Node(int dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
		}
	}
}