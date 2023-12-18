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
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String[] values = line.split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int n = Integer.parseInt(values[2]);
            int q = Math.abs(b);
            int p = Math.abs(a) % q;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                p *= 10;
                int f = p / q;
                if (f == 0) {
                    continue;
                }
                sum += f;
                p %= q;
            }
            out.println(sum);
        }
    }
}