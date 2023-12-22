
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        float Sum = 0 ;
        int N = in.nextInt();
        int M = in.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(in.nextInt());
            Sum += A.get(i);
        }
        float criteria = (Sum/(4*M)) ;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(A.get(i) >= criteria )
                count++;

        }

        if(count >= M)
            System.out.println("Yes");
        else
            System.out.println("No");






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

    }
}