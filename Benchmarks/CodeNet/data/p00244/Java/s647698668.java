import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		int v, cost1, cost2, ticket, count;
		State(int v, int cost1, int cost2, int ticket, int count){
			this.v=v;
			this.cost1=cost1;
			this.cost2=cost2;
			this.ticket=ticket;
			this.count=count;
		}
		public int compareTo(State s) {
			if(this.cost2==s.cost2) return this.cost1-s.cost1;
			return this.cost2-s.cost2;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				if(n+m==0) break;
				int[][] edge=new int[n+1][n+1];
				int[][][] dis=new int[n+1][2][2];//頂点と残りのチケット＝最小コスト
				for(int i=0; i<m; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					edge[a][b]=edge[b][a]=c;
				}
				PriorityQueue<State> pq=new PriorityQueue<>();
				int INF=Integer.MAX_VALUE;
				for(int i=1; i<=n; i++) {
					dis[i][1][1]=dis[i][1][0]=dis[i][0][0]=INF;
				}
				pq.add(new State(1, 0, 0, 1, 0));
				while(!pq.isEmpty()) {
					State s=pq.poll();
					if(dis[s.v][s.ticket][s.count]<=s.cost1) continue;
					dis[s.v][s.ticket][s.count]=s.cost1;
					//if(s.v==n) break;
					for(int i=1; i<=n; i++) {
						if(edge[s.v][i]==0) continue;
						if(s.ticket==1 && s.count==0) {
							pq.add(new State(i, s.cost1+edge[s.v][i], s.cost2, s.ticket, s.count+1));
							pq.add(new State(i, s.cost1+edge[s.v][i], s.cost1+edge[s.v][i], s.ticket, s.count));
						}
						else if(s.ticket==1 && s.count==1) {
							pq.add(new State(i, s.cost2, s.cost2, 0, 0));
						}
						else {
							pq.add(new State(i, s.cost1+edge[s.v][i], s.cost1+edge[s.v][i], s.ticket, s.count));
						}
					}
				}
				System.out.println(Math.min(dis[n][1][1], Math.min(dis[n][0][0], dis[n][1][0])));
				
			}

		}
	}
}
