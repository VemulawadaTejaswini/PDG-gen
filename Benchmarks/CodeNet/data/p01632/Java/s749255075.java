import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Bicycle
// 2013/09/10
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int n, m;
	int[] a, b;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		for(int i=0; i<m; i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
		}
		solve();
	}

	void solve(){
		for(int k=0; k<m; k++){
			int N=n+1;
			V[] vs=new V[N*2];
			for(int i=0; i<N*2; i++){
				vs[i]=new V();
			}
			for(int i=0; i<N; i++){
				vs[i].add(vs[i+N], 1);
			}
			for(int i=0; i<k; i++){
				vs[a[i]+N].add(vs[b[i]], 1);
				vs[b[i]+N].add(vs[a[i]], 1);
			}
			vs[a[k]+N].add(vs[n], 1);
			vs[n+N].add(vs[a[k]], 1);
			vs[b[k]+N].add(vs[n], 1);
			vs[n+N].add(vs[b[k]], 1);
			int flow=fordFulkerson(vs, vs[n+N], vs[0]);
			println(flow>=2?"Yes":"No");
			if(k%100==0){
				System.gc();
			}
		}
	}

	int fordFulkerson(V[] vs, V s, V t){
		for(int flow=0;;){
			for(V v : vs)
				v.used=false;
			int f=dfs(s, t, INF);
			flow+=f;
			if(f==0||flow>=2)
				return flow;
		}
	}

	int dfs(V v, V t, int f){
		if(v==t){
			return f;
		}
		v.used=true;
		for(E e : v.es){
			if(!e.to.used&&e.cap>0){
				int d=dfs(e.to, t, min(f, e.cap));
				if(d>0){
					e.cap-=d;
					e.rev.cap+=d;
					return d;
				}
			}
		}
		return 0;
	}

	class V{
		ArrayList<E> es=new ArrayList<E>();
		boolean used;

		void add(V to, int cap){
			E e=new E(to, cap), rev=new E(this, 0);
			e.rev=rev;
			rev.rev=e;
			es.add(e);
			to.es.add(rev);
		}
	}

	class E{
		V to;
		E rev;
		int cap;

		E(V to, int cap){
			this.to=to;
			this.cap=cap;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}