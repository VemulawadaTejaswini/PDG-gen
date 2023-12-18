import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
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
				} catch (Exception addd) {
					addd.printStackTrace();
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static long mod = (int) (1e9+7),MAX=(long)(1e18);
	static List<Integer>[] edges;
	public static int[][] parent;
	public static int col = 20;
	public static void main(String[] args) throws IOException{
		
		//Scanner sc = new Scanner(System.in);
	//	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    long[] a = new long[n];
	    boolean zero = false;
	    for(int i=0;i<n;++i) {
	    	a[i] = sc.nextLong();
	    	if(a[i] == 0) zero = true; 
	    }
	    if(zero) out.print(0);
	    else {
	    	long mul = 1;
	    	boolean found = true;
	        for(int i=0;i<n && found;++i) {
	        	if(mul > (MAX)/a[i]) found = false;
	        	else mul*=a[i];
	        }
	        if(found) out.print(mul);
	        else out.print(-1);
	    }
		out.close();
	}
}