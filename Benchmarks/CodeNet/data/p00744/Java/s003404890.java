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

	int m, n;
	int[] a, b;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[m];
			b=new int[n];
			for(int i=0; i<m; i++){
				a[i]=sc.nextInt();
			}
			for(int i=0; i<n; i++){
				b[i]=sc.nextInt();
			}
			solve();
		}
	}

	V[] vs;

	void solve(){
		vs=new V[n+m+2];
		for(int i=0; i<n+m+2; i++){
			vs[i]=new V();
		}

		int s=n+m, t=s+1;

		for(int i=0; i<m; i++){
			vs[s].add(vs[i], 1);
		}

		for(int i=0; i<n; i++){
			vs[m+i].add(vs[t], 1);
		}

		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(gcd(a[i], b[j])>1){
					vs[i].add(vs[m+j], 1);
				}
			}
		}
		println(maxFlow(vs[s], vs[t])+"");
	}

	int maxFlow(V s, V t){
		int flow=0;
		for(;;){
			for(V v : vs){
				v.used=false;
			}
			int f=dfs(s, t, INF);
			if(f==0){
				return flow;
			}
			flow+=f;
		}
	}

	int dfs(V v, V to, int f){
		if(v==to){
			return f;
		}
		v.used=true;
		for(E e : v.es){
			if(!e.to.used&&e.cap>0){
				int d=dfs(e.to, to, min(f, e.cap));
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
		LinkedList<E> es=new LinkedList<E>();
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

	int gcd(int m, int n){
		for(; n!=0;){
			int t=m%n;
			m=n;
			n=t;
		}
		return m;
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