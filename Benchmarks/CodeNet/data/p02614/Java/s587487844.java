import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import static java.lang.Long.bitCount;

public class Main {

	public static void main(String[] args) {
		FastScanner in = new FastScanner();
		int h,w,k; 
		h=in.nextInt();
		w=in.nextInt();
		k=in.nextInt();
		String []a=new String[h];
		String []d=new String[h];
		for(int i=0; i<h; ++i) {
			a[i]=in.next();
			d[i]=a[i];
		}
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Integer> c=new ArrayList<>();
		for(int i=0; i<(1<<h); ++i) {
			int init=0;
			for(int j=0; j<h; ++j) {
				if(((1<<j)&i)>0) init+=(1<<j); 
			}
			b.add(init);
		}
		for(int i=0; i<(1<<w); ++i) {
			int init=0;
			for(int j=0; j<w; ++j) {
				if(((1<<j)&i)>0) init+=(1<<j); 
			}
			c.add(init);
		}
		int ans=0;
		for(int u:b) {
			for(int v:c) {
				d=a;
				if(check(d,u,v,h,w)==k) ++ans;
			}
		}
		
		System.out.println(ans);
	}
	
	static int check(String []a, int u, int v, int h, int w) {
		int total=0, rem_black=0;
		for(int i=0; i<h; ++i) {
			for(int j=0; j<w; ++j) {
				char c=a[i].charAt(j);
				if(c=='.') continue;
				if(c=='#') ++total;
				if(((1<<i)&u)>0 || ((1<<j)&v)>0) ++rem_black;
			}
		}
		return total-rem_black;
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
