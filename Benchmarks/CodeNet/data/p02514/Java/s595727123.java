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
	int[] x, y, c;
	int[] parent;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((m|n)==0){
				break;
			}
			x=new int[m];
			y=new int[m];
			c=new int[m];
			parent=new int[n];
			fill(parent, -1);
			for(int i=0; i<m; i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				c[i]=sc.nextInt();
				parent[y[i]]=x[i];
			}
			solve();
		}
	}

	int[][] w;
	boolean[][] exist;
	boolean[] visited;

	void solve(){
		make(n);
		for(int i=0; i<m; i++){
			union(x[i], y[i]);
		}
		int k=0;
		for(int i=0; i<n; i++){
			if(p[i]<0){
				k++;
			}
		}
		w=new int[n][n];
		exist=new boolean[n][n];
		long ans=0;
		for(int i=0; i<m; i++){
			exist[x[i]][y[i]]=true;
			if(c[i]<0){
				ans+=c[i];
				c[i]=0;
			}
			w[x[i]][y[i]]+=c[i];
			if(x[i]==y[i]){
				println("fdsfdsfds");
				return;
			}
		}
		if(k>1){
			println(ans+"");
			return;
		}
		boolean[][] used=new boolean[n][n];
		visited=new boolean[n];
		long min=1L<<40;
		for(int i=0; i<n; i++){
			fill(visited, false);
			if(dfs(i)==i){ // i->p[i]->...->i
				PriorityQueue<Integer> que=new PriorityQueue<Integer>();
				que.offer(w[parent[i]][i]);
				used[parent[i]][i]=true;
				for(int v=parent[i]; v!=i; v=parent[v]){
					que.offer(w[parent[v]][v]);
					used[parent[v]][v]=true;
				}
				if(parent[i]==i){
					println("dsadsa");
					return;
				}
				debug(que.toArray());
				min=min(min, que.poll()+que.poll());
				break;
			}
		}
		PriorityQueue<Integer> que=new PriorityQueue<Integer>();
		for(int j=0; j<n-1; j++){
			for(int i=j+1; i<n; i++){
				if(!used[j][i]&&exist[j][i]){
					que.offer(w[j][i]);
				}
			}
		}
		if(!que.isEmpty()){
			min=min(min, que.poll());
		}
		println(min+ans+"");
	}

	int dfs(int v){
		if(v==-1){
			return -1;
		}
		if(visited[v]){
			return v;
		}
		visited[v]=true;
		return dfs(parent[v]);
	}

	int[] p;

	void make(int n){
		p=new int[n];
		fill(p, -1);
	}

	int find(int x){
		return p[x]<0?x:(p[x]=find(p[x]));
	}

	boolean union(int x, int y){
		x=find(x);
		y=find(y);
		if(x!=y){
			if(p[y]<p[x]){
				int t=x;
				x=y;
				y=t;
			}
			p[x]+=p[y];
			p[y]=x;
		}
		return x!=y;
	}

	int size(int x){
		return -p[find(x)];
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