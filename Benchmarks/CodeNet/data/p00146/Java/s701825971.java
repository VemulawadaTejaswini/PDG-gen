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

	int n;
	int[] name, d, w;

	void run(){
		n=sc.nextInt();
		name=new int[n];
		d=new int[n];
		w=new int[n];
		for(int i=0; i<n; i++){
			name[i]=sc.nextInt();
			d[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		// ツづづェツづーツ篠敖づづつ「ツづゥツ，ツつ「ツづ慊づつア
		double[][] dp=new double[1<<n][n];
		int[][] p=new int[1<<n][n];
		int[] ws=new int[1<<n];

		for(int k=0; k<1<<n; k++){
			for(int i=0; i<n; i++){
				ws[k|(1<<i)]=ws[k]+20*w[i];
			}
		}

		for(int k=1; k<1<<n; k++){
			Arrays.fill(dp[k], INF);
		}

		for(int k=0; k<1<<n; k++){
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					if((k>>i&1)==0){
						double t=dp[k][j]+Math.abs(d[i]-d[j])/2000.0*(70+ws[k]);
						if(t+EPS<dp[k|(1<<i)][i]){
							dp[k|(1<<i)][i]=t;
							p[k|(1<<i)][i]=j;
						}
					}
				}
			}
		}

		/*
		for(int k=0; k<1<<n; k++){
			debug(k, dp[k]);
		}

		debug();
		for(int k=0; k<1<<n; k++){
			debug(k, p[k]);
		}
*/
		int m=0;
		for(int i=0; i<n; i++){
			if(dp[(1<<n)-1][i]+EPS<dp[(1<<n)-1][m]){
				m=i;
			}
		}

		// if(1!=1)
		// return;

		// debug("ans");

		LinkedList<Integer> path=new LinkedList<Integer>();

		for(int i=m, sup=(1<<n)-1; sup!=0;){
			//debug(i, name[i]);
			path.addFirst(i);
			int j=p[sup][i];
			sup&=~(1<<i);
			i=j;
		}

		for(int i=0; i<path.size(); i++){
			print(name[path.get(i)]+(i==path.size()-1?"\n":" "));
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