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
 
	static long mod = (int) (1000000000),MAX=(int)(1e5+10);
	
	public static void main(String[] args) throws IOException{
	    
char[] s = sc.next().toCharArray();
char[] t = sc.next().toCharArray();
int ans = 0;
for(int i=0;i<s.length;++i) if(s[i] != t[i]) ++ans;
out.print(ans);
		
        
        out.close();
    }
	
}



