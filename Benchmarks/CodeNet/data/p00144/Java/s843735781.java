import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		int v, cost;
		State(int v, int cost){
			this.v=v;
			this.cost=cost;
		}
		public int compareTo(State s) {
			return this.cost-s.cost;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			boolean[][] edge=new boolean[n+1][n+1];
			for(int i=0; i<n; i++) {
				int r=sc.nextInt();
				int k=sc.nextInt();
				for(int j=0; j<k; j++) {
					int t=sc.nextInt();
					edge[r][t]=true;
				}
			}
			int p=sc.nextInt();
			int[] dis=new int[n+1];
			PriorityQueue<State> pq=new PriorityQueue<>();
			int INF=100000000;
			while(p-->0) {
				int s=sc.nextInt();
				int g=sc.nextInt();
				int v=sc.nextInt();
				pq.clear();
				Arrays.fill(dis, INF);
				pq.add(new State(s, 0));
				while(!pq.isEmpty()) {
					State state=pq.poll();
					if(dis[state.v]!=INF) continue;
					dis[state.v]=state.cost;
					if(state.v==g) break;
					for(int i=1; i<=n; i++) {
						if(!edge[state.v][i]) continue;
						pq.add(new State(i, state.cost+1));
					}
				}
				if(dis[g]==INF || dis[g]>=v) System.out.println("NA");
				else System.out.println(dis[g]+1);
			}
			
		}

	}
}
