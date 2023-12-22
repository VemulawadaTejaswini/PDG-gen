import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = in.next();
        char[] arr = s.toCharArray();
        char[] v1 = new char[s.length()];
        char[] v2 = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                v1[i] = '1';
            }
            else{
                v1[i] = '0';
            }
        }
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                v2[i] = '0';
            }
            else{
                v2[i] = '1';
            }
        }
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(arr[i]!=v1[i]){
                ++c1;
            }
            if(arr[i]!=v2[i]){
                ++c2;
            }
        }
        out.println(Math.min(c1,c2));
        out.close();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}

