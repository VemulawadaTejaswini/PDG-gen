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

	int n, k;
	int[] a, b;
	TreeSet<String> set;

	void run(){
		for(;;){
			n=sc.nextInt();
			k=sc.nextInt();
			if((n|k)==0){
				break;
			}
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		set=new TreeSet<String>();
		b=new int[k];
		int comb=(1<<k)-1;
		for(; comb<1<<n;){
			int j=0;
			for(int i=0; i<n; i++){
				if((comb>>i&1)!=0){
					b[j++]=a[i];
				}
			}
			rec(0);
			int x=comb&-comb, y=comb+x;
			comb=((comb&~y)/x>>1)|y;
		}
		println(set.size()+"");
	}

	void rec(int j){
		if(j==k){
			String s="";
			for(int e : b){
				s+=e;
			}
			set.add(s);
			return;
		}

		for(int i=j; i<k; i++){
			int t=b[i];
			b[i]=b[j];
			b[j]=t;
			rec(j+1);
			t=b[i];
			b[i]=b[j];
			b[j]=t;
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