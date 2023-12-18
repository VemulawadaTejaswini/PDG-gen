import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);
	int INF=1<<28;
	double EPS=1e-9;

	int n, m, l;
	int[][] w;
	int[] p, t;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			l=sc.nextInt();
			if((n|m|l)==0){
				break;
			}
			w=new int[n][n];
			p=new int[l];
			t=new int[l];
			for(int i=0; i<n; i++){
				Arrays.fill(w[i], INF);
				w[i][i]=0;
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt();
				int v=sc.nextInt();
				int d=sc.nextInt();
				w[u][v]=w[v][u]=d;
			}
			for(int i=0; i<l; i++){
				p[i]=sc.nextInt();
				t[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		for(int k=0; k<n; k++){
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					w[i][j]=Math.min(w[i][j], w[i][k]+w[k][j]);
				}
			}
		}
		V[] vs=new V[l*2];
		for(int i=0; i<l*2; i++){
			vs[i]=new V(i%l);
		}
		for(int j=0; j<l; j++){
			for(int i=0; i<l; i++){
				if(i==j){
					continue;
				}
				int u=p[i];
				int v=p[j];
				if(t[i]+w[u][v]<=t[j]){
					vs[i].connect(vs[j+l]);
				}
			}
		}
		/*
		 * for(int i=0; i<l*2; i++){ debug("i:", i); for(V v : vs[i]){
		 * debug(v.i); } }
		 */
		int match=hopcroftKarp(vs);
		int ans=l-match;
		//debug("match", match);
		//debug("ans",ans);
		for(int i=0; i<l*2; i++){
			// debug(i, ":", vs[i].pair!=null?vs[i].pair.i:-1);
		}

		println(ans+"");
	}

	int hopcroftKarp(V[] vs){
		for(int match=0;;){
			Queue<V> que=new LinkedList<V>();
			for(V v : vs){
				v.level=-1;
			}
			for(V v : vs){
				if(v.pair==null){
					v.level=0;
					que.offer(v);
				}
			}
			for(; !que.isEmpty();){
				V v=que.poll();
				for(V u : v){
					V w=u.pair;
					if(w!=null&&w.level<0){
						w.level=v.level+1;
						que.offer(w);
					}
				}
			}
			for(V v : vs){
				v.used=false;
			}
			int d=0;
			for(V v : vs){
				if(v.pair==null&&dfs(v)){
					d++;
				}
			}
			if(d==0){
				return match;
			}
			match+=d;
		}
	}

	boolean dfs(V v){
		v.used=true;
		for(V u : v){
			V w=u.pair;
			if(w==null||!w.used&&v.level<w.level&&dfs(w)){
				v.pair=u;
				u.pair=v;
				return true;
			}
		}
		return false;
	}

	class V extends LinkedList<V>{
		V pair;
		boolean used;
		int i, level;

		V(int i){
			this.i=i;
		}

		void connect(V v){
			add(v);
			v.add(this);
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
		try{
			// System.setIn(new FileInputStream("in.txt"));
		}catch(Throwable e){
			e.printStackTrace();
		}
		new Main().run();
	}
}