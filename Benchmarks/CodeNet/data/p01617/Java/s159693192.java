import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Twins Idol
// 2013/03/21
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int n1, m1, n2, m2;
	char[] cs1, cs2;
	int[] a1, b1, a2, b2;

	void run(){
		n1=sc.nextInt();
		m1=sc.nextInt();
		cs1=new char[n1];
		a1=new int[m1];
		b1=new int[m1];
		for(int i=0; i<n1; i++){
			cs1[i]=sc.next().charAt(0);
		}
		for(int i=0; i<m1; i++){
			a1[i]=sc.nextInt()-1;
			b1[i]=sc.nextInt()-1;
		}

		n2=sc.nextInt();
		m2=sc.nextInt();
		cs2=new char[n2];
		a2=new int[m2];
		b2=new int[m2];
		for(int i=0; i<n2; i++){
			cs2[i]=sc.next().charAt(0);
		}
		for(int i=0; i<m2; i++){
			a2[i]=sc.nextInt()-1;
			b2[i]=sc.nextInt()-1;
		}
		solve();
	}

	void solve(){
		U[] us1=compress(n1, m1, cs1, a1, b1), us2=compress(n2, m2, cs2, a2, b2);
		int k1=us1.length, k2=us2.length;

		int[][] tab=new int[k1][k2];
		for(int i=0; i<k1; i++){
			for(int j=0; j<k2; j++){
				boolean match=false;
				for(int k=0; k<256; k++){
					match|=us1[i].has[k]&&us2[j].has[k];
				}
				if(match){
					if(us1[i].inf&&us2[j].inf){
						tab[i][j]=INF;
					}else{
						tab[i][j]=1;
					}
				}
			}
		}
		int[][] dp=new int[k1][k2];
		int max=0;
		for(int u=0; u<k1; u++){
			for(int v=0; v<k2; v++){
				dp[u][v]=max(dp[u][v], tab[u][v]);
				for(int i : us1[u]){
					for(int j : us2[v]){
						boolean ok=tab[u][v]==0;
						ok|=(i!=u||us1[u].inf)&&(j!=v||us2[v].inf);
						if(ok){
							dp[i][j]=min(max(dp[i][j], dp[u][v]+tab[i][j]), INF);
						}
					}
				}
				max=max(max, dp[u][v]);
			}
		}
		println(""+(max<INF?max:-1));
	}

	U[] compress(int n, int m, char[] cs, int[] a, int[] b){
		V[] vs=new V[n];
		for(int i=0; i<n; i++){
			vs[i]=new V(cs[i]);
		}
		for(int i=0; i<m; i++){
			vs[a[i]].connect(vs[b[i]]);
		}
		int k=scc(vs);
		U[] us=new U[k];
		for(int i=0; i<k; i++){
			us[i]=new U();
		}
		boolean[][] g=new boolean[k][k];
		for(V v : vs){
			us[v.comp].has[v.c]=true;
			for(V u : v.es){
				g[v.comp][u.comp]=true;
			}
		}
		for(int i=0; i<k; i++){
			for(int j=0; j<k; j++){
				if(g[i][j]){
					if(i==j){
						us[i].inf=true;
					}else{
						us[i].add(j);
					}
				}
			}
			us[i].add(i);
		}
		return us;
	}

	LinkedList<V> list;

	int scc(V[] vs){
		list=new LinkedList<V>();
		for(V v : vs)
			dfs(v);
		for(V v : vs)
			v.visit=false;
		int k=0;
		for(V u : list)
			if(!u.visit)
				revdfs(u, k++);
		return k;
	}

	void dfs(V v){
		if(v.visit)
			return;
		v.visit=true;
		for(V u : v.es)
			dfs(u);
		list.addFirst(v);
	}

	void revdfs(V v, int k){
		if(v.visit)
			return;
		v.visit=true;
		v.comp=k;
		for(V u : v.rs)
			revdfs(u, k);
	}

	class V{
		ArrayList<V> es=new ArrayList<V>(), rs=new ArrayList<V>();
		boolean visit;
		int comp;
		char c;

		V(char c){
			this.c=c;
		}

		void connect(V v){
			es.add(v);
			v.rs.add(this);
		}
	}

	class U extends ArrayList<Integer>{
		boolean[] has=new boolean[256];
		boolean inf;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}