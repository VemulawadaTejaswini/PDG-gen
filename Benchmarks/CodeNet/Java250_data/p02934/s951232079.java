import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public final class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        double n = stdIn.nextDouble();
        double[] a = new double[(int)n];
        for(int i=0; i<(int)n; i++){
            a[i] = stdIn.nextDouble();
        }
        
        double up = 1;
        double down = 0.0;
        for(int i=0; i<a.length; i++){
            up *= a[i];
        }
        for(int i=0; i<a.length; i++){
            down += up/a[i];
        }

        System.out.println(up/down);
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
