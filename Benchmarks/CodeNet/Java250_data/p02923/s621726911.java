import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int n;
        n = in.nextInt();
        int h[] = new int[n];

        for (int i=0; i<n; i++){
            h[i] = in.nextInt();
        }

        int moves;
        int maxMoves = 0;

        for (int i=0; i<n-1; i++){
           int j=i;
           moves = 0;
           while (h[j] >= h[j+1]){
               j++;
               moves++;
               if (j==n-1){
                   break;
               }
           }
           if (moves > maxMoves){
               maxMoves = moves;
           }

           if (maxMoves > ((n/2)+1)){
               break;
           }
        }

        out.println(maxMoves);
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

    }
}

