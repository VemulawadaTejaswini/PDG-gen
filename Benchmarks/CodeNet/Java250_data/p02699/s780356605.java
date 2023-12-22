import java.io.*;
import java.util.*;

public class Main {


    public static InputReader in = new InputReader( System.in );
    public static PrintWriter out = new PrintWriter( System.out );
    public static void main( String[] atgs ) {

        new Main().solve();
        out.close();
        System.exit(0);
    }


    private void solve() {
        int s = in.nextInt();
        int w = in.nextInt();
        if(s<=w)
            System.out.print("unsafe");
        else
            System.out.print("safe");
    }

    //Solution ends
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader( InputStream stream ) {
            reader = new BufferedReader( new InputStreamReader( stream ), 32768 );
            tokenizer = null;
        }

        public String next() {
            while ( tokenizer == null || !tokenizer.hasMoreTokens( ) ) {
                try {
                    tokenizer = new StringTokenizer( reader.readLine( ) );
                } catch ( IOException e ) {
                    throw new RuntimeException( e );
                }
            }
            return tokenizer.nextToken( );
        }

        public int nextInt() {
            return Integer.parseInt( next( ) );
        }

        public long nextLong() {
            return Long.parseLong( next( ) );
        }

        public double nextDouble() {
            return Double.parseDouble( next( ) );
        }

        public String nextLine() throws IOException {
            return reader.readLine( );
        }
    }


}