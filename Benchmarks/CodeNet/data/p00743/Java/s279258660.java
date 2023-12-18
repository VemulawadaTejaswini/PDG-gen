import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			int s = sc.nextInt();
			int g = sc.nextInt();

			Edge[][] map = new Edge[n+1][n+1];
			for(int i=0;i<m;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				double d = sc.nextDouble();
				double c = sc.nextDouble();
				map[from][to] = new Edge(from,to,d,c);
				map[to][from] = new Edge(to,from,d,c);
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State ans = null;
			open.add(new State(s,-1,0,0));

			while(!open.isEmpty()){
				State st = open.poll();

				if(st.n == g && st.v == 1){
					ans = st;
					break;
				}

				open.addAll(st.nexts(map,closed));
			}

			if(ans == null) System.out.println("unreachable");
			else System.out.printf("%.4f\n",ans.cost);
		}
	}
}

class State implements Comparable<State>{
	int n,before;
	double cost,v;

	State(int n,int before,double cost,double v){
		this.n = n;
		this.before = before;
		this.cost = cost;
		this.v = v;
	}

	List<State> nexts(Edge[][] map,HashSet<State> closed){
		int m = map.length;
		List<State> sts = new ArrayList<State>();

		for(int i=1;i<m;i++){
			if(map[n][i] != null && before != i){
				for(int j=-1;j<=1;j++){
					if(v + j > 0 && v + j <= map[n][i].c){
						State nst = new State(i,n,cost+map[n][i].d/(v+j),v+j);
						if(closed.contains(nst)) continue;
						sts.add(nst);
						closed.add(nst);
					}
				}
			}
		}
		return sts;
	}

	public int compareTo(State st){
		if(cost < st.cost) return -1;
		if(cost > st.cost) return 1;
		return 0;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return n == st.n && before == st.before && v == st.v;
	}

	public int hashCode(){
		return n + 100 * before + 10000 * (int)v;
	}
}

class Edge{
	int from,to;
	double d,c;

	Edge(int from,int to,double d,double c){
		this.from = from;
		this.to = to;
		this.d = d;
		this.c = c;
	}
}