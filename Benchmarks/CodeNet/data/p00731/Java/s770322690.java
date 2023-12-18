import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int W, H;
	static char[][] cliff = new char[60][30];
	static int ns, ng;
	static int[] sx = new int[30], gx = new int[30];
	
	static boolean read() {
		W = sc.nextInt(); H = sc.nextInt();
		if (W == 0 && H == 0) return false;
		
		ns = 0;
		for (int i = 0; i < H; i++) { 
			for (int j = 0; j < W; j++) { 
				cliff[i][j] = sc.next().charAt(0);
				if (cliff[i][j] == 'S') {
					sx[ns++] = j;
					cliff[i][j] = 'X';
				}
			}
		}
				
		return true;
	}

	static final int INF = 1 << 29;
	static void solve() {
		int ans = dijkstra();
		if (ans == INF)
			ans = -1;
		System.out.println(ans);
	}	
	
	static int[][] dx = {
		{3, 2, 2, 2, 1, 1, 1, 1, 1},
		{-3, -2, -2, -2, -1, -1, -1, -1, -1}
	};
	static int[] dy = {
		0, -1, 0, 1, -2, -1, 0, 1, 2
	};
	static int[][][] dist = new int[2][60][30]; // prev_foot, prev_y, prev_x
	static int dijkstra() {
		for (int i = 0; i < 2; i++) 
			for (int j = 0; j < 60; j++)
				fill(dist[i][j], INF);
		
		PriorityQueue<State> que = new PriorityQueue<State>();
		for (int i = 0; i < ns; i++) {
			for (int j = 0; j < 2; j++) {
				que.add(new State(0, j, sx[i], H - 1));
			}
		}		
		
		int ans = INF;
		boolean find = false;
		while (!que.isEmpty()) {
			State s = que.poll();

			int cost = s.cost, prev = s.prev, prev_y = s.foot[1], prev_x = s.foot[0];
			if (dist[prev][prev_y][prev_x] <= cost) continue;
			
			// update distination
			dist[prev][prev_y][prev_x] = cost;
			// try to next step
			for (int k = 0; k < 9; k++) {
				int nx = prev_x + dx[prev][k];
				int ny = prev_y + dy[k];
				int nprev = (prev + 1) % 2;
				int dc = getCost(nx, ny);
				if (dc == 0) {
					// find goal
					return cost;
				} else if (dc != -1) {
					int ncost = cost + dc;
					que.add(new State(ncost, nprev, nx, ny));
				}
			}
		}
		
		return INF;
	}
	
	static int getCost(int x, int y) {
		if (x < 0 || W <= x || y < 0 || H <= y || cliff[y][x] == 'X')
			return -1;
		else if (cliff[y][x] == 'T')
			return 0;
		else 
			return Integer.parseInt(Character.toString(cliff[y][x]));
	}
}


class State implements Comparable<State> {
	int cost, prev; // time, prev_foot
	int[] foot; // Lfoot
	State(int cost, int prev, int x, int y) {
		this.cost = cost;
		this.prev = prev;
		foot = new int[2];
		foot[0] = x;
		foot[1] = y;
	}
	
	public int compareTo(State s) {
		return this.cost - s.cost;
	}
}