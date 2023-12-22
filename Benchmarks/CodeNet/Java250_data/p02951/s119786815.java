

import java.util.*;
import java.io.*;
 
public class Main {
	
		
	
	public static void main(String args []) {
		InputReader obj = new InputReader(System.in);
		
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		System.out.println(Math.max(0, c-(a-b)));
	}
	public static class InputReader {
	    public BufferedReader reader;
	    public StringTokenizer tokenizer;
 
	    public InputReader(InputStream stream) {
	        reader = new BufferedReader(new InputStreamReader(stream), 32768);
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
	    
 
	}
}