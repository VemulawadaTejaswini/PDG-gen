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
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int[][] result = new int[n][n];
            int x = n / 2;
            int y = n / 2 + 1;
            for (int i = 1; i <= n * n; i++) {
                while (true) {
                    if (x >= n) {
                        x = 0;
                        continue;
                    }
                    if (x < 0) {
                        x = n - 1;
                        continue;
                    }
                    if (y >= n) {
                        y = 0;
                        continue;
                    }
                    if (result[y][x] > 0) {
                        x--;
                        y++;
                        continue;
                    }
                    break;
                }
                result[y][x] = i;
                x += 1;
                y += 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(String.format("%4d", result[i][j]));
                }
                out.println();
            }
        }
    }
}