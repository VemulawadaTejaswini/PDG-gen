
import java.util.*;
public class Main {
	//1730 start
	int INF = 1 << 24;
	ArrayList<ArrayList<Edge>> G;
	
	class Edge {
		int to, cap, cost;
		int rev;

		public Edge(int to, int cap, int cost, int rev) {
			this.to = to;this.cap = cap;this.cost = cost; this.rev = rev;
		}
	}
	
	class S implements Comparable<S>{
		int start, end, cost;

		public S(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(S o) {
			if(this.end < o.end) return -1;
			if(this.end > o.end) return 1;
			return 0;
		}
		
	}

	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			S [] data = new S[n];
			for(int i = 0; i < n; i++){
				data[i] = new S(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(data);
			int [] start = new int[n];
			int [] end = new int[n];
			int [] cost = new int[n];
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(0);
			set.add(366);
			for(int i = 0; i < n; i++){
				start[i] = data[i].start - 1;
				end[i] = data[i].end;
				set.add(start[i]); set.add(end[i]);
				cost[i] = data[i].cost;
			}
			
			//G[][]をつくる
			G = new ArrayList<ArrayList<Edge>>();
			for(int i = 0 ; i <= 366; i++){
				G.add(new ArrayList<Edge>());
			}
			
			//マイナスのコストがある辺を加える
			for(int i = 0 ; i < n; i++){
				addEdge(start[i], end[i], 1, -cost[i]);
			}
			
			for(int i = 0; i < 366; i++){
				addEdge(i, i + 1, 2, 0);
			}
			
			int res = minCostFlow(0,366, 2);
			System.out.println(-res);
		}
	}
	
	//SHAKYO
	private void addEdge(int from, int to, int cap, int cost){
		G.get(from).add(new Edge(to, cap, cost, G.get(to).size()));
		G.get(to).add(new Edge(from, 0, -cost, G.get(from).size()));
	}

	//SHAKYO
	private int minCostFlow(int s, int t, int f) {
		int V = G.size();
		int [] dist = new int[V];
		int [] prevv = new int[V];
		int [] preve = new int[V];
		
		int res = 0;
		while(f > 0){
			//ベルマン
			Arrays.fill(dist, INF);
			dist[s] = 0;
			boolean update = true;
			while(update) {
				update = false;
				for(int v = 0; v < V; v++){
					if(dist[v] == INF) continue;
					for(int i = 0 ; i < G.get(v).size(); i++){
						Edge  e = G.get(v).get(i);
						if(e.cap > 0 && dist[e.to]> dist[v] + e.cost ){
							dist[e.to] = dist[v] + e.cost;
							prevv[e.to] = v;
							preve[e.to] = i; 
							update = true;
						}
					}
				}
			}
			
			if(dist[t] == INF){
				return -1;
			}
			
			int d = f;
			for(int v = t; v != s; v = prevv[v]){
				d = Math.min(d, G.get(prevv[v]).get(preve[v]).cap);
			}
			f -= d;
			res += d * dist[t];
			for(int v = t; v!= s; v = prevv[v]){
				Edge e =G.get(prevv[v]).get(preve[v]);
				e.cap -= d;
				G.get(v).get(e.rev).cap += d;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}