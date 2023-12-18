import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int d[];
	static List<edge> edges;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt(); //頂点の数
		int E = sc.nextInt(); //辺の数
		int r = sc.nextInt(); //始点の番号

		d = new int[V];
		edges = new ArrayList<>();

		for(int i = 0; i < E; i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			int cost = sc.nextInt();

			edges.add(new edge(start, end, cost));
		}

		execDijkstra(r);

		for(int i=0; i<d.length; i++){
			if(d[i] == Integer.MAX_VALUE/2){
				System.out.println("INF");
			}else {
				System.out.println(d[i]);
			}
		}
	}

	static void execDijkstra(int now){
		Arrays.fill(d, Integer.MAX_VALUE/2);
		d[now] =0;

		while(true){
			boolean judge =false;
			for(edge e: edges){
				if(d[e.to]> d[e.from] + e.cost){
					d[e.to] = d[e.from] + e.cost;
					judge = true;
				}
			}
			if(!judge){
				break;
			}
		}
	}

	static class edge{
		int from;
		int to;
		int cost;

		public edge(int a, int b, int c) {
			this.from =a;
			this.to = b;
			this.cost = c;
		}
	}
}
