import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(solve());
	}
	
	@SuppressWarnings("unchecked")
	public static boolean solve() {

		int n = sc.nextInt();
		if (n == 0) {
			return false;
		}
		int[] p = new int[n-1];
		int[] d = new int[n-1];
		for(int i=0;i<n-1;i++) {
			p[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			d[i] = sc.nextInt();
		}
		
		ArrayList<Edge>[] tree1 = new ArrayList[n];
		
		for(int i=0;i<n;i++) {
			tree1[i] = new ArrayList<>();
		}
		
		for(int i=0;i<n-1;i++) {
			int u = i + 1;
			int v = p[i] - 1;
			tree1[u].add(new Edge(v, d[i]));
			tree1[v].add(new Edge(u, d[i]));
		}
		
		ArrayList<Edge>[] tree2 = new ArrayList[n];
		for(int i=0;i<n;i++) {
			tree2[i] = new ArrayList<>();
		}
		
		boolean[] nonleaf = new boolean[n];
		for(int i=0;i<n;i++) {
			nonleaf[i] = tree1[i].size() >= 2;
		}
		
		for(int i=0;i<n;i++) {
			for(Edge e: tree1[i]) {
				if (nonleaf[i] && nonleaf[e.to]) {
					tree2[i].add(e);
				}
			}
		}
		
		int cost = 0;
		for(int i=0;i<n;i++) {
			for(Edge e: tree1[i]) {
				cost += e.cost;
			}
			for(Edge e: tree2[i]) {
				cost += e.cost * 2;
			}
		}
		cost /= 2;
		
		int start = -1;
		for(int i=0;i<n;i++) {
			if (nonleaf[i]) {
				start = i;
				break;
			}
		}
		int[] dist1 = dist(start, tree2, n);
		int far = -1;
		int distmax = -1;
		for(int i=0;i<n;i++) {
			if (nonleaf[i] && dist1[i] > distmax) {
				far = i;
				distmax = dist1[i];
			}
		}
		
		int[] dist2 = dist(far, tree2, n);
		for(int i=0;i<n;i++) {
			if (nonleaf[i] && dist2[i] > distmax) {
				distmax = dist2[i];
			}
		}
		
		cost -= distmax;
		
		System.out.println(cost);
		
		return true;
	}
	
	static int INF = 1 << 29;
	static int[] dist(int s,ArrayList<Edge>[] tree,int n) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(s);
		while(!q.isEmpty()) {
			int v = q.poll();
			for(Edge e: tree[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.offer(e.to);
				}
			}
		}
		return dist;
	}

}
class Edge {
	int to,cost;

	public Edge(int to, int cost) {
		super();
		this.to = to;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Edge [to=" + to + ", cost=" + cost + "]";
	}
	
	
	
}