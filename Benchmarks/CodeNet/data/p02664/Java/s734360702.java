import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String... args) {
		FastScanner sc = new FastScanner();
		char[] s = sc.next().toCharArray();
		for(int i = 0; i < s.length; i++) {
			if(s[i] == '?') s[i] = 'D';
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(s);
		pw.flush();
	}
	
	static class FastScanner {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
        	return Long.parseLong(next());
        }
        public double nextDouble() {
        	return Double.parseDouble(next());
        }
        public String nextLine() {
        	try {
        		return reader.readLine();
        	} catch(IOException e) {
        		throw new RuntimeException(e);
        	}
        }
    }
	

}