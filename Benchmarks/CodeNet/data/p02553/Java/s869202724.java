
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskT solver = new TaskT();
        solver.solve(1, in, out);
        out.close();
    }
    
    

    static class TaskT {
    	static int counter = 0;
        public void solve(int testNumber, InputReader in, PrintWriter out) {

        	BigInteger a = BigInteger.valueOf(in.nextInt()); 
        	BigInteger b = BigInteger.valueOf(in.nextInt()); 
        	
        	BigInteger c = BigInteger.valueOf(in.nextInt()); 
        	BigInteger d = BigInteger.valueOf(in.nextInt()); 
        	
        	BigInteger max_product_pair = a.multiply(c);
        	
        	max_product_pair = max_product_pair.max(a.multiply(c));
        	max_product_pair = max_product_pair.max(a.multiply(d));
        	max_product_pair = max_product_pair.max(b.multiply(c));
        	max_product_pair = max_product_pair.max(b.multiply(d));

        	out.print(max_product_pair);
        }
        
     
        
        

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
        
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}

