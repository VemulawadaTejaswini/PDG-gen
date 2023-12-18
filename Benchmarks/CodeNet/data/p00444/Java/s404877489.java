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
		int n=1000;
		int[] a=new int[n];
		int[] c={1, 5, 10, 50, 100, 500};
		fill(a, INF);
		a[0]=0;
		for(int j=0; j<c.length; j++){
			for(int i=c[j]; i<n; i++){
				a[i]=min(a[i], a[i-c[j]]+1);
			}
		}
		for(;;){
			int m=sc.nextInt();
			if(m==0){
				break;
			}
			println(a[1000-m]+"");
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