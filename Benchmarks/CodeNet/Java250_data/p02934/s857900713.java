import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    private static List<List<Integer>> subsets;
    private static int count = 0;
    private static BigInteger thirteen = new BigInteger("13");
    private static BigInteger five = new BigInteger("5");
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        double [] a =  new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
        }
        double g = 0;
        double p = 1;
        for (int i = 0; i < a.length; i++) {
            g = gcd(g,a[i]);
            p*=a[i];
        }
        double s = 0;
        double lcm = p/g;
        for (int i = 0; i < a.length; i++) {
            s+=lcm/a[i];
        }

        double ans = lcm/s;
        out.println(ans);
        out.flush();
    }

    static double gcd(double a,double b) {
        return b == 0 ? a : gcd(b,a%b);
    }
}

class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}