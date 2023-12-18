import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		//		n 馬車券
		//		m 都市数
		//		p 都市間道路
		//		a 出発地の都市番号
		//		b 目的地の都市番号    a!=b
		while(true){
			int n = in.nextInt(),m = in.nextInt(),p = in.nextInt(),a = in.nextInt(),b = in.nextInt();
			if(n+m+a+b+p==0)break;
			new AOJ1138().doIt(n, m, p, a, b);
		}
	}

	class AOJ1138{
		double kyori[][];
		int V;//頂点数
		int INF;

		void dijkstra(int s){
			INF = Integer.MAX_VALUE;
			kyori = new double[V][1 << n];
			for(int i=0;i<V;i++)Arrays.fill(kyori[i], INF);
			int bit = 0;
			for(int i=0;i<n;i++)bit += (1 << i);
			result = -1;
			PriorityQueue<State> q = new PriorityQueue<State>();
			kyori[s][bit] = 0;
			q.add(new State(0,s,bit));
			while(q.size()>0){
				State now = q.remove();
//				System.out.println(now.v+" "+now.d+" "+Integer.toBinaryString(now.bit));
				int v = now.v;
				bit = now.bit;
				if(v == b){
					result = now.d;break;
				}
				for(int i=0;i<V;i++)if(cost[now.v][i]>0){
					for(int k=0;k<n;k++)if((bit >> k)%2 == 1){
						double ncost = now.d+(double)(cost[now.v][i]/t[k]);
						if(kyori[i][bit-(1<<k)] < ncost)continue;
						kyori[i][bit-(1<<k)] = ncost;
						q.add(new State(ncost,i,bit-(1<<k)));
					}
				}
			}
		}
		
		class State implements Comparable<State>{
			int bit,v;
			double d;
			public State(double d,int v,int bit) {
				this.v = v;
				this.d = d;
				this.bit = bit;
			}
			public int compareTo(State o) {
				if(Math.abs(this.d - o.d) < 1.0e-8) return 0;
				else if(this.d>o.d)return 1;
				else return -1;
			}
		}
		
		double[] t;
		double[][] cost;
		int n,a,b;
		double result;
		void doIt(int n,int m,int p,int a,int b){
			this.n = n;this.a = a-1;this.b = b-1;this.V = m;
			t = new double[n];
			for(int i=0;i<n;i++)t[i] = in.nextInt();
			cost = new double[m][m];
			for(int i=0;i<p;i++){
				int from = in.nextInt()-1;
				int to = in.nextInt()-1;
				cost[from][to] = cost[to][from] = in.nextInt();
			}
			dijkstra(a-1);
			if(result < 0)System.out.println("Impossible");
			else System.out.println(result);
		}
	}

}