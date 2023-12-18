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
	int sx, sy, gx, gy;
	int[][] a;

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
					// 0:Ç
					// 1:ó
					// 2:ú
					// 3:S[
					// 4:H¢¨
					if(a[j][i]==2){
						sx=i;
						sy=j;
						a[j][i]=1;
					}else if(a[j][i]==3){
						gx=i;
						gy=j;
						a[j][i]=1;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		int max=7;
		int[][][] d=new int[n][m][max];
		boolean[][][] visited=new boolean[n][m][max];
		LinkedList<P> que=new LinkedList<P>();

		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				fill(d[j][i], INF);
			}
		}

		que.offer(new P(sx, sy, 6));
		d[sy][sx][6]=0;
		visited[sy][sx][6]=true;

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		for(; !que.isEmpty();){
			P p=que.poll();
			// debug(p.x, p.y, p.hp);
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i], p.hp-1);
				// debug(q.x, q.y, q.hp);
				if(q.x>=0&&q.x<m&&q.y>=0&&q.y<n&&a[q.y][q.x]!=0&&q.hp>0){
					if(a[q.y][q.x]==4){
						q.hp=6;
					}
					if(!visited[q.y][q.x][q.hp]){
						que.offer(q);
						d[q.y][q.x][q.hp]=d[p.y][p.x][p.hp]+1;
						visited[q.y][q.x][q.hp]=true;
					}
				}
			}
		}

		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				// debug(i, j, d[j][i]);
			}
		}

		// debug(d[gy][gx]);

		int ans=INF;
		for(int k=0; k<max; k++){
			ans=min(ans, d[gy][gx][k]);
		}
		println((ans!=INF?ans:-1)+"");
	}

	class P{
		int x, y, hp;

		P(int x, int y, int hp){
			this.x=x;
			this.y=y;
			this.hp=hp;
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