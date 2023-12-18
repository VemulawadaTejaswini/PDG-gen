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
		for(int t=1;; t++){
			int w=sc.nextInt();
			if(w==0)
				break;
			int n=sc.nextInt();
			sc.nextLine();
			int[] values=new int[n];
			int[] weights=new int[n];
			for(int i=0; i<n; i++){
				String[] s=sc.nextLine().split(",");
				values[i]=Integer.parseInt(s[0]);
				weights[i]=Integer.parseInt(s[1]);
			}
			int[] dp=new int[w+1];
			int[] pdp=new int[w+1];
			for(int j=0; j<n; j++){
				System.arraycopy(dp, 0, pdp, 0, w+1);
				for(int i=0; i<=w; i++){
					if(i<weights[j])
						dp[i]=pdp[i];
					else
						dp[i]=max(pdp[i], pdp[i-weights[j]]+values[j]);
				}
			}
			int value=dp[w];
			int weight;
			for(weight=w; dp[weight]==value&&weight>=0; weight--);
			println("Case "+t+":");
			println(weight+1+"");
			println(dp[w]+"");
		}
		sc.close();
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