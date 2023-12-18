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
		long[][] dp=new long[n+1][m];
		for(int i=0; i<m; i++){
			if(a[0][i]==0){
				dp[0][i]=1;
			}
		}
		for(int j=0; j<n-1; j++){
			for(int i=0; i<m; i++){
				switch(a[j][i]){
				case 0:
					if(i-1>=0&&a[j+1][i-1]==0)
						dp[j+1][i-1]+=dp[j][i];
					if(a[j+1][i]!=1)
						dp[j+1][i]+=dp[j][i];
					if(i+1<m&&a[j+1][i+1]==0)
						dp[j+1][i+1]+=dp[j][i];
					break;
				case 2:
					if(j>=n-2||a[j+2][i]!=1)
						dp[j+2][i]+=dp[j][i];
					break;
				}
			}
		}
		long ans=0;
		for(int j=n-1; j<n+1; j++){
			for(int i=0; i<m; i++){
				ans+=dp[j][i];
			}
		}
		println(ans+"");
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