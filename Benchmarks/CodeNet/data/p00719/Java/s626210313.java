import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n,m,p,a,b;
	static List<Edge>[] graph;
	static List<Integer> tickets;
	static double[][] dp = new double[1 << 8][31];
	static final double INF = 9999999.0; 
	
	static boolean read() {
		n = sc.nextInt(); m = sc.nextInt(); p = sc.nextInt();
		a = sc.nextInt(); b = sc.nextInt();
		if(n == 0 && m == 0)
			return false;
		
		tickets = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) 
			tickets.add(sc.nextInt());
		
		graph = new ArrayList[m + 1];
		for(int i = 0; i <= m; i++)
			graph[i] = new ArrayList<Edge>();
		
		int x, y, z;
		for(int i = 0; i < p; i++) {
			x = sc.nextInt(); y = sc.nextInt(); z = sc.nextInt();
			graph[x].add(new Edge(x, y, z)); graph[y].add(new Edge(y, x, z));
		}
		
		return true;
	}
	
	static void solve() {
		for(int S = 0; S < (1 << n); S++)
			for(int i = 1; i <= m ; i++)
				dp[S][i] = INF;
		
		double ans = INF;
		dp[(1 << n) - 1][a] = 0.0;
		for(int S = (1 << n) - 1; S >= 0; S--) {
			for(int v = 1; v <= m; v++) {
				for(int i = 0; i < n; i++) {
					if(((1 << i) & S) > 0) {
						for(Edge u : graph[v]) {
							dp[S & ~(1 << i)][u.to] = min(
									dp[S & ~(1 << i)][u.to],
									dp[S][v] + (double)u.cost / tickets.get(i)
							);
						}
					}
				}
			}
			ans = min(ans, dp[S][b]);
		}
		if(ans == INF)
			System.out.println("Impossible");
		else
			System.out.printf("%.3f\n", ans);
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}	
}

class Edge {
	int from, to, cost;
	Edge(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}