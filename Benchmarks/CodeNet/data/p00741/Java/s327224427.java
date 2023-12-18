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
				if(!visited[j][i]&&a[j][i]==1){
					ans++;
					dfs(i, j);
				}
			}
		}
		println(ans+"");
	}

	void dfs(int x, int y){
		if(x<0||x>=m||y<0||y>=n){
			return;
		}
		if(visited[y][x]){
			return;
		}
		if(a[y][x]!=1){
			return;
		}
		visited[y][x]=true;
		for(int j=-1; j<=1; j++){
			for(int i=-1; i<=1; i++){
				if((i|j)!=0){
					dfs(x+i, y+j);
				}
			}
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