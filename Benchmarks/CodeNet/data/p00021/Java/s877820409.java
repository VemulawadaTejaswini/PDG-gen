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
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] values = line.split(" ");
            double x1 = Double.parseDouble(values[0]);
            double y1 = Double.parseDouble(values[1]);
            double x2 = Double.parseDouble(values[2]);
            double y2 = Double.parseDouble(values[3]);
            double x3 = Double.parseDouble(values[4]);
            double y3 = Double.parseDouble(values[5]);
            double x4 = Double.parseDouble(values[6]);
            double y4 = Double.parseDouble(values[7]);
            double det = (x2 - x1) * (y4 - y3) - (y2 - y1) * (x4 - x3);
            out.println(det == 0.0 ? "YES" : "NO");
        }
    }
}