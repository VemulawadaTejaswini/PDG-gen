import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);

		boolean[] isPrimes=new boolean[50000];
		for(int i=2; i<isPrimes.length; i++)
			isPrimes[i]=isPrime(i);

		for(;;){
			int n=sc.nextInt();
			if(n==0)
				break;
			int ans=0;
			if(n%2==1){
				ans=isPrimes[n-2]?1:0;
			}else{
				for(int i=2; 2*i<=n; i++)
					if(isPrimes[i]&&isPrimes[n-i])
						ans++;
			}
			println(ans+"");
		}
		sc.close();
	}

	boolean isPrime(int n){
		int m=(int)sqrt(n);
		for(int i=2; i<=m; i++)
			if(n%i==0)
				return false;
		return true;
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}