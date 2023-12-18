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
        int count = 0;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            if (a == 0 && b == 0) {
                break;
            }
            if (count > 0) {
                out.println();
            }
            boolean found = false;
            for (int i = a; i <= b; i++) {
                if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                    out.println(i);
                    found = true;
                }
            }
            if (!found) {
                out.println("NA");
            }
            count++;
        }
    }
}