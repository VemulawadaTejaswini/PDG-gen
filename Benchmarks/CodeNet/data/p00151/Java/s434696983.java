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

	int[][] a;
	int n;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=new int[n][n];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<n; i++){
					a[j][i]=s.charAt(i)-'0';
				}
			}
			solve();
		}
	}

	void solve(){
		int ans=0;
		for(int j=0; j<n; j++){
			for(int i=0, k=0; i<n; i++)
				ans=Math.max(ans, k=(k+1)*a[j][i]);
			for(int i=0, k=0; i<n; i++)
				ans=Math.max(ans, k=(k+1)*a[i][j]);
			for(int i=0, k=0; j+i<n; i++)
				ans=Math.max(ans, k=(k+1)*a[j+i][i]);
			for(int i=0, k=0; j-i>=0; i++)
				ans=Math.max(ans, k=(k+1)*a[j-i][i]);
			for(int i=0, k=0; j+i<n; i++)
				ans=Math.max(ans, k=(k+1)*a[j+i][n-1-i]);
			for(int i=0, k=0; j-i>=0; i++)
				ans=Math.max(ans, k=(k+1)*a[j-i][n-1-i]);
		}
		println(""+ans);

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