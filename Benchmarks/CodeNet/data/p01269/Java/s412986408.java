import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		AOJ2151 obj = new AOJ2151();
		while(true){
			int n = in.nextInt(),m = in.nextInt(),l = in.nextInt();
			if(n+m+l==0)break;
			new AOJ2151().doIt(n, m, l);
		}
	}
	class AOJ2151{
		int n,m,l;
		int cost[][];
		int teki[][];
		int result;
		void dikstra(int s){
			PriorityQueue<State> q = new PriorityQueue<State>();
			int[][] kyori = new int[n][l+1];
			int INF = Integer.MAX_VALUE/2;
			for(int i=0;i<n;i++)Arrays.fill(kyori[i], INF);
			kyori[s][l] = 0;
			q.add(new State(s, l, 0));
			while(q.size()>0){
//				if(q.size()>1000000){
//					System.out.println("*");return;
//				}
				State now = q.remove();
//				System.out.println(now);
				int v = now.v;
				if(v==n-1){
					result = now.teki;return;
				}
				for(int i=0;i<n;i++)if(cost[i][v]>0){
					if(i==v)continue;
					int t = teki[i][v];
					if(now.kin < cost[i][v]){//敵の数が超えるとき
						if(kyori[i][now.kin] <= now.teki + t){
							//                          System.out.println(i+" "+kyori[i][now.kin] +" "+ (now.teki+t));
							continue;
						}
						kyori[i][now.kin] = now.teki + t;
						q.add(new State(i, now.kin, now.teki+t));
					}else{//敵の数が超えない。 どっちもやる。
						int nkin = now.kin - cost[i][v];
						if(kyori[i][nkin] > now.teki){
							kyori[i][nkin] = now.teki;
							q.add(new State(i, nkin, now.teki));
						}
						if(kyori[i][now.kin] > now.teki + teki[i][v]){
							kyori[i][now.kin] = now.teki + teki[i][v];
							q.add(new State(i, now.kin, now.teki+teki[i][v]));
						}
					}
					//                  System.out.println(q);
				}
			}
		}
		void doIt(int n,int m,int l){//宿場 道の数 護衛予算(距離1で1円)
			this.n = n;this.m = m;this.l = l;
			cost = new int[n][n];
			teki = new int[n][n];
			for(int i=0;i<m;i++){
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				cost[a][b] = cost[b][a] = in.nextInt();
				teki[a][b] = teki[b][a] = in.nextInt();
			}
			//          for(int i=0;i<n;i++){
				//              for(int s=0;s<n;s++)System.out.print(cost[i][s]+" ");
			//              System.out.println();
			//          }
			dikstra(0);
//			System.out.print("ans=");
			System.out.println(result);
		}
		class State implements Comparable<State>{
			int kin,v,teki;
			public State(int v,int kin,int teki) {
				this.v = v;
				this.kin = kin;
				this.teki = teki;
			}
			public int compareTo(State o){
				if(this.teki<o.teki)return -1;
				else if(this.teki > o.teki)return 1;
				return 0;
			}
			public String toString(){
				return v+" "+kin+" "+teki;
			}
		}
	}
}