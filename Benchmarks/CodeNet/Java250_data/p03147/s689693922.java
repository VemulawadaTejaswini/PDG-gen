import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { //X^0=X, therefore for null case, return 0
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int ans = 0;
		int[] h = new int[N];
		for (int i = 0; i < N; i++) h[i] = I.nextInt();
		while (true) { //Find longest sub-array such that h[L...R] all >= 1 in each state of h
		//Then subtract
			//for (int i = 0; i < N; i++) O.p(h[i]+" ");
			O.p("\n");
			int L = 0;
			int R = 0;
			int max = 0;
			int curmax = 0;
			boolean sub = false;
			for (int i = 0; i < N; i++) {
				if (h[i]>0) {
					curmax++;
					sub=true;
					for (int next = i+1; next<N; next++) {
						if (h[next]==0) {
							if (curmax>max) {
								max=curmax;
								L=i;
								R=next-1;
								i=next-1;
								curmax=0; //Refresh
							}
							break;
						}else curmax++;
					}
					if (curmax>0) break; //End of array has been reached
				}
			}
			if (curmax>max) {
				max=curmax;
				L=N-1-curmax;
				L++; //Length 1 means same thing, therefore ++ for nullifying over-counting
				R=N-1;
			}
			if (!sub) break;
			for (int chk = L; chk<=R; chk++) h[chk]--; //Decrementing best sub-array
			ans++;
		}
		O.pln(ans);
	}
	public static void build(long[] segtree, long[] a, int start, int end, int node) {
		if (start==end) segtree[node] = a[start];
		else{ //Need else statements for void methods
			int mid = (start+end)/2;
			build(segtree,a,start,mid,2*node); //Build from left child onwards
			build(segtree,a,mid+1,end,2*node+1); //Build from right child onwards
			segtree[node] = segtree[2*node]^segtree[2*node+1]; //Current node stores XOR of children
			//(Order of XOR doesn't matter, just occurrences of 1 bit in a certain slot
		}
	}
	public static long getXOR(long[] segtree, long[] a, int start, int end, int L, int R, int node) {
		if (R<start||L>end) return 0; //Returning answer that has no effect on final answer
		if (L<=start&&R>=end) return segtree[node]; //If range encapsulates current node of 
		//segment tree
		int mid = (start+end)/2; //Partial case --> Recurse deeper into segment tree
		long left = getXOR(segtree,a,start,mid,L,R,node*2);
		long right = getXOR(segtree,a,mid+1,end,L,R,2*node+1);
		return left^right;
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
	}
}
