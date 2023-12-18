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

	// gcd(a, d)=1
	int a, d, n;

	void run(){
		for(;;){
			a=sc.nextInt();
			d=sc.nextInt();
			n=sc.nextInt();
			if((a|d|n)==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		for(int i=0;; i++){
			if(isPrime(a+d*i)&&--n==0){
				println(""+(a+d*i));
				return;
			}
			// debug(a, d, n, a+d*i);
		}
	}

	// {2,7,61,-1} is for n < 4759123141 (= 2^32)
	// {2,3,5,7,11,13,17,19,23,-1} is for n < 10^16 (at least)
	boolean isPrime(int n){
		if(n<=1||(n>2&&n%2==0))
			return false;
		int test[]={2, 3, 5, 7, 11, 13, 17, 19, 23, -1};
		int d=n-1, s=0;
		for(; d%2==0; d/=2)
			++s;
		for(int i=0; test[i]<n&&test[i]!=-1; i++)
			if(!suspect(test[i], s, d, n))
				return false;
		return true;
	}

	boolean suspect(int a, int s, int d, int n){
		long x=powMod(a, d, n);
		if(x==1)
			return true;
		for(int r=0; r<s; ++r){
			if(x==n-1)
				return true;
			x=x*x%n;
		}
		return false;
	}

	long powMod(long x, int k, int m){
		if(k==0)
			return 1;
		if(k%2==0)
			return powMod(x*x%m, k/2, m);
		else
			return x*powMod(x, k-1, m)%m;
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