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

	int k;

	void run(){
		int n=17;
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=(i+1)*(i+1);
		}
		int max=300;
		int[] dp=new int[max];
		dp[0]=1;
		for(int j=0; j<n; j++){
			for(int i=a[j]; i<max; i++){
				dp[i]+=dp[i-a[j]];
			}
		}
		for(;;){
			k=sc.nextInt();
			if(k==0){
				break;
			}
			println(""+dp[k]);
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