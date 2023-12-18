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
	int[][] a;
	int[] c;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[n][m];
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					a[j][i]=sc.nextInt();
				}
			}
			c=new int[4];
			for(int i=0; i<4; i++){
				c[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int[][][] d=new int[n][m][4];
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				fill(d[j][i], INF);
			}
		}
		int[] dx={1, 0, -1, 0};
		int[] dy={0, 1, 0, -1};
		PriorityQueue<P> que=new PriorityQueue<P>();
		que.offer(new P(0, 0, 0));
		d[0][0][0]=0;
		for(; !que.isEmpty();){
			P p=que.poll();
			if(p.d>d[p.y][p.x][p.v]){
				continue;
			}
			int[] cost=c.clone();
			if(a[p.y][p.x]!=4){
				cost[a[p.y][p.x]]=0;
			}
			for(int i=0; i<4; i++){
				P q=new P(p.x, p.y, (p.v+i)%4);
				q.x+=dx[q.v];
				q.y+=dy[q.v];
				if(q.x<0||q.x>=m||q.y<0||q.y>=n){
					continue;
				}
				if(d[q.y][q.x][q.v]>d[p.y][p.x][p.v]+cost[i]){
					q.d=d[q.y][q.x][q.v]=d[p.y][p.x][p.v]+cost[i];
					que.offer(q);
				}
			}
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				// debug(j, i, d[j][i]);
			}
		}
		// debug(d[n-1][m-1]);
		int ans=INF;
		for(int i=0; i<4; i++){
			ans=min(ans, d[n-1][m-1][i]);
		}
		println(ans+"");
	}

	class P implements Comparable<P>{
		int x, y, v;
		int d;

		P(int x, int y, int v){
			this.x=x;
			this.y=y;
			this.v=v;
		}

		@Override
		public int compareTo(P p){
			return d-p.d;
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