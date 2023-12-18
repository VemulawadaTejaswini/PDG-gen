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
        int[][] data = new int[99][50];
        int n = 0;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(",");
            for (int i = 0; i < values.length; i++) {
                data[n][i] = Integer.parseInt(values[i]);
            }
            n++;
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j <= i + 1; j++) {
                int left = j > 0 ? data[i - 1][j - 1] : 0;
                int top = data[i - 1][j];
                data[i][j] += Math.max(left, top);
            }
        }
        for (int i = n / 2 + 1; i < n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                int top = data[i - 1][j];
                int right = j < n - 1 ? data[i - 1][j + 1] : 0;
                data[i][j] += Math.max(top, right);
            }
        }
        out.println(data[n - 1][0]);
    }
}