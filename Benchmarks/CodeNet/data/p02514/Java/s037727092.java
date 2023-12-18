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
		make(n);
		for(int i=0; i<m; i++){
			union(x[i], y[i]);
		}
		int k=0;
		for(int i=0; i<n; i++){
			if(p[i]<0){
				k++;
			}
		}
		// debug(p);
		// debug(k);
		sort(c);
		for(int i=0; i<m; i++){
			if((i==0&&k==1)||c[i]<0){
				ans+=c[i];
			}
		}
		println(ans+"");
	}

	int[] p;

	void make(int n){
		p=new int[n];
		fill(p, -1);
	}

	int find(int x){
		return p[x]<0?x:(p[x]=find(p[x]));
	}

	boolean union(int x, int y){
		x=find(x);
		y=find(y);
		if(x!=y){
			if(p[y]<p[x]){
				int t=x;
				x=y;
				y=t;
			}
			p[x]+=p[y];
			p[y]=x;
		}
		return x!=y;
	}

	int size(int x){
		return -p[find(x)];
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