
import java.io.*;
import java.util.*;

public class Main {
	static final int N=(int)5005;
    public static void main(String[] args) {  
        InputStream sys=System.in;
        InputReader in=new InputReader(sys);
        PrintWriter out=new PrintWriter(System.out);
        int A=in.nextInt(),B=in.nextInt();
        int C=in.nextInt(),D=in.nextInt();
        int ans=0;
        if(C>=B||A>=D) ans=0;
        else {
        	if(B>C&&C>A) ans+=B-C;
        	if(D>A&&A>C) ans+=D-A;
        }
        if(A<=C&&D<=B) ans=D-C;
        if(C<=A&&B<=D) ans=B-A;
        out.println(ans);
        out.flush();
    }
	static class InputReader {
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
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}