

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
    static final int MAX = (int) 1e6;
    public static List<Pair>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fac,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		int a=sc.nextInt(),b=sc.nextInt();
		double ret=0;
		for(int i=1;i<=a;i++){
		double tmp=1.0/a;
		int now=i;
		while(now<b){
		now*=2;
		tmp/=2;
		}
		ret+=tmp;
		}
		out.printf("%.12f\n",ret);
	 
		 
		out.close();
	}

	
	static class Pair{
		int x;
		int y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
}