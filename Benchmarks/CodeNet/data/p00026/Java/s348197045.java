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
        int[][] counts = new int[14][14];
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] values = line.split(",");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);
            int size = Integer.parseInt(values[2]);
            int i = x + 2;
            int j = y + 2;
            counts[i][j]++;
            counts[i][j - 1]++;
            counts[i + 1][j]++;
            counts[i][j + 1]++;
            counts[i - 1][j]++;
            if (size >= 2) {
                counts[i + 1][j - 1]++;
                counts[i + 1][j + 1]++;
                counts[i - 1][j + 1]++;
                counts[i - 1][j - 1]++;
                if (size >= 3) {
                    counts[i][j - 2]++;
                    counts[i + 2][j]++;
                    counts[i][j + 2]++;
                    counts[i - 2][j]++;
                }
            }
        }
        int emptyCount = 0;
        int maxCount = 0;
        for (int i = 2; i < 12; i++) {
            for (int j = 2; j < 12; j++) {
                int count = counts[i][j];
                if (count == 0) {
                    emptyCount++;
                } else if (count > maxCount) {
                    maxCount++;
                }
            }
        }
        out.println(emptyCount);
        out.println(maxCount);
    }
}