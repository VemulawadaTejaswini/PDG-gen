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
	int[] ss, ls, ps, ws;

	void run(){
		n=sc.nextInt();
		ss=new int[n];
		ls=new int[n];
		ps=new int[n];
		for(int i=0; i<n; i++){
			ss[i]=sc.nextInt();
			ls[i]=sc.nextInt();
			ps[i]=sc.nextInt();
		}
		m=sc.nextInt();
		ws=new int[m];
		for(int i=0; i<m; i++){
			ws[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int M=394;
		int[] dp=new int[M];
		fill(dp, -1);
		for(int j=0; j<n; j++){
			for(int i=ss[j]; i<=ls[j]; i++){
				dp[i]=max(dp[i], ps[j]);
			}
		}
		for(int j=0; j<M; j++){
			for(int i=0; j+i<M; i++){
				dp[j+i]=max(dp[j+i], dp[j]+dp[i]);
			}
		}
		StringBuilder sb=new StringBuilder();
		boolean ok=true;
		for(int i=0; i<m; i++){
			sb.append(dp[ws[i]]).append('\n');
			ok&=dp[ws[i]]>=0;
		}
		// debug(dp);
		if(!ok){
			sb=new StringBuilder("-1\n");
		}
		print(sb.toString());
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