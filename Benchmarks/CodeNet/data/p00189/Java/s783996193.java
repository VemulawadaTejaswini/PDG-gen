import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n, m;
	LinkedList<E>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			es=new LinkedList[10];
			for(int i=0; i<es.length; i++){
				es[i]=new LinkedList<E>();
			}
			n=0;
			m=sc.nextInt();
			if(m==0){
				break;
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt();
				int v=sc.nextInt();
				int w=sc.nextInt();
				es[u].add(new E(v, w));
				es[v].add(new E(u, w));
				n=max(n, u+1);
				n=max(n, v+1);
			}
			solve();
		}
	}

	void solve(){
		int min=INF;
		int v=0;
		for(int i=0; i<n; i++){
			int d=dijkstra(i);
			if(d<min){
				v=i;
				min=d;
			}
		}
		println(v+" "+min);
	}

	int dijkstra(int s){
		int[] d=new int[n];
		PriorityQueue<P> que=new PriorityQueue<P>();

		Arrays.fill(d, INF);
		d[s]=0;
		que.offer(new P(s, 0));
		for(; !que.isEmpty();){
			P p=que.poll();
			if(d[p.v]<p.d){
				continue;
			}
			for(E e : es[p.v]){
				if(d[e.to]>d[p.v]+e.cost){
					d[e.to]=d[p.v]+e.cost;
					que.offer(new P(e.to, d[e.to]));
				}
			}
		}

		int res=0;
		for(int i=0; i<n; i++){
			res+=d[i];
		}
		return res;
	}

	class E{
		int to, cost;

		E(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	class P implements Comparable<P>{
		int v, d;

		P(int v, int d){
			this.v=v;
			this.d=d;
		}

		@Override
		public int compareTo(P p){
			return d-p.d;
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}