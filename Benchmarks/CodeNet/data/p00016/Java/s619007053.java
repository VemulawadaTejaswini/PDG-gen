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
        double x = 0.0;
        double y = 0.0;
        int direction = 0;
        while (true) {
            String line = reader.readLine();
            if (line.equals("0,0")) {
                break;
            }
            String[] values = line.split(",");
            int distance = Integer.parseInt(values[0]);
            int angle = Integer.parseInt(values[1]);
            double rad = Math.toRadians(direction);
            x += distance * Math.sin(rad);
            y += distance * Math.cos(rad);
            direction += angle;
        }
        out.println((int) x);
        out.println((int) y);
    }
}