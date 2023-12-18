import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
	
	static class State implements Comparable <State>{
		int vertex, cost;
		State(int vertex, int cost){
			this.vertex=vertex;
			this.cost=cost;
		}
		public int compareTo(State s) {
			return this.cost-s.cost;
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int n=sc.nextInt();//頂点数
			int inf=100000000;
			int[] d=new int[n+1];//始点からの距離
			int[][] w=new int[n+1][n+1];//各頂点ごとの距離
			PriorityQueue<State> pq=new PriorityQueue<State>();
			Map<Integer, Integer> map=new HashMap<>();
			Arrays.fill(d, inf);
			for(int i=0; i<n; i++) {
				int u=sc.nextInt();
				if(u==0) {
					int k=sc.nextInt();
					for(int j=0; j<k; j++) {
						int v=sc.nextInt();
						int c=sc.nextInt();
						d[v]=c;
					}
				}
				else {
					int k=sc.nextInt();
					for(int j=0; j<k; j++){
						int v=sc.nextInt();
						int c=sc.nextInt();
						w[u][v]=c;
					}
				}
			}
			d[0]=0;
			for(int i=1; i<n; i++) {
				pq.add(new State(i, d[i]));
			}//未訪問頂点の中でd[v]の昇順
			while(! pq.isEmpty()) {
				State p=pq.poll();
				int pv=p.vertex;
				int pc=p.cost;
				map.put(pv, pc);
				//一番小さいのは決定
				//次の未訪問頂点の中で、小さいのからかor始点からか
				for(int j=1; j<n; j++) {
					if(w[pv][j]>0) {
						d[j]=Math.min(d[j], d[pv]+w[pv][j]);
					}
				}
			}
			for(int i=0; i<n; i++) {
				System.out.println(i+" "+d[i]);
			}
			
		}
	}
}
