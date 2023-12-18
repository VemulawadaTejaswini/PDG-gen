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

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			solve();
		}
		System.out.flush();
	}

	void solve(){
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=1; i<n; i++){
			set.add(i*i%n);
		}
		int[] c=new int[n];
		for(int j : set){
			for(int i : set){
				if(i!=j){
					int a=i-j;
					if(a<0){
						a+=n;
					}
					if(a>(n-1)/2){
						a=n-a;
					}
					c[a]++;
				}
			}
		}
		// debug(set.toArray());
		// debug(c);
		for(int i=1; i<=(n-1)/2; i++){
			println(""+c[i]);
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
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}