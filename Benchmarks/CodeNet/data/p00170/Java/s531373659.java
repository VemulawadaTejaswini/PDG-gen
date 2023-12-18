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
	String[] f;
	int[] w, s;
	int[] a, best;
	double bestG;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			f=new String[n];
			w=new int[n];
			s=new int[n];
			for(int i=0; i<n; i++){
				f[i]=sc.next();
				w[i]=sc.nextInt();
				s[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		a=new int[n];
		best=new int[n];
		for(int i=0; i<n; i++){
			a[i]=i;
		}
		bestG=INF;
		rec(0);
		for(int e : best){
			println(f[e]);
		}
	}

	void rec(int j){
		if(j==n){
			// 0ツつェツ暗ェツ氾板可コ
			int sumW=0;
			int nW=0;
			for(int i=n-1; i>=0; i--){
				if(s[a[i]]<sumW){
					return;
				}
				sumW+=w[a[i]];
				nW+=(i+1)*w[a[i]];
			}
			double g=(double)nW/sumW;
			if(g+EPS<bestG){
				System.arraycopy(a, 0, best, 0, n);
				bestG=g;
			}
			return;
		}

		for(int i=j; i<n; i++){
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			rec(j+1);
			t=a[i];
			a[i]=a[j];
			a[j]=t;
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