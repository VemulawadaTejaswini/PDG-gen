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

	int c, n, m, s, g;
	LinkedList<E>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			c=sc.nextInt();
			n=sc.nextInt(); // ¬Ì
			m=sc.nextInt();
			s=sc.nextInt()-1;
			g=sc.nextInt()-1;
			if((c|n|m|(s+1)|(g+1))==0){
				break;
			}
			es=new LinkedList[n];
			for(int i=0; i<n; i++){
				es[i]=new LinkedList<E>();
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				int w=sc.nextInt()/10;
				es[u].add(new E(v, w));
				es[v].add(new E(u, w));
			}
			solve();
		}
	}

	void solve(){
		int[][] d=new int[n][c+1];
		// ¡¢éÆ±ëC`PbgÌ
		PriorityQueue<P> que=new PriorityQueue<P>();

		for(int i=0; i<n; i++){
			Arrays.fill(d[i], INF);
		}
		d[s][c]=0;
		que.offer(new P(s, c, 0));
		for(; !que.isEmpty();){
			P p=que.poll();
			if(d[p.v][p.c]<p.d){
				continue;
			}
			for(E e : es[p.v]){
				if(d[e.to][p.c]>d[p.v][p.c]+e.cost){
					d[e.to][p.c]=d[p.v][p.c]+e.cost;
					que.offer(new P(e.to, p.c, d[e.to][p.c]));
				}
				if(p.c>0&&d[e.to][p.c-1]>d[p.v][p.c]+e.cost/2){
					d[e.to][p.c-1]=d[p.v][p.c]+e.cost/2;
					que.offer(new P(e.to, p.c-1, d[e.to][p.c-1]));
				}
			}
		}
		int min=INF;
		for(int i=0; i<=c; i++){
			min=min(min, d[g][i]);
		}
		min*=10;
		println(""+min);
	}

	class E{
		int to, cost;

		E(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	class P implements Comparable<P>{
		int v, c, d;

		P(int v, int c, int d){
			this.v=v;
			this.c=c;
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