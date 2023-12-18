import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int plus = 0;
        int count = 0;
        while (count < n - k) {
            int first_group = 0;
            int second_group = 0;
            for (int i = 0; i < k; i++) {
                first_group += array[i + plus];
                second_group += array[i + plus + 1];
            }
            plus++;
            if (second_group - first_group > 0) {
                System.out.println("Yes");
                count++;
            } else {
                System.out.println("No");
                count++;
            }

        }
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public long nextInt() {
            return Integer.parseInt(next());
        }

    }
}