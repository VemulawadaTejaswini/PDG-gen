

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
	static int mod = (int) (1e9+7),n;
	static long cf = 998244353;
    static final int MAX = (int) 1e6;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fac,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		String s = sc.next();
		int ans = 7;
		if(s.equals("MON")) ans=6;
		else if(s.equals("TUE")) ans = 5;
		else if(s.equals("WED")) ans = 4;
		else if(s.equals("THU")) ans = 3;
		else if(s.equals("FRI")) ans = 2;
		else if(s.equals("SAT")) ans = 1;
		out.print(ans);
		out.close();
	}
	
	
}