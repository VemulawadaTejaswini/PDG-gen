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

	int[][] a, b;
	int[][] tmp;
	int n;

	void run(){
		n=10;
		for(int m=sc.nextInt(); m>0; m--){
			a=new int[n][n];
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					a[j][i]=sc.nextInt();
				}
			}
			solve();
		}
	}

	void solve(){
		tmp=new int[n][n];
		b=new int[n][n];
		for(int sup=0; sup<1<<n; sup++){
			for(int j=0; j<n; j++){
				System.arraycopy(a[j], 0, tmp[j], 0, n);
				Arrays.fill(b[j], 0);
			}
			for(int i=0; i<n; i++){
				if(((sup>>i)&1)!=0){
					reverse(i, 0);
				}
			}
			for(int j=1; j<n; j++){
				for(int i=0; i<n; i++){
					if(tmp[j-1][i]==1){
						reverse(i, j);
					}
				}
			}
			int c=0;
			for(int i=0;i<n;i++){
				c+=tmp[n-1][i];
			}
			if(c==0){
				for(int j=0;j<n;j++){
					for(int i=0;i<n;i++){
						print(b[j][i]+(i==n-1?"\n":" "));
					}
				}
				return;
			}
		}
	}

	void reverse(int x, int y){
		int[] dx={0, 0, 0, -1, 1};
		int[] dy={0, -1, 1, 0, 0};
		for(int i=0; i<5; i++){
			int x2=x+dx[i];
			int y2=y+dy[i];
			if(x2>=0&&x2<n&&y2>=0&&y2<n){
				tmp[y2][x2]=1-tmp[y2][x2];
			}
		}
		b[y][x]=1-b[y][x];
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