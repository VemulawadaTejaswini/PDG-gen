import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }
}

public class Main {
    //static final int MOD=1000000007;
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        Reader.init(System.in);
        int test = 1;
        for (int ii = 0; ii < test; ii++) {
            int n = Reader.nextInt();
            int num = n % 10;
            if (num == 2 || num == 4 || num == 5 || num == 7 || num == 9) {
                out.write("hon\n");
            } else if (num == 0 || num == 1 || num == 6 || num == 8) {
                out.write("pon\n");
            } else if (num == 3) {
                out.write("bon\n");
            }
        }
        out.flush();
        out.close();
    }
}

