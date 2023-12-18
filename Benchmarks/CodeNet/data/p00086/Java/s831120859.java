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
            int[] counts = new int[101];
            while (true) {
                String[] values = line.split(" ");
                int a = Integer.parseInt(values[0]);
                int b = Integer.parseInt(values[1]);
                if (a == 0 && b == 0) {
                    break;
                }
                counts[a]++;
                counts[b]++;
                line = reader.readLine();
            }
            String result = "NG";
            if (counts[1] % 2 == 1 && counts[2] % 2 == 1) {
                boolean found = false;
                for (int i = 3; i <= 100; i++) {
                    if (counts[i] % 2 != 0) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    result = "OK";
                }
            }
            out.println(result);
        }
    }
}