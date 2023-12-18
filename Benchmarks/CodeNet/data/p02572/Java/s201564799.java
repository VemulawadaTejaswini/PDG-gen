    import java.io.*;
    import java.util.*;
    import java.util.LinkedList;

    public class Main {

        public static void main(String[] args) throws IOException {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
            BufferedReader reader = new BufferedReader(new InputReader(System.in));

            int mod = 1_000_000_000 + 7;
            int n = in.nextInt();
            long [] a = new long[n];
            long sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextLong();
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    long pr = (a[i] * a[j]);
                    sum = (sum + pr)%mod;
                }
            }
            out.println(sum);
            out.flush();
        }
        private static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b,a%b);
        }
        private static void shuffle(int [] a) {
            for (int i = 0; i < a.length; i++) {
                int index = (int) (Math.random() * a.length);
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
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

        public Integer nextInt() {
            return Integer.valueOf(next());
        }
        public Long nextLong() {
            return  Long.valueOf(next());
        }
        public Double nextDouble () {
            return Double.valueOf(next());
        }


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