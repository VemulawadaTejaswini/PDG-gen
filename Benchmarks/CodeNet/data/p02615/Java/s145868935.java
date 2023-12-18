import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


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
		
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;++i) a[i] = sc.nextLong();
		sort(a);
		long ans = 0;
		for(int i=1;i<n;++i) ans+=a[i];
		out.print(ans);
	out.close();
	}
	
	static void sort(long[] A) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int i = 0;
        for (i = 0; i < A.length; i++)
            pq.add(A[i]);
        for (i = 0; i < A.length; i++)
            A[i] = pq.poll();
    }
	
}



