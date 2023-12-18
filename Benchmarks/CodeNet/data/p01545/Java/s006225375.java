import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	long INF=1L<<60;
	double EPS=1e-12;

	int n;
	int[] x;

	void run(){
		n=sc.nextInt();
		x=new int[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		SegTree seg=new SegTree(n);
		for(int i=0; i<n; i++){
			seg.update(x[i], seg.query(0, x[i]+1)+x[i]);
		}
		println((long)n*(n+1)/2-seg.query(0, n+1)+"");
	}

	// root = 1
	// par(k) = k/2
	// left(k) = 2*k
	// right(k) = 2*k+1
	class SegTree{
		int n;

		long[] a;

		SegTree(int n){
			this.n=Integer.highestOneBit(n)<<1;
			a=new long[this.n*2];
		}

		void update(int k, long x){
			a[n+k]=x;
			for(int i=(n+k)>>1; i>0; i>>=1){
				a[i]=max(a[2*i], a[2*i+1]);
			}
		}

		// [s, t)
		long query(int s, int t){
			return query(s, t, 1, 0, n);
		}

		long query(int s, int t, int k, int l, int r){
			// debug(s,t,k,l,r);
			if(r<=s||l>=t){
				// 範囲外
				return -1;
			}else if(s<=l&&r<=t){
				// a[k]
				return a[k];
			}else{
				return max(query(s, t, k*2, l, (l+r)/2),
						query(s, t, k*2+1, (l+r)/2, r));
			}
		}
	}

	class Scanner{
		BufferedReader br;
		StringTokenizer st;

		Scanner(InputStream in){
			br=new BufferedReader(new InputStreamReader(in));
			eat("");
		}

		void eat(String s){
			st=new StringTokenizer(s);
		}

		String nextLine(){
			try{
				return br.readLine();
			}catch(IOException e){
				throw new IOError(e);
			}
		}

		boolean hasNext(){
			while(!st.hasMoreTokens()){
				String s=nextLine();
				if(s==null)
					return false;
				eat(s);
			}
			return true;
		}

		String next(){
			hasNext();
			return st.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
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