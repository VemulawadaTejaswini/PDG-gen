import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int n,m,p,a,b;
	int[] t;
	LinkedList<E>[] es;
	
	@SuppressWarnings("unchecked")
	void run() {
		for(;;){
			n=sc.nextInt(); // ツ馬
			m=sc.nextInt(); // ツ都ツ市
			p=sc.nextInt(); // ツ督ケツ路
			a=sc.nextInt();
			b=sc.nextInt();
			if((n|m|p|a|b)==0){
				break;
			}
			a--;
			b--;
			es=new LinkedList[m];
			for(int i=0;i<m;i++){
				es[i]=new LinkedList<E>();
			}
			t=new int[n];
			for(int i=0;i<n;i++){
				t[i]=sc.nextInt();
			}
			for(int i=0;i<p;i++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				int z=sc.nextInt();
				es[x].add(new E(y,z));
				es[y].add(new E(x,z));
			}
			solve();
		}
	}
	
	void solve() {
		double[][] d=new double[m][1<<n];
		for(int i=0;i<m;i++){
			fill(d[i],INF);
		}
		d[a][(1<<n)-1]=0;
		PriorityQueue<P> que=new PriorityQueue<P>();
		que.offer(new P(a,(1<<n)-1,0));
		for(;!que.isEmpty();){
			P p=que.poll();
//			debug(p.v,Integer.toBinaryString(p.s),p.d);
			if(p.d>d[p.v][p.s]+EPS){
				continue;
			}
			for(E e:es[p.v]){
				for(int i=0;i<n;i++){
					if((p.s>>i&1)==1){
						P q=new P(e.to,p.s&~(1<<i),p.d+(double)e.cost/t[i]);
						if(q.d<d[q.v][q.s]){
							d[q.v][q.s]=q.d;
							que.offer(q);
						}
					}
				}
			}
		}
		double min=INF;
		for(int i=0;i<1<<n;i++){
			min=min(min,d[b][i]);
		}
		if(min==INF){
			println("Impossible");
		}else{
			println(min+"");
		}
	}
	
	class P implements Comparable<P>{
		int v,s;
		double d;
		P(int v,int s,double d){
			this.v=v;
			this.s=s;
			this.d=d;
		}
		@Override
		public int compareTo(P p) {
			if(d+EPS<p.d){
				return -1;
			}else if(d>p.d+EPS){
				return 1;
			}else{
				return 0;
			}
		}
	}
	
	class E{
		int to,cost;
		E(int to,int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}