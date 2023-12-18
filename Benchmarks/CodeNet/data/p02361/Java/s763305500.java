import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	static int d[];

	static List<edge> edges;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] v_e_r = br.readLine().split(" ");

		int v = Integer.parseInt(v_e_r[0]);

		int e = Integer.parseInt(v_e_r[1]);

		int r = Integer.parseInt(v_e_r[2]);

		d = new int[v];

		edges = new ArrayList<>();

		for(int i=0; i<e; i++){
			String[] from_to_cost_edge = br.readLine().split(" ");

			edges.add(new edge(Integer.parseInt(from_to_cost_edge[0]), Integer.parseInt(from_to_cost_edge[1]), Integer.parseInt(from_to_cost_edge[2])));
		}

		bellford(r);

		for(int i=0; i<d.length; i++){
			if(d[i] == Integer.MAX_VALUE/2){
				System.out.println("INF");
			}else {
				System.out.println(d[i]);
			}
		}

	}

	static void bellford(int now){

		Arrays.fill(d, Integer.MAX_VALUE/2);
		d[now] =0;

		while(true){
			boolean judge =false;

			for(edge e: edges){
				if(d[e.to]> d[e.from] +e.cost){
					d[e.to] = d[e.from]+e.cost;
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