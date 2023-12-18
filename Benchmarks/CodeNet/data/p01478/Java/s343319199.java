import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] c = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int[] p = new int[n];
		iota(p);
		int id = 0;
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		do {
			hm.put(hash(p), id);
			id++;
		} while(nextPermutation(p));
		Graph g = new Graph(id);
		iota(p);
		do {
			int u = hm.get(hash(p));
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					swap(p, i, j);
					int v = hm.get(hash(p));
					swap(p, i, j);
					g.addEdge(u, v, c[i][j]);
				}
			}
		} while(nextPermutation(p));
		int[] dist = g.minDistDijkstra(0);
		int max = 0;
		for(int i=0;i<id;i++) {
			max = Math.max(max,dist[i]);
		}
		System.out.println(max);
	}

	static void iota(int[] p) {
		for(int i=0;i<p.length;i++) {
			p[i] = i;
		}
	}

	static void swap(int[] p,int i,int j) {
		int temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}

	static boolean nextPermutation(int[] p) {
		for(int a=p.length-2;a>=0;--a) {
			if(p[a]<p[a+1]) {
				for(int b=p.length-1;;--b) {
					if(p[b]>p[a]) {
						int t = p[a];
						p[a] = p[b];
						p[b] = t;
						for(++a, b=p.length-1;a<b;++a,--b) {
							t = p[a];
							p[a] = p[b];
							p[b] = t;
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	static int hash(int[] p) {
		int h = 0;
		for(int i=0;i<p.length;i++) {
			h *= 8;
			h += p[i];
		}
		return h;
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

	public void addBidirectionalEdge(int from,int to,int cost) {
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public int[] minDistDijkstra(int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(0, s));
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