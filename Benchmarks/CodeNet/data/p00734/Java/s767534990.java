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
	int[] a, b;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[m];
			b=new int[n];
			for(int i=0; i<m; i++){
				a[i]=sc.nextInt();
			}
			for(int i=0; i<n; i++){
				b[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int sum1=0, sum2=0;
		for(int i=0; i<m; i++){
			sum1+=a[i];
		}
		for(int i=0; i<n; i++){
			sum2+=b[i];
		}

		int p=200, q=200;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(sum1-a[i]+b[j]==sum2-b[j]+a[i]){
					if(a[i]+b[j]<p+q){
						p=a[i];
						q=b[j];
					}
				}
			}
		}
		if(p<200){
			println(p+" "+q);
		}else{
			println("-1");
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