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
	int s, g;
	LinkedList<E>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			es=new LinkedList[n];
			for(int i=0; i<n; i++){
				es[i]=new LinkedList<E>();
			}
			s=sc.nextInt()-1;
			g=sc.nextInt()-1;
			for(int i=0; i<m; i++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				int d=sc.nextInt();
				int c=sc.nextInt();
				es[x].add(new E(y, d, c));
				es[y].add(new E(x, d, c));
			}
			solve();
		}
	}

	void solve(){
		double[][][] d=new double[n][n][40];
		PriorityQueue<P> que=new PriorityQueue<P>();
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				fill(d[j][i], INF);
			}
		}
		// Uツタツーツδ督づ債凝鳴止
		// [ツ前][ツ債。][ツ陳つ「ツつスツ瞬ツ甘板づ個堕ャツ度]
		d[s][s][1]=0;
		que.offer(new P(s, s, 0, 0));
		for(; !que.isEmpty();){
			P p=que.poll();
			// debug(p.q, p.p, p.v,p.d);
			if(d[p.q][p.p][p.v]+EPS<p.d){
				continue;
			}
			for(E e : es[p.p]){
				if(p.q==e.to){
					continue;
				}
				for(int i=-1; i<=1; i++){
					if(p.v+i<=0||p.v+i>e.c){
						continue;
					}
					if(d[p.p][e.to][p.v+i]>p.d+(double)e.d/(p.v+i)+EPS){
						d[p.p][e.to][p.v+i]=p.d+(double)e.d/(p.v+i);
						que.offer(new P(p.p, e.to, p.v+i, d[p.p][e.to][p.v+i]));
					}
				}
			}
		}
		double min=INF;
		for(int i=0; i<n; i++){
			min=min(min, d[i][g][1]);
		}
		// debug(min);
		println(""+(min<INF/2?min:"unreachable"));
	}

	class E{
		int to, d, c;

		E(int to, int d, int c){
			this.to=to;
			this.d=d;
			this.c=c;
		}
	}

	class P implements Comparable<P>{
		int q, p, v;
		double d;

		P(int q, int p, int v, double d){
			this.q=q;
			this.p=p;
			this.v=v;
			this.d=d;
		}

		@Override
		public int compareTo(P p){
			if(d+EPS<p.d){
				return -1;
			}else if(d>p.d+EPS){
				return 1;
			}else{
				return 0;
			}
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