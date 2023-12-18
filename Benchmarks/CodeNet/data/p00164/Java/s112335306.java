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

	void run(){
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			for(int r=31, i=0;; i=(i+1)%n){
				println(""+r);
				r-=a[i];
				if(r<=0){
					println("0");
					break;
				}
				println(""+r);
				r-=(r-1)%5;
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