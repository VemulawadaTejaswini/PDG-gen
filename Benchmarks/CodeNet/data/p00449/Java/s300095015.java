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

	int n, k;
	LinkedList<E>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			k=sc.nextInt();
			if((n|k)==0){
				break;
			}
			es=new LinkedList[n];
			for(int i=0; i<n; i++){
				es[i]=new LinkedList<E>();
			}
			for(int i=0; i<k; i++){
				if(sc.nextInt()==0){
					int a=sc.nextInt()-1;
					int b=sc.nextInt()-1;
					println(dijkstra(a, b)+"");
				}else{
					int u=sc.nextInt()-1;
					int v=sc.nextInt()-1;
					int w=sc.nextInt();
					es[u].add(new E(v, w));
					es[v].add(new E(u, w));
				}
			}
		}
	}

	int dijkstra(int s, int g){
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
		return d[g]<INF?d[g]:-1;
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