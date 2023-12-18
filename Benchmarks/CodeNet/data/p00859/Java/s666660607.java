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
	E[] es;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n==0){
				break;
			}
			es=new E[m];
			for(int i=0; i<m; i++){
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				int w=sc.nextInt();
				es[i]=new E(u, v, w);
			}
			solve();
		}
	}

	int[] p, rank;

	void solve(){
		Arrays.sort(es, new Comparator<E>(){
			@Override
			public int compare(E e1, E e2){
				return e1.w-e2.w;
			}
		});

		p=new int[n];
		rank=new int[n];
		int ans=-1;

		for(int j=0; j<m; j++){
			// union-find tree
			for(int i=0; i<n; i++){
				p[i]=i;
				rank[i]=0;
			}
			int min=es[j].w;
			int max=min;
			for(int i=j; i<m; i++){
				// ツ枝ツづーツ津嘉つキツづゥツつイツづづ盈axツ更ツ新
				if(find(es[i].u)!=find(es[i].v)){
					union(es[i].u, es[i].v);
					max=Math.max(max, es[i].w);
				}
			}
			// ツ全ツ暗ヲツ姪伉つゥツづつ、ツつゥ
			boolean f=true;
			for(int i=0; i<n; i++){
				f&=find(i)==find(0);
			}
			if(f){
				if(ans==-1||max-min<ans){
					ans=Math.min(INF, max-min);
				}
			}
		}
		println(""+ans);
	}

	int find(int x){
		if(p[x]==x){
			return x;
		}else{
			return p[x]=find(p[x]);
		}
	}

	void union(int x, int y){
		x=find(x);
		y=find(y);
		if(x==y){
			return;
		}

		if(rank[x]<rank[y]){
			p[x]=y;
		}else{
			p[y]=x;
			if(rank[x]==rank[y]){
				rank[x]++;
			}
		}
	}

	class E{
		int u, v, w;

		E(int u, int v, int w){
			this.u=u;
			this.v=v;
			this.w=w;
		}
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