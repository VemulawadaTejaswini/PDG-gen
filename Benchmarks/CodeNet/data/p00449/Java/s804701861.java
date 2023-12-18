import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), k=sc.nextInt();
			if(n==0 && k==0) break;

			int[][] map = new int[n+1][n+1];
			
			while(k-- > 0){
				if(sc.nextInt() == 1){
					int c=sc.nextInt(), d=sc.nextInt(), e=sc.nextInt();
					if(map[c][d]==0 || map[c][d]>e)
						map[c][d] = map[d][c] = e;
					continue;
				}
				
				int s=sc.nextInt(), g=sc.nextInt();
				
				Queue<State> open = new PriorityQueue<State>();
				Set<State> closed = new HashSet<State>();
				
				State st = null;
				open.add(new State(0,s));
				
				State ans = null;
				while(!open.isEmpty()){
					st = open.poll();
					if(closed.contains(st)){
						continue;
					}
					closed.add(st);
					if(st.n == g){
						ans = st;
						break;
					}
					open.addAll(st.nexts(map));
				}
				System.out.println(ans==null ? -1 : ans.cost);
			}
		}
	}
	
	static class State implements Comparable<State>{
		int cost,n;
		
		State(int cost,int n){
			this.cost = cost;
			this.n = n;
		}
		
		List<State> nexts(int[][] map){
			List<State> sts = new ArrayList<State>();
			for(int i=1;i<map.length;i++){
				if(map[n][i] > 0) sts.add(new State(cost+map[n][i],i));
			}
			return sts;
		}

		public int compareTo(State st){
			return cost- st.cost;
		}
		
		public boolean equals(Object o){
			State st = (State)o;
			return this.n == st.n;
		}
		
		public int hashCode(){
			return this.n;
		}
	}
}