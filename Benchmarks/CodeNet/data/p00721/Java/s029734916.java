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

	int n, m, c;
	int[][] a;
	P[] ps;
	int[][] w;
	int[] dx={0, 0, -1, 1};
	int[] dy={-1, 1, 0, 0};

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			ps=new P[11];
			c=1;
			a=new int[n][m];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<m; i++){
					switch(s.charAt(i)){
					case '.':
						a[j][i]=-1;
						break;
					case 'x':
						a[j][i]=-2;
						break;
					case 'o':
						a[j][i]=0;
						ps[0]=new P(i, j);
						break;
					case '*':
						a[j][i]=c;
						ps[c]=new P(i, j);
						c++;
						break;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		w=new int[c][c];
		for(int i=0; i<c; i++){
			bfs(i);
		}
		for(int j=0; j<c; j++){
			debug(w[j]);
			for(int i=0; i<c; i++){
				if(w[j][i]==-1){
					println("-1");
					return;
				}
			}
		}
		int[][] dp=new int[1<<c][c];
		for(int i=0; i<1<<c; i++){
			fill(dp[i], INF);
		}
		dp[1][0]=0;
		for(int s=1; s<1<<c; s++){
			for(int v=0; v<c; v++){
				for(int u=0; u<c; u++){
					// v->u
					if((s>>u&1)==0&&(s>>v&1)==1){
						dp[s|(1<<u)][u]=min(dp[s|(1<<u)][u], dp[s][v]+w[v][u]);
					}
				}
			}
			debug(s, dp[s]);
		}
		int min=INF;
		for(int i=1; i<c; i++){
			min=min(min, dp[(1<<c)-1][i]);
		}
		debug(min);
		println(""+min);
	}

	void bfs(int s){
		LinkedList<P> que=new LinkedList<Main.P>();
		int[][] d=new int[n][m];
		for(int j=0; j<n; j++){
			fill(d[j], -1);
		}
		d[ps[s].y][ps[s].x]=0;
		que.offer(ps[s]);
		for(; !que.isEmpty();){
			P p=que.poll();
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
				if(q.x<0||q.x>=m||q.y<0||q.y>=n){
					continue;
				}
				if(a[q.y][q.x]!=-2&&d[q.y][q.x]==-1){
					d[q.y][q.x]=d[p.y][p.x]+1;
					que.offer(q);
				}
			}
		}
		for(int i=0; i<c; i++){
			w[s][i]=w[i][s]=d[ps[i].y][ps[i].x];
		}
	}

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
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