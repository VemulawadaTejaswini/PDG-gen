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

	void run(){
		sc.useDelimiter("[,]|(\\s)+");
		n=sc.nextInt();
		m=sc.nextInt();
		@SuppressWarnings("unchecked")
		LinkedList<E>[] es=new LinkedList[n];
		for(int i=0; i<n; i++){
			es[i]=new LinkedList<E>();
		}

		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int cost1=sc.nextInt();
			int cost2=sc.nextInt();
			es[u].add(new E(v, cost1));
			es[v].add(new E(u, cost2));
		}

		int s=sc.nextInt()-1;
		int g=sc.nextInt()-1;
		int m1=sc.nextInt();
		int m2=sc.nextInt();

		int ans=m1-m2-(dijkstra(es, s, g)+dijkstra(es, g, s));
		println(""+ans);
	}

	int dijkstra(LinkedList<E>[] es, int s, int g){
		int n=es.length;
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
			// debug(p);
			for(E e : es[p.v]){
				// debug("\t"+e.to);
				if(d[e.to]>d[p.v]+e.cost){
					d[e.to]=d[p.v]+e.cost;
					que.offer(new P(e.to, d[e.to]));
				}
			}
			// debug(d);
		}
		// debug();
		return d[g];
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

		@Override
		public String toString(){
			return v+","+d;
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