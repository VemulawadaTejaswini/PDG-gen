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
            int a, b, h, m;
            a = Reader.nextInt();
            b = Reader.nextInt();
            h = Reader.nextInt();
            m = Reader.nextInt();
            int hour_angle = (int) (0.5 * (h * 60 + m));
            int minute_angle = (int) (6 * m);

            // Find the difference between two angles
            int angle = Math.abs(hour_angle - minute_angle);

            // smaller angle of two possible angles
            angle = Math.min(360 - angle, angle);
            //System.out.println("angle "+angle);
            double radians = Math.toRadians(angle);
            double ans = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(radians);
            ans = Math.sqrt(ans);
            System.out.format("%.18f",ans);
        }
        out.flush();
        out.close();
    }
}

