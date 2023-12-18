import java.io.*;
import java.util.*;

 class z61 {

    public static void solve(InputReader in, PrintWriter out) throws Exception {

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int xor =0;

        for(int i=0;i<n-1;i+=2)
        xor=xor^arr[i]^arr[i+1];

        for(int i=0;i<n;i++)
            out.print((xor^arr[i])+" ");

        out.println();


    }

    /////////////////////////////////////////////////////////


    private final static long hash(long x, long y) {
        x += offset;
        y += offset;
        return x << 32 | y;
    }

    private final static int offset = (int) 3e5;

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String nextToken() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(nextToken());
        }

    }
}