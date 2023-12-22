import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        FastScanner stdIn = new FastScanner(System.in);
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();

        if(c-(a-b)<0){
            System.out.println(0);
        }else{
            System.out.println(c-(a-b));
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public long nextInt() {
        return Integer.parseInt(next());
    }

}
