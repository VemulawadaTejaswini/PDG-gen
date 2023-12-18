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
	int[][] w;

	void run(){
		sc.useDelimiter("[,]|(\\s)+");
		for(; sc.hasNext();){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=sc.nextInt();
			w=new int[n][n];
			for(int i=0; i<n; i++){
				Arrays.fill(w[i], -1);
			}
			for(int i=0; i<m; i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt()/100;
				w[a][b]=w[b][a]=c;
			}
			solve();
		}
	}

	// w[i][j]=w[j][i]
	// w[i][j]=-1 -> E(i, j) not exist
	void solve(){
		init();
		LinkedList<E> list=new LinkedList<E>();

		for(int j=0; j<n-1; j++)
			for(int i=j+1; i<n; i++)
				if(w[j][i]!=-1)
					list.add(new E(j, i, w[j][i]));

		E[] es=list.toArray(new E[0]);
		Arrays.sort(es, new Comparator<E>(){
			@Override
			public int compare(E e1, E e2){
				return e1.w-e2.w;
			}
		});

		list.clear();
		int ans=0;
		for(E e : es){
			if(find(e.v1)!=find(e.v2)){
				union(e.v1, e.v2);
				ans+=e.w-1;
				list.add(e);
			}
		}
		println(""+ans);
	}

	int[] p, rank;

	void init(){
		p=new int[n];
		rank=new int[n];
		for(int i=0; i<n; i++){
			p[i]=i;
			rank[i]=0;
		}
	}

	int find(int x){
		if(p[x]==x)
			return x;
		else
			return p[x]=find(p[x]);
	}

	void union(int x, int y){
		x=find(x);
		y=find(y);
		if(rank[x]>rank[y]){
			p[y]=x;
		}else{
			p[x]=y;
			if(rank[x]==rank[y])
				rank[y]++;
		}
	}

	class E{
		int v1, v2, w;

		E(int v1, int v2, int w){
			this.v1=v1;
			this.v2=v2;
			this.w=w;
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