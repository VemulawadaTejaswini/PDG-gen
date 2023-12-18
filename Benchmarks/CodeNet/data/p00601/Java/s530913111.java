import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	long[] g;
	int ans;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			g=new long[n];
			for(int i=0; i<m; i++){
				int u=sc.nextInt();
				int v=sc.nextInt();
				g[u]|=1L<<v;
				g[v]|=1L<<u;
			}
			solve();
		}
	}

	void solve(){
		ans=0;
		int isolated=0;
		for(int i=0; i<n; i++){
			if(g[i]==0){
				isolated++;
			}
		}
		mis(0, 0);
		ans=n-ans+isolated;
		println(ans+"");
	}

	void mis(long choosed, long removed){
		int k=-1;
		long remained=~removed&((1L<<n)-1);
		for(; remained!=0;){
			int i=Long.numberOfTrailingZeros(remained);
			if(Long.bitCount(g[i]&~removed)<=1){
				k=i;
				break;
			}
			if(k==-1||Long.bitCount(g[i]&~removed)>Long.bitCount(g[k]&~removed))
				k=i;
			remained^=1L<<i;
		}
		if(k==-1){
			ans=max(ans, Long.bitCount(choosed));
			return;
		}
		if(Long.bitCount(g[k]&~removed)>=2)
			mis(choosed, removed|(1L<<k));
		mis(choosed|(1L<<k), removed|(1L<<k)|g[k]);
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