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
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
    
	public static void main(String[] args) throws IOException {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		double k = Math.abs(((11*m)/2 - 30*h));
		
		if(k > 180) k = 360-k;
		//out.println(k);
		//out.print(Math.cos());
		double ans = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(k*(Math.PI/180)));
		out.print(ans);
		out.close();
	}

   
}



