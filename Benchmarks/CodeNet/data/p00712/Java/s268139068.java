import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int p0,q0,maxA,maxN;
	int ans;
	
	void run() {
		for(;;){
			p0=sc.nextInt();
			q0=sc.nextInt();
			maxA=sc.nextInt();
			maxN=sc.nextInt();
			if((p0|q0|maxA|maxN)==0){
				break;
			}
			solve();
		}
	}

	void solve() {
		int gcd=gcd(p0,q0);
		p0/=gcd;
		q0/=gcd;
		ans=0;
		dfs(0,1,1,1,0);
		// debug(ans);
		println(""+ans);
	}
	
	void dfs(int p,int q,int qNow,int a,int n){
		if(n>maxN){
			return;
		}
		if(a>maxA){
			return;
		}
		if(p*q0-q*p0>0){
			return;
		}
		// debug(p,q,qNow,a,n);
		if(p==p0&&q==q0){
			ans++;
			return;
		}
		for(int i=qNow;i*a<=maxA;i++){
			int p2=p*i+q;
			int q2=q*i;
			int gcd=gcd(p2,q2);
			p2/=gcd;
			q2/=gcd;
			dfs(p2,q2,i,i*a,n+1);
		}
	}
	
	int gcd(int m,int n){
		for(;m!=0;){
			int t=n%m;
			n=m;
			m=t;
		}
		return n;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}