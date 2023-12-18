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
	int[][] down, right;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			down=new int[n][m];
			right=new int[n][m];
			for(int j=0; j<2*n-1; j++){
				int y=j/2;
				if(j%2==0){
					for(int i=0; i<m-1; i++){
						right[y][i]=sc.nextInt();
					}
					right[y][m-1]=1;
				}else{
					for(int i=0; i<m; i++){
						down[y][i]=sc.nextInt();
					}
				}
			}
			solve();
		}
	}

	void solve(){
		for(int j=0; j<n; j++){
			debug(j, right[j]);
		}
		debug();
		for(int j=0; j<n; j++){
			debug(j, down[j]);
		}

		// ツ湘」ツ可コツ債カツ右

		int[][][] w=new int[n+1][m+1][4];
		for(int i=0; i<m; i++){
			w[0][i][0]=1;
			w[n-1][i][1]=1;
		}
		for(int j=0; j<n; j++){
			w[j][0][2]=1;
			w[j][m-1][3]=1;
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(right[j][i]==1){
					w[j][i][3]=1;
					w[j][i+1][2]=1;
				}
				if(down[j][i]==1){
					w[j][i][1]=1;
					w[j+1][i][0]=1;
				}
			}
		}

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		LinkedList<P> que=new LinkedList<P>();
		int[][] d=new int[n][m];
		for(int j=0; j<n; j++){
			fill(d[j], -1);
		}

		que.offer(new P(0, 0));
		d[0][0]=0;

		for(; !que.isEmpty();){
			P p=que.poll();
			for(int i=0; i<4; i++){
				if(w[p.y][p.x][i]==0){
					P q=new P(p.x+dx[i], p.y+dy[i]);
					if(d[q.y][q.x]==-1){
						d[q.y][q.x]=d[p.y][p.x]+1;
						que.offer(q);
					}
				}
			}
		}
		println(d[n-1][m-1]+1+"");
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