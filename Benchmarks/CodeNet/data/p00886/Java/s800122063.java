
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, LEN = 402;
	int[] ar;
	int[] d;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			ar = new int[n*(n-1) / 2];
			for(int i=0;i<n*(n-1)/2;i++) ar[i] = sc.nextInt();
			d = new int[LEN];
			for(int i: ar) d[i]++;
			ans = new int[n]; ans[n-1] = ar[0];
			d[ar[0]]--;set = new HashSet<V>();
			dfs(1, n-2);
			System.out.println("-----");
		}
	}
	
	int[] ans;
	HashSet<V> set;
	void dfs(int l, int r) {
//debug("l", l, r, d,ans);
		if(l > r) {
			if(!set.contains(new V(ans)))for(int i=1;i<n;i++) 
				System.out.print(ans[i]-ans[i-1] + (i==n-1? "\n": " "));
			set.add(new V(ans));
			return;
		}
		int dist;
		for(dist=LEN-1;;dist--) if(d[dist]>0) break;
		
		//left
		ans[l] = ans[n-1] - dist;
		boolean ok = true;
		for(int i=0;i<l;i++) {
			d[ans[l]-ans[i]]--;
			if(d[ans[l]-ans[i]] < 0) ok = false;
		}
		for(int i=r+1;i<n;i++) {
			d[ans[i]-ans[l]]--;
			if(d[ans[i]-ans[l]] < 0) ok = false;
		}
		if(ok) dfs(l+1, r);
		for(int i=0;i<l;i++) d[ans[l]-ans[i]]++;
		for(int i=r+1;i<n;i++) d[ans[i]-ans[l]]++;

//debug("r", l, r, d,ans, ans[r+1]-dist);
		//right
		ans[r] = ans[0] + dist;
		ok = true;
		for(int i=0;i<l;i++) {
			d[ans[r]-ans[i]]--;
			if(d[ans[r]-ans[i]] < 0) ok = false;
		}
		for(int i=r+1;i<n;i++) {
			d[ans[i]-ans[r]]--;
			if(d[ans[i]-ans[r]] < 0) ok = false;
		}
		if(ok) dfs(l, r-1);
		for(int i=0;i<l;i++) d[ans[r]-ans[i]]++;
		for(int i=r+1;i<n;i++) d[ans[i]-ans[r]]++;
	}
	
	class V {
		int[] a;
		V(int[] a) {
			this.a = new int[n];
			System.arraycopy(a, 0, this.a, 0, n);
		}
		
		public int hashCode() {
			int h=0, p=1;
			for(int i=0;i<n;i++,p*=400) h += p*a[i];
			return p;
		}
		
		public boolean equals(Object o) {
			if(o instanceof V) {
				V v = (V)o;
				for(int i=0;i<n;i++) if( a[i] != v.a[i] ) return false;
				return true;
			}
			return false;
		}
	};

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}