
import java.io.*;
import java.util.*;

public class Main {

        private static void solve(InputReader in, PrintWriter out) {
            Integer m=in.nextInt(),n=in.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=in.nextInt();
            }
            System.out.print((m-sum>=0)?m-sum:-1);
        }
        public static void main(String args[]){
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            solve(in,out);
            out.close();
        }
        private static class InputReader {
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
            public Double nextDouble() {
                return Double.parseDouble(next());
            }
    }
}