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

	int m, g;
	int[] a, b, n;

	void run(){
		for(;;){
			m=sc.nextInt();
			if(m==0){
				break;
			}
			a=new int[m];
			b=new int[m];
			for(int i=0; i<m; i++){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			g=sc.nextInt();
			n=new int[g];
			for(int i=0; i<g; i++){
				n[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int[] dp=new int[1001];
		int[] dp2=new int[1001];
		dp[0]=1;
		for(int j=0; j<m; j++){
			System.arraycopy(dp, 0, dp2, 0, 1001);
			for(int i=0; i<b[j]; i++){
				for(int k=1000-a[j]*(i+1); k>=0; k--){
					dp[k+a[j]*(i+1)]+=dp2[k];
				}
			}
		}
		for(int i=0; i<g; i++){
			println(""+dp[n[i]]);
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