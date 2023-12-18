import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int N, M, S, G;
	static final double EPS = 1e-8;
	static final int    INF = 1 << 20;
	static int[][] W = new int[31][31], C = new int[31][31];
	static boolean read() {
		N = sc.nextInt(); M = sc.nextInt();
		if (N == 0) return false;
		
		S = sc.nextInt(); G = sc.nextInt();
		for (int i = 0; i < 31; i++) {
			fill(W[i], INF);
			W[i][i] = 0;
		}
		
		for (int i = 0; i < M; i++) {
			int x, y, d, c;
			x = sc.nextInt();
			y = sc.nextInt();
			d = sc.nextInt();
			c = sc.nextInt();
			W[x][y] = W[y][x] = d;
			C[x][y] = C[y][x] = c;
		}
		
		return true;
	}

	static void solve() {
		double[][][] cost = new double[31][31][31];
		for (int i = 0; i < 31; i++)
			for (int j = 0; j < 31; j++)
				fill(cost[i][j], INF);
		
		PriorityQueue<State> que = new PriorityQueue<State>();
		que.add(new State(S, 0, 1, 0));
		boolean find = false;
		double ans = INF;
		while (!que.isEmpty()) {
			State s = que.poll();
			int cur = s.cur, prev = s.prev, v = s.v;
			double c = s.cost;
			if (cost[cur][prev][v] + EPS < INF) continue;
			
			cost[cur][prev][v] = c;
			
			if (cur == G && v == 0) {
				ans = c;
				find = true;
				break;
			} else if (v == 0) {
				continue;
			}
			
			int from = cur;
			for (int to = 1; to < 31; to++) {
				if (W[from][to] + EPS > INF || to == prev) continue;
				for (int j = -1; j <= 1; j++) {
					int nv = v + j;
					double nc = c + ((double)W[from][to] / v);
					if (v >= 0 && v <= C[from][to] && nv >= 0 && nv <= 30 && cost[to][from][nv] + EPS > INF) {
						que.add(new State(to, from, nv, nc));
					}
				}
			}
		}
		
		if (find)
			System.out.println(ans);
		else 
			System.out.println("unreachable");
	}	
}

class State implements Comparable<State> {
	int cur, prev, v;
	double cost;
	
	State(int cur, int prev, int v, double cost) {
		this.cur = cur;
		this.prev = prev;
		this.v = v;
		this.cost = cost;
	}
	
	public int compareTo(State s) {
		return (new Double(this.cost).compareTo(s.cost));
	}
}