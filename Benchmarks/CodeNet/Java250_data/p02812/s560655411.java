

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
    static final int N = (int) 1e3+10;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static int[] Bit;
    public static long[] fact,inv;
    public  static int[] prime; 
	public static Map<Integer, Integer> map; 
	static char ch = 'z';
	static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = (n - s.replace("ABC","").length())/3;
		out.print(ans);
		out.close();
	}
	
}
