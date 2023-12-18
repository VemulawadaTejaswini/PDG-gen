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
	boolean[][] visited;

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
			solve();
		}
	}

	void solve(){
		visited=new boolean[n][m];
		int ans=0;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				// debug(i, j, rec(j, i));
				ans=max(ans, rec(j, i));
			}
		}
		println(ans+"");
	}

	int rec(int x, int y){
		if(x<0||x>=m||y<0||y>=n){
			return 0;
		}
		if(a[y][x]==0){
			return 0;
		}
		if(visited[y][x]){
			return 0;
		}
		visited[y][x]=true;

		int res=0;
		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};
		for(int i=0; i<4; i++){
			res=max(res, rec(x+dx[i], y+dy[i])+1);
		}
		visited[y][x]=false;

		return res;
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