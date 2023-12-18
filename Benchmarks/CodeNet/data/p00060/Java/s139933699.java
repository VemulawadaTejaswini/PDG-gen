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
            int c1 = Integer.parseInt(values[0]);
            int c2 = Integer.parseInt(values[1]);
            int c3 = Integer.parseInt(values[2]);
            boolean[] opens = new boolean[10];
            opens[c1 - 1] = true;
            opens[c2 - 1] = true;
            opens[c3 - 1] = true;
            int count = 0;
            String result = "NO";
            for (int i = 0; i < Math.min(20 - (c1 + c2), 10); i++) {
                if (!opens[i]) {
                    count++;
                    if (count == 4) {
                        result = "YES";
                        break;
                    }
                }
            }
            out.println(result);
        }
    }
}