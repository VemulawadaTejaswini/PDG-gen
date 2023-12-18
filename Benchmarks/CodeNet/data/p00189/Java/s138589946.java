import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = -1;

		n = sc.nextInt();
		while (n!=0) {
			Dijkstra dk = new Dijkstra(n);
			for (int i=0;i<n;++i) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				int cost = sc.nextInt();
				dk.addRoute(from, to, cost);
			}
			//TODO call solve
			System.out.println(solve(dk));
			
			n = sc.nextInt();
		}
	}
	
	public static String solve (Dijkstra dk) {
		int min = Integer.MAX_VALUE;
		int minstart = -1;
		for (int start=0;start<dk.getNodeNumber();++start){
			int sum = 0;
			for (int goal=0;goal<dk.getNodeNumber();++goal) {
				sum += dk.solve(start, goal);
			}
			if (sum<min) {
				min = sum;
				minstart = start;
			}
		}
		return minstart +" "+min;
	}
	/**
	 * Dijkstra Class
	 * @author ueno-ntnu
	 *
	 */
	static class Dijkstra {
		private int n;
		private int[][] routes;
		
		private List<int[]> list;
		private int nodeNum = 0;
		
		public Dijkstra (int n) {
			list = new ArrayList<int[]>();
		}
		
		public void addRoute (int from, int to, int cost) {
			nodeNum = Math.max(nodeNum, Math.max(from, to)+1);
			list.add(new int[]{from,to,cost});
		}
		public int getNodeNumber () {
			return nodeNum;
		}
		
		public int solve (int start, int goal) {
			routes = new int[nodeNum][nodeNum];
			for (int[] i : list) {
				routes[i[0]][i[1]] = i[2];
				routes[i[1]][i[0]] = i[2];
			}
			
			PriorityQueue<Edge> q = new PriorityQueue<Edge>(n+1, new Comparator<Edge>() {
				@Override
				public int compare (Edge e1, Edge e2) {
					return e1.getCost() - e2.getCost();
				}
			});
			
			int[] d = new int[nodeNum];
			Arrays.fill(d, Integer.MAX_VALUE);
			boolean[] b = new boolean[nodeNum];
			Arrays.fill(b,false);
			
			
			q.add(new Edge(start,0));
			
			do {
				Edge e;
				while (b[(e = q.poll()).getTo()]);
				
				if (e.getTo()==goal) {
					return e.getCost();
				}
				b[e.getTo()] = true;
				
				for (int i=0;i<nodeNum;++i) {
					if (0<routes[e.getTo()][i] && e.getCost()+routes[e.getTo()][i] < d[i]) {
						q.remove(new Edge(i,d[i]));
						d[i] = routes[e.getTo()][i]+e.getCost();
						q.add(new Edge(i,d[i]));
					}
				}
			} while (!q.isEmpty());
			
			return -1;
		}

		static class Edge {
			private int to;
			private int cost;
			public Edge (int to, int cost) {this.to = to; this.cost = cost;}
			public int getTo() {return to;}
			public int getCost() {return cost;}
			public void addCost(int aCost) {cost += aCost;}
		}
	}

}