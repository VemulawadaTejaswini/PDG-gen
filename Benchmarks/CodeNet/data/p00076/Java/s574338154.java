import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == -1) {
                break;
            }
            double x = 1.0;
            double y = 0.0;
            for (int i = 0; i < n - 1; i++) {
                double d = Math.hypot(x, y);
                double dx = -y / d;
                double dy = x / d;
                x += dx;
                y += dy;
            }
            out.println(x);
            out.println(y);
        }
    }
}