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
            String[] values = line.split(" ");
            int n = Integer.parseInt(values[0]);
            int m = Integer.parseInt(values[1]);
            if (n == 0 && m == 0) {
                break;
            }
            boolean[] used = new boolean[n];
            int p = -1;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    while (true) {
                        p++;
                        if (p >= n) {
                            p = 0;
                        }
                        if (!used[p]) {
                            break;
                        }
                    }
                }
                used[p] = true;
            }
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    out.println(i + 1);
                    break;
                }
            }
        }
    }
}