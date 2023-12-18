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

	int n, m;
	int[] x, y, c;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((m|n)==0){
				break;
			}
			x=new int[m];
			y=new int[m];
			c=new int[m];
			for(int i=0; i<m; i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				c[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		long ans=0;
		sort(c);
		for(int i=0; i<m; i++){
			if(i==0||c[i]<0){
				ans+=c[i];
			}
		}
		println(ans+"");
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