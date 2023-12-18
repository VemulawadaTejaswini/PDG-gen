import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;


public class Main {
	Scanner in = new Scanner(System.in);
	
	int w, h;
	
	int INF = 100000000;
	
	int[][] edge;
	int[][][] minCost;
	
	int[][] vx = {
			{1, 2, 1, 3, 2, 1, 2, 1, 1},
			{-1, -2, -1, -3, -2, -1, -2, -1, -1}
	};
	int[] vy = {2, 1, 1, 0, 0, 0, -1, -1, -2};
	
	class State implements Comparable<State> {
		int leg, x, y;
		
		State(int leg, int x, int y) {
			this.leg = leg;
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(State s) {
			int c1 = minCost[leg][y][x], c2 = minCost[s.leg][s.y][s.x];
			return c1 - c2;
		}
	}
	
	boolean isOk(int x, int w, int y, int h) {
		return x >= 0 && x < w && y >= 0 && y < h;
	}
	
	void dijkstra(int leg, int x, int y) {
		for (int i = 0; i < 2; i++) for (int j = 0; j < h; j++)
			Arrays.fill(minCost[i][j], INF);
		minCost[leg][y][x] = 0;
		
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(leg, x, y));
		
		while (!pq.isEmpty()) {
			State s = pq.poll();
			for (int i = 0; i < vy.length; i++) {
				int nx = s.x + vx[s.leg][i];
				int ny = s.y + vy[i];
				if (isOk(nx, w, ny, h) && minCost[s.leg^1][ny][nx] > minCost[s.leg][s.y][s.x] + edge[ny][nx]) {
					minCost[s.leg^1][ny][nx] = minCost[s.leg][s.y][s.x] + edge[ny][nx];
					pq.add(new State(s.leg^1, nx, ny));
				}
			}
		}
	}
	
	void run() {
		while (true) {
			w = in.nextInt(); h = in.nextInt();
			if (w == 0) break;
			
			ArrayList<Integer> sx = new ArrayList<Integer>();
			ArrayList<Integer> sy = new ArrayList<Integer>();
			ArrayList<Integer> gx = new ArrayList<Integer>();
			ArrayList<Integer> gy = new ArrayList<Integer>();
			
			edge = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					char c = in.next().charAt(0);
					switch (c) {
					case 'X':
						edge[i][j] = INF;
						break;
					case 'S':
						edge[i][j] = 0;
						sx.add(j); sy.add(i);
						break;
					case 'T':
						gx.add(j); gy.add(i);
						break;
					default:
						edge[i][j] = c - '0';
 					}
				}
			}
			
			int res = INF;
			minCost = new int[2][h][w];
			for (int i = 0; i < sx.size(); i++) {
				int x = sx.get(i), y = sy.get(i);
				dijkstra(0, x, y);
//				for (int j = 0; j < h; j++)
//					System.out.println(Arrays.toString(minCost[0][j]));
//				System.out.println();
//				for (int j = 0; j < h; j++)
//					System.out.println(Arrays.toString(minCost[1][j]));
//				System.out.println();
				for (int j = 0; j < gx.size(); j++) {
					int Gx = gx.get(j), Gy = gy.get(j);
					res = Math.min(res, minCost[0][Gy][Gx]);
					res = Math.min(res, minCost[1][Gy][Gx]);
				}
				dijkstra(1, x, y);
//				for (int j = 0; j < h; j++)
//					System.out.println(Arrays.toString(minCost[0][j]));
//				System.out.println();
//				for (int j = 0; j < h; j++)
//					System.out.println(Arrays.toString(minCost[1][j]));
//				System.out.println();
				for (int j = 0; j < gx.size(); j++) {
					int Gx = gx.get(j), Gy = gy.get(j);
					res = Math.min(res, minCost[0][Gy][Gx]);
					res = Math.min(res, minCost[1][Gy][Gx]);
				}
			}
			
			System.out.println(res == INF ? "-1" : res);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}