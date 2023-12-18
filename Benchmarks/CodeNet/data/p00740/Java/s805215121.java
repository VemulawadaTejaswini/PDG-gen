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

	int n, p;

	void run(){
		for(;;){
			n=sc.nextInt();
			p=sc.nextInt();
			if((n|p)==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		int[] a=new int[n];
		int q=p;
		for(int i=0;; i=(i+1)%n){
			if(q>0){
				a[i]++;
				q--;
			}else{
				q+=a[i];
				a[i]=0;
			}
			if(a[i]==p){
				println(""+i);
				return;
			}
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