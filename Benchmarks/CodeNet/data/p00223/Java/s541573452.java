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
	R r0;
	int[][] a;

	void run(){
		byte[][][][] d=new byte[50][50][50][50];
		boolean[][][][] b=new boolean[50][50][50][50];
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			int tx=sc.nextInt()-1;
			int ty=sc.nextInt()-1;
			int kx=sc.nextInt()-1;
			int ky=sc.nextInt()-1;
			r0=new R(tx, ty, kx, ky);
			a=new int[n][m];
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					a[j][i]=sc.nextInt();
				}
			}
			// solve();
		}
	}

	void solve(){
		LinkedList<R> que=new LinkedList<R>();
		boolean[][][][] visited=new boolean[n][m][n][m];
		int[][][][] d=new int[n][m][n][m];

		// que.offer(new R)
		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};
		que.offer(r0);

		for(; !que.isEmpty();){
			R r=que.poll();
			// debug(r.tx, r.ty, r.kx, r.ky, d[r.ty][r.tx][r.ky][r.kx]);
			if(d[r.ty][r.tx][r.ky][r.kx]>=100){
				println("NA");
				return;
			}
			if(r.tx==r.kx&&r.ty==r.ky){
				println(d[r.ty][r.tx][r.ky][r.kx]+"");
				return;
			}
			for(int i=0; i<4; i++){
				int tx2=min(max(r.tx+dx[i], 0), m-1);
				int ty2=min(max(r.ty+dy[i], 0), n-1);
				int kx2=min(max(r.kx-dx[i], 0), m-1);
				int ky2=min(max(r.ky-dy[i], 0), n-1);
				if(a[ty2][tx2]==1){
					tx2=r.tx;
					ty2=r.ty;
				}
				if(a[ky2][kx2]==1){
					kx2=r.kx;
					ky2=r.ky;
				}
				if(!visited[ty2][tx2][ky2][kx2]){
					visited[ty2][tx2][ky2][kx2]=true;
					que.offer(new R(tx2, ty2, kx2, ky2));
					d[ty2][tx2][ky2][kx2]=d[r.ty][r.tx][r.ky][r.kx]+1;
				}
			}
		}
		println("NA");
	}

	class R{
		int tx, ty, kx, ky;

		R(int tx, int ty, int kx, int ky){
			this.tx=tx;
			this.ty=ty;
			this.kx=kx;
			this.ky=ky;
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