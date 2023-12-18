import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	
	int n, m;
	
	int[][] edge;
	double[][] minCost;
	int[][] maxSpeed;	
	
	double INF = 1000000000;
	
	class State implements Comparable<State> {
		int n, speed, prev;

		State(int n, int speed, int prev) {
			this.n = n;
			this.speed = speed;
			this.prev = prev;
		}
		
		@Override
		public int compareTo(State arg0) {
			double c1 = minCost[n][speed], c2 = minCost[arg0.n][arg0.speed];
			if (c1 > c2) return 1;
			else if (c1 < c2) return -1;
			else return 0;
		}
	}
	
	boolean isOk(int x) {
		return x > 0 && x <= 30;
	}
	
	void dijkstra(int start) {
		minCost = new double[n][31];
		for (int i = 0; i < n; i++)
			Arrays.fill(minCost[i], INF);
		
		minCost[start][0] = 0;
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(0, 0, -1));
		
		while (!pq.isEmpty()) {
			State s = pq.poll();
			for (int i = 0; i < n; i++) {
				if (s.prev == i) continue;
				for (int c = 0; c <= 30; c++) {
					for (int v = -1; v <= 1; v++) {
						if (isOk(c+v) && c+v <= maxSpeed[i][s.n] && minCost[i][c+v] > minCost[s.n][c] + (double)edge[i][s.n] / (c+v)) {
							minCost[i][c+v] = minCost[s.n][c] + (double)edge[i][s.n] / (c+v);
							pq.add(new State(i, c+v, s.n));
						}
					}
				}
			}
		}
		
		
	}
	
	void run() {
		while (true) {
			n = in.nextInt(); m = in.nextInt();
			if (n == 0) break;
			
			int s = in.nextInt() - 1, g = in.nextInt() - 1;

			maxSpeed = new int[n][n];
			edge = new int[n][n];
			
			for (int i = 0; i < m; i++) {
				int x = in.nextInt() - 1, y = in.nextInt() - 1, d = in.nextInt(), c = in.nextInt();
				edge[x][y] = edge[y][x] = d;
				maxSpeed[x][y] = maxSpeed[y][x] = c;
			}
			
			dijkstra(s);
			
			double res = minCost[g][1];
			
			/*
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < 5; j++)
					System.out.print(minCost[i][j] + " ");
				System.out.println();
			}
			*/
			
			System.out.println(res == INF ? "unreachable" : res);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}