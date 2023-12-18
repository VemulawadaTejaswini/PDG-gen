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
	int[][] a, b;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[m][m];
			b=new int[n][n];
			for(int j=0; j<m; j++){
				for(int i=0; i<m; i++){
					a[j][i]=sc.nextInt();
				}
			}
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					b[j][i]=sc.nextInt();
				}
			}
			solve();
		}
	}

	void solve(){
		int[][][] c=new int[4][n][n];
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				c[0][j][i]=b[j][i];
				c[1][i][n-1-j]=b[j][i];
				c[2][n-1-j][n-1-i]=b[j][i];
				c[3][n-1-i][j]=b[j][i];
			}
		}

		int p=n*n;
		for(int i=0; i<4; i++){
			p=min(p,match(c[i]));
		}
		if(p==n*n){
			println("NA");
		}else{
			println((p%n+1)+" "+(p/n+1));
		}

	}

	int match(int[][] c){
		for(int y=0; y+n<=m; y++){
			for(int x=0; x+n<=m; x++){
				boolean f=true;
				for(int j=0; j<n; j++){
					for(int i=0; i<n; i++){
						f&=c[j][i]==-1||c[j][i]==a[y+j][x+i];
					}
				}
				if(f){
					for(int j=0; j<n; j++){
						for(int i=0; i<n; i++){
							if(c[j][i]!=-1){
								return (y+j)*n+(x+i);
							}
						}
					}
				}
			}
		}
		return n*n;
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