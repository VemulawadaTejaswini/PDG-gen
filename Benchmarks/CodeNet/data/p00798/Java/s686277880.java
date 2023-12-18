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
	int mx0, my0, cx0, cy0, gx, gy;

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
					if(a[j][i]==2){
						// Éà
						cx0=i;
						cy0=j;
						a[j][i]=0;
					}else if(a[j][i]==3){
						// S[
						gx=i;
						gy=j;
						a[j][i]=0;
					}else if(a[j][i]==4){
						// l
						mx0=i;
						my0=j;
						a[j][i]=0;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		LinkedList<P> que=new LinkedList<P>();
		boolean[][][][] visited=new boolean[m][n][m][n];
		int[][][][] d=new int[m][n][m][n];

		for(int k=0; k<m; k++){
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					fill(d[k][j][i], INF);
				}
			}
		}

		que.add(new P(mx0, my0, cx0, cy0));
		visited[mx0][my0][cx0][cy0]=true;
		d[mx0][my0][cx0][cy0]=0;

		int[] dx={0, 0, -1, 1};
		int[] dy={1, -1, 0, 0};

		for(; !que.isEmpty();){
			P p=que.poll();
			for(int i=0; i<4; i++){
				P q=new P(p.mx+dx[i], p.my+dy[i], p.cx, p.cy);
				int push=0;
				// lªæÊOorÚ®sÂ
				if(q.mx<0||q.mx>=m||q.my<0||q.my>=n||a[q.my][q.mx]==1){
					continue;
				}
				// lÌÚ®æªubN
				if(q.mx==q.cx&&q.my==q.cy){
					q.cx+=dx[i];
					q.cy+=dy[i];
					push=1;
				}
				// ubNªæÊOorzusÂ
				if(q.cx<0||q.cx>=m||q.cy<0||q.cy>=n||a[q.cy][q.cx]==1){
					continue;
				}
				// KâµÄ¢È¢
				if(!visited[q.mx][q.my][q.cx][q.cy]){
					que.offer(q);
					visited[q.mx][q.my][q.cx][q.cy]=true;
					d[q.mx][q.my][q.cx][q.cy]=d[p.mx][p.my][p.cx][p.cy]+push;
				}
			}
		}

		int min=INF;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				min=min(min, d[i][j][gx][gy]);
			}
		}

		println(""+(min==INF?-1:min));

	}

	class P{
		int mx, my, cx, cy;

		P(int mx, int my, int cx, int cy){
			this.mx=mx;
			this.my=my;
			this.cx=cx;
			this.cy=cy;
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