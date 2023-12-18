import java.util.*;

public class Main{
	int INF = 1 << 24;
	class Edge{
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		
	}
	
	class State implements Comparable<State>{
		int now, cost;

		public State(int now,int cost) {
			this.now = now;
			this.cost = cost;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return "State [now=" + now + ", cost=" + cost + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int tank = sc.nextInt();
			if((m|n|tank) ==0) break;
			tank *= 10;
			ArrayList<ArrayList<Edge>> es = new ArrayList<ArrayList<Main.Edge>>();
			HashMap<String, Integer> table = new HashMap<String, Integer>();
			String start = sc.next();
			String end = sc.next();
			int startind = -1, endind = -1;
			if(table.containsKey(start)){
				startind = table.get(start);
			}
			else{
				startind = table.size();
				table.put(start, table.size());
			}
			if(table.containsKey(endind)){
				endind= table.get(end);
			}
			else{
				endind = table.size();
				table.put(end, table.size());
			}
			
			for(int i = 0; i < m; i++){
				String s = sc.next();
				String t = sc.next();
				int cost = sc.nextInt();
				int inds = -1, indt = -1;
				if(table.containsKey(s)){
					inds = table.get(s);
				}
				else{
					inds = table.size();
					table.put(s, table.size());
				}
				if(table.containsKey(t)){
					indt = table.get(t);
				}
				else{
					indt = table.size();
					table.put(t, table.size());
				}
				while(es.size()<= inds){
					es.add(new ArrayList<Main.Edge>());
				}
				while(es.size()<= indt){
					es.add(new ArrayList<Main.Edge>());
				}
				es.get(inds).add(new Edge(inds, indt, cost));
				es.get(indt).add(new Edge(indt, inds, cost));
			}
			int v = es.size();
			
			HashSet<Integer> gas = new HashSet<Integer>();
			for(int i = 0; i < n; i++){
				int ind = table.get(sc.next());
				gas.add(ind);
			}
			gas.add(startind);gas.add(endind);
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(startind,0));
			int [] close = new int[v];
			Arrays.fill(close, INF);
			close[startind] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == endind){
					ans = now.cost;
					break;
				}
				
				HashSet<Integer> canddest = new HashSet<Integer>();
				LinkedList<State> open2 = new LinkedList<State>();
				open2.add(new State(now.now, tank));
				while(! open2.isEmpty()){
					State op2now = open2.poll();
					
					for(int i = 0; i < es.get(op2now.now).size(); i++){
						int op2to = es.get(op2now.now).get(i).to;
						int op2cost = es.get(op2now.now).get(i).cost;
						
						if(op2now.cost - op2cost < 0) continue;
						if(op2to == now.now) continue;
						if(canddest.contains(op2to)) continue;
						if(gas.contains(op2to)){
							canddest.add(op2to);
							continue;
						}
						open2.add(new State(op2to, op2now.cost - op2cost));
					}
				}
				
				for(int i = 0; i < es.get(now.now).size(); i++){
					int to = es.get(now.now).get(i).to;
					if(! canddest.contains(to)) continue;
					
					int cost = es.get(now.now).get(i).cost;
					int nextcost = now.cost + cost;
					
					if(close[to] <= nextcost) continue;
					open.add(new State(to, nextcost));
					close[to] = nextcost;
				}
			}
			System.out.println(ans);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}