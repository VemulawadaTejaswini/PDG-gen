import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static class Task {

        private long a;
        private long b;
        private long c;
        private long d;
        private Map<Long, Long> memoMap;

        private long dp(long n) {
            if (n == 1) {
                return 0;
            }
            
//            System.out.println(n);

            if (memoMap.containsKey(n)) {
                return memoMap.get(n);
            }

            long minRes = Long.MAX_VALUE;
            long left = Math.max(1, n - 5);
            long right = n + 1;
            for (long i = left; i <= right; i++) {
                long tmpMinRes = Long.MAX_VALUE;
                if (i == 1) {
                    tmpMinRes =  Math.abs(i - n) * d;
                    minRes = Math.min(minRes, tmpMinRes);
                    continue;
                }

                if (i % 2 == 0) {
                    long res = dp(i / 2);
                    if (d * i / 2 < 0) {
                        res += a;
                    } else {
                        res += Math.min(d * i / 2, a);
                    }
                    if (res >= 0) {
                        tmpMinRes = Math.min(tmpMinRes, res);
                    }
                }

                if (i % 3 == 0) {
                    long res = dp(i / 3);
                    if (d * i * 2 / 3 < 0) {
                        res += b;
                    } else {
                        res += Math.min(d * i * 2 / 3, b);
                    }
                    if (res >= 0) {
                        tmpMinRes = Math.min(tmpMinRes, res);
                    }
                }

                if (i % 5 == 0) {
                    long res = dp(i / 5);
                    if (d * i * 4 / 5 < 0) {
                        res += c;
                    } else {
                        res += Math.min(d * i * 4 / 5, c);
                    }
                    if (res >= 0) {
                        tmpMinRes = Math.min(tmpMinRes, res);
                    }
                }

                if (tmpMinRes != Long.MAX_VALUE) {
                    tmpMinRes += Math.abs(i - n) * d;
                    minRes = Math.min(minRes, tmpMinRes);
                }

            }

            memoMap.put(n, minRes);
            return minRes;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int t = in.nextInt();
            while ((t--) > 0) {
                long n = in.nextLong();
                a = in.nextLong();
                b = in.nextLong();
                c = in.nextLong();
                d = in.nextLong();

                memoMap = new HashMap<>();
                long ans = dp(n) + d;
                out.println(ans);
            }
        }
    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
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

    }

}