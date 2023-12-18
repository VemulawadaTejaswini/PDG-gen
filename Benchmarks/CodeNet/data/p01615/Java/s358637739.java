import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int[] a, b, c;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		c=new int[m];
		for(int i=0; i<m; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int[][] max=new int[n][n];
		for(int i=0; i<n; i++){
			fill(max[i], -INF);
		}
		for(int i=0; i<m; i++){
			max[a[i]][b[i]]=c[i];
		}
//		debug(max);
		for(int k=0; k<n; k++){
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					max[i][j]=max(max[i][j], max[i][k]+max[k][j]);
				}
			}
//			debug(max);
		}
		println(max[0][n-1]+"");
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
		new Main().run();
	}
}