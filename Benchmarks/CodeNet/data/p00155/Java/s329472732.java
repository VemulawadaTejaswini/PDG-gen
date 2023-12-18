import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			HashMap<Integer,Point> built = new HashMap<Integer,Point>();
			HashMap<Integer,ArrayList<Edge>> map = new HashMap<Integer,ArrayList<Edge>>();

			for(int i=0;i<n;i++){
				built.put(sc.nextInt(),new Point(sc.nextInt(),sc.nextInt()));
			}

			for(int id : built.keySet()){
				map.put(id,new ArrayList<Edge>());

				for(int tid : built.keySet()){
					if(id == tid) continue;

					Point from = built.get(id);
					Point to = built.get(tid);
					double cost = from.distance(to);

					if(cost <= 50) map.get(id).add(new Edge(id,tid,cost));
				}
			}

			int m = sc.nextInt();
			while(m-- > 0){
				int s = sc.nextInt();
				int g = sc.nextInt();
				State ans = getPath(s,g,map);

				System.out.println(ans == null ? "NA" : ans);
			}
		}
	}

	private static State getPath(int s,int g,HashMap<Integer,ArrayList<Edge>> map){
		PriorityQueue<State> open = new PriorityQueue<State>();
		HashSet<State> closed = new HashSet<State>();

		ArrayList<Integer> tmp = new ArrayList<Integer>();
		tmp.add(s);
		open.add(new State(s,0,tmp));

		State ans = null;

		while(!open.isEmpty()){
			State st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);

			if(st.n == g){
				ans = st;
				break;
			}

			open.addAll(st.nexts(map));
		}

		return ans;
	}
}

class Edge{
	int from,to;
	double cost;

	public Edge(int from,int to,double cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	public String toString(){
		return String.format("[%d,%d,%.2f]",from,to,cost);
	}
}

class State implements Comparable<State>{
	int n;
	double cost;
	ArrayList<Integer> path;

	public State(int n,double cost,ArrayList<Integer> path){
		this.n = n;
		this.cost = cost;
		this.path = path;
	}

	public List<State> nexts(HashMap<Integer,ArrayList<Edge>> map){
		List<State> res = new ArrayList<State>();
		for(Edge e : map.get(n)){
			ArrayList<Integer> tmp = new ArrayList<Integer>(path);
			tmp.add(e.to);
			res.add(new State(e.to,cost+e.cost,tmp));
		}
		return res;
	}

	public int compareTo(State st){
		if(this.cost < st.cost) return -1;
		else if(this.cost > st.cost) return 1;
		return 0;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return this.n == st.n;
	}

	public int hashCode(){
		return n;
	}

	public String toString(){
		String res = "" + path.get(0);
		for(int i=1;i<path.size();i++){
			res += " " + path.get(i);
		}

		return res;
	}
}