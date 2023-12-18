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
            double x = Double.parseDouble(line);
            double h = Double.parseDouble(reader.readLine());
            if (x == 0 && h == 0) {
                break;
            }
            double result = x * x + x * Math.sqrt(4.0 * h * h + x * x);
            out.println(result);
        }
    }
}