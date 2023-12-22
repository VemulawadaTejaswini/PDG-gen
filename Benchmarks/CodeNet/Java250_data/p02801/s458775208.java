

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
	
	char ch = sc.next().charAt(0);
	out.print(++ch);
      out.close();
	}

	
}