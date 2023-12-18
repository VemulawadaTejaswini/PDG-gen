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
            String[] values = line.split(",");
            int number = Integer.parseInt(values[0]);
            double weight = Double.parseDouble(values[1]);
            double height = Double.parseDouble(values[2]);
            double bmi = weight / height / height;
            if (bmi > 25.0) {
                out.println(number);
            }
        }
    }
}