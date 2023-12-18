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
	int max=1000000;
	int[] prime;
	boolean[] isPrime;

	void run(){
		int p=0;
		prime=new int[max];
		isPrime=new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2; i<=max; i++){
			if(isPrime[i]){
				prime[p++]=i;
				for(int j=2*i; j<=max; j+=i){
					isPrime[j]=false;
				}
			}
		}

		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			int ans=0;
			for(int i=0; i<p; i++){
				if(prime[i]>n/2){
					break;
				}
				if(isPrime[n-prime[i]]){
					ans++;
				}
			}
			println(""+ans);
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