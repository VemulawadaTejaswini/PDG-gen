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
			int k=1;
			for(int i=0; i<n; i++){
				k*=a[j][i];
			}
			ans=Math.max(ans, k*n);
			k=1;
			for(int i=0; j+i<n; i++){
				k*=a[j+i][i];
			}
			ans=Math.max(ans, k*(n-j));
			k=1;
			for(int i=0; j-i>=0; i++){
				k*=a[j-i][i];
			}
			ans=Math.max(ans, k*(j+1));
		}
		for(int i=0; i<n; i++){
			int k=1;
			for(int j=0; j<n; j++){
				k*=a[j][i];
			}
			ans=Math.max(ans, k*n);
			k=1;
			for(int j=0; i+j<n; j++){
				k*=a[j][i+j];
			}
			ans=Math.max(ans, k*(n-i));
			k=1;
			for(int j=0; i-j>=0; j++){
				k*=a[j][i-j];
			}
			ans=Math.max(ans, k*(i+1));
		}
		println(""+ans);
	}

	void solve__(){
		int ans=0;
		for(int j=0; j<n; j++){
			for(int i=0, k=0; i<n; i++){
				k=(k+1)*a[j][i];
				ans=Math.max(ans, k);
			}
			for(int i=0, k=0; j+i<n; i++){
				k=(k+1)*a[j+i][i];
				ans=Math.max(ans, k);
			}
			for(int i=0, k=0; j-i>=0; i++){
				k=(k+1)*a[j-i][i];
				ans=Math.max(ans, k);
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0, k=0; j<n; j++){
				k=(k+1)*a[j][i];
				ans=Math.max(ans, k);
			}
			for(int j=0, k=0; i+j<n; j++){
				k=(k+1)*a[j][i+j];
				ans=Math.max(ans, k);
			}
			for(int j=0, k=0; i-j>=0; j++){
				k=(k+1)*a[j][i-j];
				ans=Math.max(ans, k);
			}
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