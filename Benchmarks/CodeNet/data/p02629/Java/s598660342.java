import java.io.*;
import java.math.BigDecimal;
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
 
	static int mod = (int)(1e9+7),MAX=(int)(1e5+10);
	static List<int[]>[] edges;
	
	public static void main(String[] args) throws IOException{
	
		long num = sc.nextLong();
		out.print(getAlpha(num));
	  out.close();
	}
	 public static String getAlpha(long num) {

		    String result = "";
		    while (num > 0) {
		      num--; // 1 => a, not 0 => a
		      int remainder = (int) (num % 26);
		      char digit = (char) (remainder + 97);
		      result = digit + result;
		      num = (num - remainder) / 26;
		    }

		    return result;
		  }
	
	
}