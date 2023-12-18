import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n;
	int w;
	int[] h;

	void run(){
		for(;;){
			n=sc.nextInt();
			w=sc.nextInt();
			if((n|w)==0){
				break;
			}
			h=new int[20];
			int vMax=0;
			int hMax=0;
			for(int i=0; i<n; i++){
				int v=sc.nextInt();
				h[v/w]++;
				vMax=Math.max(vMax, v);
				hMax=Math.max(hMax, h[v/w]);
			}
			int m=vMax/w+1;
			double ans=0;
			debug("test");
			for(int i=0; i<m; i++){
				double a=(double)(m-1-i)/(m-1);
				double b=(double)h[i]/hMax;
				ans+=a*b;
			}
			ans+=0.01;
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
		new Main().run();
	}
}