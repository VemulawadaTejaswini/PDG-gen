import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(n == 0) break;

			ArrayList<Double> t = new ArrayList<Double>();
			for(int i=0;i<n;i++){
				t.add(sc.nextDouble());
			}
			Collections.sort(t);

			double[][] map = new double[m+1][m+1];
			for(int i=0;i<p;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				double cost = sc.nextDouble();
				map[from][to] = map[to][from] = cost;
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State ans = null;
			open.add(new State(a,0,t));

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.n == b){
					ans = st;
					break;
				}

				open.addAll(st.nexts(map));
			}

			System.out.println(ans==null ? "Impossible" : ans.cost);
		}
	}
}

class State implements Comparable<State>{
	int n;
	double cost;
	ArrayList<Double> t;

	State(int n,double cost,ArrayList<Double> t){
		this.n = n;
		this.cost = cost;
		this.t = t;
	}

	List<State> nexts(double[][] map){
		int m = map.length;
		List<State> sts = new ArrayList<State>();

		for(int i=1;i<m;i++){
			if(map[n][i] > 0){
				for(int j=0;j<t.size();j++){
					ArrayList<Double> copy = new ArrayList<Double>(t);
					double v = copy.remove(j);
					sts.add(new State(i,cost+map[n][i]/v,copy));
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
		return n == st.n && t.equals(st.t);
	}

	public int hashCode(){
		return n + t.hashCode();
	}
}