import java.io.*;
import java.util.*;

public class A {

	static PrintWriter out;
	
	static class FIO {
		BufferedReader in;
		StringTokenizer st = null;
		FIO() throws IOException{
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			st = null;
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	static FIO in;
	public static void main(String[] args) throws IOException {
		in = new FIO();
		int a = in.nextInt();
		out.println((a == 0) ? 1 : 0);
		out.close();
		
	}
	

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
