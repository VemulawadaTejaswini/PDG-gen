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
	LinkedList<E> list;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			list=new LinkedList<E>();
			for(int i=0; i<m; i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				int cost=sc.nextInt();
				list.add(new E(a, b, cost));
			}
			solve();
		}
	}

	void solve(){
		E[] es=list.toArray(new E[0]);
		Arrays.sort(es);
		init();
		int wt=0;
		for(E e : es){
			if(find(e.v1)!=find(e.v2)){
				union(e.v1, e.v2);
				wt+=e.w;
			}
		}
		println(""+wt);
	}

	class E implements Comparable<E>{
		int v1, v2, w;

		E(int v1, int v2, int w){
			this.v1=v1;
			this.v2=v2;
			this.w=w;
		}

		@Override
		public int compareTo(E e){
			return w-e.w;
		}
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