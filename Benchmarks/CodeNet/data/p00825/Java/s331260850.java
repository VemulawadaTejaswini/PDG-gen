
import java.util.*;
public class Main {
	//1240 start
	//1300 cording end
	//1303 sample matched
	int INF = 1 << 24;
	
	class C implements Comparable<C>{
		int now1, now2, cost;
		boolean [] used;

		public C(int now1, int now2, int cost, boolean [] used) {
			this.now1 = now1;
			this.now2 = now2;
			this.cost = cost;
			this.used = used;
		}

		@Override
		public int compareTo(C o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
		
	}

	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] start = new int[n];
			int [] end = new int[n];
			int [] cost = new int[n];
			for(int i = 0; i < n; i++){
				start[i] = sc.nextInt();
				end[i] = sc.nextInt();
				cost[i] = sc.nextInt();
			}
			
			PriorityQueue<C> open = new PriorityQueue<Main.C>();
			open.add(new C(0, 0, 0, new boolean[n]));
			int [][] close = new int[366][366];
			int ans = -1;
			while(! open.isEmpty()){
				C now = open.poll();
				ans = Math.max(ans, now.cost);
				for(int i = 0; i < n; i++){
					if(now.used[i]) continue;
					
					if(now.now1 < start[i]){
						int nextnow = end[i];
						int nextcost = now.cost + cost[i];
						if(close[nextnow][now.now2] >= nextcost){
							continue;
						}
						boolean [] next = Arrays.copyOf(now.used, n);
						next[i] = true;
						open.add(new C(nextnow, now.now2, nextcost, next));
						close[nextnow][now.now2] = nextcost;
					}
					else if(now.now2 < start[i]){
						int nextnow = end[i];
						int nextcost = now.cost + cost[i];
						if(close[now.now1][nextnow] >= nextcost){
							continue;
						}
						boolean [] next = Arrays.copyOf(now.used, n);
						next[i] = true;
						open.add(new C(now.now1, nextnow, nextcost, next));
						close[now.now1][nextnow] = nextcost;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}