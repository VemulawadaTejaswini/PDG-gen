import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m, limit, s, t;
	boolean[] freeze;
	ArrayList<E>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			limit=sc.nextInt();
			int k=sc.nextInt();
			m=sc.nextInt();
			s=sc.nextInt();
			t=sc.nextInt();
			if((n|limit|k|m|s|t)==0){
				break;
			}

			freeze=new boolean[n];
			for(int i=0; i<k; i++){
				freeze[sc.nextInt()]=true;
			}
			freeze[s]=freeze[t]=true;
			es=new ArrayList[n];
			for(int i=0; i<n; i++){
				es[i]=new ArrayList<E>();
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt(), v=sc.nextInt(), w=sc.nextInt();
				es[u].add(new E(v, w));
				es[v].add(new E(u, w));
			}
			solve();
		}
	}

	void solve(){
		int[][] d=new int[n][limit+1];
		for(int i=0; i<n; i++){
			fill(d[i], INF);
		}
		d[s][limit]=0;
		PriorityQueue<P> que=new PriorityQueue<P>();
		que.offer(new P(s, limit, 0));
		for(; !que.isEmpty();){
			P p=que.poll();
			if(p.cost>d[p.v][p.t]){
				continue;
			}
			if(freeze[p.v]){
				for(int i=1; p.t+i<=limit; i++){
					if(p.cost+i<d[p.v][p.t+i]){
						P q=new P(p.v, p.t+i, p.cost+i);
						que.offer(q);
						d[q.v][q.t]=q.cost;
					}
				}
			}
			for(E e : es[p.v]){
				if(p.t-e.cost>=0&&p.cost+e.cost<d[e.to][p.t-e.cost]){
					P q=new P(e.to, p.t-e.cost, p.cost+e.cost);
					que.offer(q);
					d[q.v][q.t]=q.cost;
				}
			}
		}
		int min=INF;
		for(int i : d[t]){
			min=min(min, i);
		}
		println(min<INF?(""+min):"Help!");
	}

	class P implements Comparable<P>{
		int v, t, cost;

		P(int v, int t, int cost){
			this.v=v;
			this.t=t;
			this.cost=cost;
		}

		@Override
		public int compareTo(P p){
			return cost-p.cost;
		}
	}

	class E{
		int to, cost;

		E(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}