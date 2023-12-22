
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        static long pow(long a , long b , long m){
            long res = 1;
            a%=m;
            while (b>0){
                if ((b&1)==1)res*=a%m;
                a = a*a%m;
                b>>=1;
            }
            return res;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n  = in.nextInt();
            int m = in.nextInt();
            int[] wr = new int[n+1];
            boolean[] ac = new boolean[n+1];
            for (int i = 0; i <m ; i++) {
                int p = in.nextInt();
                String s = in.next();
                if (!ac[p]){
                    if (s.equals("WA"))wr[p]++;
                    else ac[p]=true;
                }
            }
            int na = 0;
            int pen = 0;
            for (int i = 1; i <=n ; i++){
                if (ac[i]){
                    pen+=wr[i];
                    na++;
                }
            }
            System.out.println(na+" " +pen);
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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
