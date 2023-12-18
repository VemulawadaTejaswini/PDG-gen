import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0244().doIt();
	}
	
	class AOJ0244{
		int[][] cost;
		int n;
		int result;
		void dikstra(int s){
			result = -1;
			int[][]memo = new int[n][2];
			for(int i=0;i<n;i++)Arrays.fill(memo[i],Integer.MAX_VALUE/2);	
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(s, 0, 1));
			memo[0][1] = 0;
			while(q.size()>0){
				State now = q.remove();
				int v = now.v;
				if(now.v==n-1){
					result = now.cost;break;
				}
				for(int i=0;i<n;i++)if(cost[v][i]>0){
					//普通に次にいく場合
					int ncost = now.cost+cost[v][i];
					if(memo[i][now.ticket] <= ncost)continue;
					memo[i][now.ticket] = ncost;
					q.add(new State(i, ncost, now.ticket));
				}
				if(now.ticket==0)continue;
				for(int i=0;i<n;i++)if(cost[v][i]>0){
					for(int k=0;k<n;k++)if(i!=k&&cost[i][k]>0){
						if(memo[k][0] <= now.cost)continue;
						memo[k][0] = now.cost;
//						System.out.println(i+" "+k);
						q.add(new State(k, now.cost, 0));
					}
				}
			}
		}
		
		int solve(int n,int m){
			this.n = n;
			cost = new int[n][n];
			for(int i=0;i<m;i++){
				int from = in.nextInt()-1;
				int to = in.nextInt()-1;
				cost[from][to] = cost[to][from] = in.nextInt();
			}
			dikstra(0);
			return result;
		}
		void doIt(){
			while(true){
				int n = in.nextInt();
				int m = in.nextInt();
				if(n+m==0)break;
				System.out.println(solve(n, m));
			}
		}
	}
	class State implements Comparable<State>{
		int v,cost,ticket;
		public State(int v,int cost,int ticket) {
			this.v = v;
			this.cost = cost;
			this.ticket = ticket;
		}
		public int compareTo(State o) {
			return this.cost-o.cost;
		}
	}
	
}