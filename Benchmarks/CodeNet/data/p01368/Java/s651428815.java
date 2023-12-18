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
		int match=bm(vs);
		for(int i=0; i<l*2; i++){
			// debug(i, ":", vs[i].pair!=null?vs[i].pair.i:-1);
		}
		int ans=0;

		init();
		for(int i=0; i<l; i++){
			if(vs[i].pair!=null)
				union(i, vs[i].pair.i);
		}

		TreeSet<Integer> set=new TreeSet<Integer>();
		//debug("pa", pa);
		for(int i=0; i<l; i++){
			// set.add(find(pa[i]));
		}
		ans=set.size();

		println(ans+"");
	}

	int bm(V[] vs){
		int match=0;
		for(V v : vs){
			if(v.pair==null){
				for(V u : vs){
					u.used=false;
				}
				if(dfs(v)){
					match++;
				}
			}
		}
		return match;
	}

	boolean dfs(V v){
		v.used=true;
		for(V u : v){
			V w=u.pair;
			if(w==null||!w.used&&dfs(w)){
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
		int i;

		V(int i){
			this.i=i;
		}

		void connect(V v){
			add(v);
			v.add(this);
		}
	}

	int[] pa, rank;

	void init(){
		pa=new int[l];
		rank=new int[l];
		for(int i=0; i<l; i++){
			pa[i]=i;
		}
	}

	int find(int x){
		if(pa[x]==x){
			return x;
		}else{
			return pa[x]=find(pa[x]);
		}
	}

	void union(int x, int y){
		x=find(x);
		y=find(y);
		if(rank[x]>rank[y]){
			pa[y]=x;
		}else{
			pa[x]=y;
			if(rank[x]==rank[y]){
				rank[y]++;
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
		try{
			// System.setIn(new FileInputStream("in.txt"));
		}catch(Throwable e){
			e.printStackTrace();
		}
		new Main().run();
	}
}