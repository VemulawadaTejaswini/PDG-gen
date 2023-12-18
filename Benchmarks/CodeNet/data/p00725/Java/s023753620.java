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
	int sx, sy, gx, gy;
	int[] dxs={0, 0, -1, 1};
	int[] dys={-1, 1, 0, 0};

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
					int c=sc.nextInt();
					if(c==2){
						sx=i;
						sy=j;
					}else if(c==3){
						gx=i;
						gy=j;
					}else{
						a[j][i]=c;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		int ans=11;
		for(int i=0; i<4; i++){
			ans=min(ans, dfs(sx, sy, dxs[i], dys[i]));
		}
		println(""+(ans<11?ans:-1));
	}

	int dfs(int x, int y, int dx, int dy){
		// debug(x, y, dx, dy);
		for(int t=0;; t++){
			x+=dx;
			y+=dy;
			if(x<0||x>=m||y<0||y>=n){
				return INF;
			}
			if(x==gx&&y==gy){
				return 1;
			}
			if(a[y][x]==1){
				if(t==0){
					return INF;
				}else{
					break;
				}
			}
		}
		// debug(x, y);
		a[y][x]=0;
		int ret=INF;
		for(int i=0; i<4; i++){
			ret=min(ret, dfs(x-dx, y-dy, dxs[i], dys[i]));
		}
		a[y][x]=1;
		return ret+1;
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