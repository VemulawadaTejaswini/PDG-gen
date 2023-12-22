import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a=new int[n+4];
		int[]b =new int[n];
		for(int i =0;i<n;i++)b[i]=sc.nextInt();
		for(int i =n-1;i>=0;i--) {
			a[b[i]]=Math.max(a[b[i]],1+a[b[i]+1] );
		}
		if(a[1]==0) {
			System.out.println(-1);
		}else System.out.println(n-a[1]);
	}
	static int gcd(int a,int b) {
		if(a==0)return b;
		return gcd(b%a,a);
	}
	  static class Scanner {
	        StringTokenizer st;
	        BufferedReader br;
	 
	        public Scanner(FileReader r) {
	            br = new BufferedReader(r);
	        }
	 
	        public Scanner(InputStream s) {
	            br = new BufferedReader(new InputStreamReader(s));
	        }
	 
	        public String next() throws IOException {
	            while (st == null || !st.hasMoreTokens())
	                st = new StringTokenizer(br.readLine());
	            return st.nextToken();
	        }
	 
	        public int nextInt() throws IOException {
	            return Integer.parseInt(next());
	        }
	 
	        public long nextLong() throws IOException {
	            return Long.parseLong(next());
	        }
	 
	        public String nextLine() throws IOException {
	            return br.readLine();
	        }
	 
	        public double nextDouble() throws IOException {
	            String x = next();
	            StringBuilder sb = new StringBuilder("0");
	            double res = 0, f = 1;
	            boolean dec = false, neg = false;
	            int start = 0;
	            if (x.charAt(0) == '-') {
	                neg = true;
	                start++;
	            }
	            for (int i = start; i < x.length(); i++)
	                if (x.charAt(i) == '.') {
	                    res = Long.parseLong(sb.toString());
	                    sb = new StringBuilder("0");
	                    dec = true;
	                } else {
	                    sb.append(x.charAt(i));
	                    if (dec)
	                        f *= 10;
	                }
	            res += Long.parseLong(sb.toString()) / f;
	            return res * (neg ? -1 : 1);
	        }
	 
	        public boolean ready() throws IOException {
	            return br.ready();
	        }
	    }
}
