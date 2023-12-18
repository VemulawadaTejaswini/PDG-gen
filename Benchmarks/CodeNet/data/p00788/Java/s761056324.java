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

	int p, n;

	void run(){
		for(;;){
			p=sc.nextInt();
			n=sc.nextInt();
			if((p|n)==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		F left=new F(0, 1);
		F right=new F(p, 1);
		F fp=new F(p, 1);
		for(int j=1; j<=n; j++){
			for(int i=1; i<=n; i++){
				F f=new F(i, j);
				F f2=new F(i*i, j*j);
				// left<f<ツ」p
				// ツ」p<f<right
				if(left.lessThan(f)&&f2.lessThan(fp)){
					left=f;
				}else if(fp.lessThan(f2)&&f.lessThan(right)){
					right=f;
				}
			}
		}
		println(right.n+"/"+right.d+" "+left.n+"/"+left.d);
	}

	class F{
		long n, d;// n/d

		F(long n, long d){
			long gcd=gcd(n, d);
			this.n=n/gcd;
			this.d=d/gcd;
		}

		boolean lessThan(F f){
			return n*f.d<f.n*d;
		}
	}

	long gcd(long m, long n){
		for(; n!=0;){
			m=m%n;
			long t=m;
			m=n;
			n=t;
		}
		return m;
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