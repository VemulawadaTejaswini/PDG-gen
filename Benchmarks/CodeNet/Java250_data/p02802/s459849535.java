

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;


public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static int mod = (int) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 32;
    public static int[] Bit;
    public static long[] dp;
    
	public static void main(String[] args) {
	
	
	FastReader sc = new FastReader();
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	boolean[] ac = new boolean[n+1];
	int[] wa = new int[n+1];
	long score = 0,pen = 0;
	for(int i=0;i<m;++i) {
		int idx = sc.nextInt();
		String ver = sc.next();
		if(ver.compareTo("AC") == 0) {
			if(!ac[idx]) {
				ac[idx] = true;
				++score;
			}
		}else {
			if(!ac[idx]) ++wa[idx];
		}
	}
	
	for(int i=1;i<=n;++i) {
		if(ac[i]) { pen+=wa[i]; }
	}
	
	out.print(score + " "+pen);
      out.close();
	}

	
}