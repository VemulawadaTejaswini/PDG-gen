import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner s = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long cnt01 = 0, cnt10 = 0;

        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0) {
                if (str.charAt(i)=='0') {
                    cnt10++;
                } else {
                    cnt01++;
                }
            } else {
                if (str.charAt(i)=='1') {
                    cnt10++;
                } else {
                    cnt01++;
                }
            }
        }
        out.println(Math.min(cnt01, cnt10));

        out.close();
    }

    static class FastScanner {
		
		BufferedReader br; StringTokenizer st;
		FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
			st = new StringTokenizer("");
		}
		String next() {
			while(!st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch(Exception e) {}
			}
			return st.nextToken();
		}
		
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() {return Long.parseLong(next()); }
		
	}
}