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
		int now, tank, cost;

		public State(int now, int tank, int cost) {
			this.now = now;
			this.tank = tank;
			this.cost = cost;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [][] pass = new int[6000][6000];
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int tank = sc.nextInt();
			if((m|n|tank) ==0) break;
			for(int i = 0; i < 6000; i++){
				Arrays.fill(pass[i], INF);
			}
			tank *= 10;
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
				pass[inds][indt] = cost;
				pass[indt][inds] = cost;
			}
			int v = table.size();
			
			HashSet<Integer> gas = new HashSet<Integer>();
			for(int i = 0; i < n; i++){
				gas.add(table.get(sc.next()));
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(startind, tank, 0));
			int [][] close = new int[v][tank + 1];
			
			for(int i = 0; i < v; i++){
				Arrays.fill(close[i], INF);
			}
			close[startind][tank] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == endind){
					ans = now.cost;
					break;
				}
				
				for(int i = 0; i < v; i++){
					if(pass[now.now][i] == INF) continue;
					int nextcost = now.cost + pass[now.now][i];
					int nexttank = now.tank - pass[now.now][i];
					if(nexttank < 0){
						continue;
					}
					if(gas.contains(i)){
						nexttank = tank;
					}
					
					if(close[i][nexttank] <= nextcost) continue;
					open.add(new State(i, nexttank, nextcost));
					close[i][nexttank] = nextcost;
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