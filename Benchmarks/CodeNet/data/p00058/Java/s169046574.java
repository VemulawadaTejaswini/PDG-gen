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
            double xa = Double.parseDouble(values[0]);
            double ya = Double.parseDouble(values[1]);
            double xb = Double.parseDouble(values[2]);
            double yb = Double.parseDouble(values[3]);
            double xc = Double.parseDouble(values[4]);
            double yc = Double.parseDouble(values[5]);
            double xd = Double.parseDouble(values[6]);
            double yd = Double.parseDouble(values[7]);
            double ip = (xb - xa) * (xd - xc) + (yb - ya) * (yd - yc);
            String result = ip == 0.0 ? "YES" : "NO";
            out.println(result);
        }
    }
}