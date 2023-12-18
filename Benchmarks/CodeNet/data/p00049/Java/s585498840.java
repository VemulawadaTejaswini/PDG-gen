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
        int[] counts = new int[4];
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String[] values = line.split(",");
            String type = values[1];
            if (type.equals("A")) {
                counts[0]++;
            } else if (type.equals("B")) {
                counts[1]++;
            } else if (type.equals("AB")) {
                counts[2]++;
            } else {
                counts[3]++;
            }
        }
        for (int count : counts) {
            out.println(count);
        }
    }
}