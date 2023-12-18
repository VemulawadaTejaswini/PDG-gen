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

	int n, m;
	int[][] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
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
		// S0Éµ½¢
		int[][] b=new int[n][m];
		int ans=0;
		for(int k=0; k<1<<n; k++){
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					b[j][i]=(k>>j&1)!=0?1-a[j][i]:a[j][i];
				}
			}
			int sum=0;
			for(int i=0; i<m; i++){
				int c=0;
				for(int j=0; j<n; j++){
					c+=b[j][i];
				}
				sum+=max(c, n-c);
			}
			ans=max(ans, sum);
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