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
            int[][] counts = new int[6][9];
            for (int i = 0; i < 13; i++) {
                counts[0][line.charAt(i) - '1']++;
            }
            boolean found = false;
            for (int i = 0; i < 9; i++) {
                if (counts[0][i] == 4) {
                    continue;
                }
                System.arraycopy(counts[0], 0, counts[1], 0, 9);
                counts[1][i]++;
                for (int j = 0; j < 9; j++) {
                    if (counts[1][j] < 2) {
                        continue;
                    }
                    System.arraycopy(counts[1], 0, counts[2], 0, 9);
                    counts[2][j] -= 2;
                    if (check(counts, 2)) {
                        if (!found) {
                            found = true;
                        } else {
                            out.print(' ');
                        }
                        out.print(i + 1);
                    }
                }
            }
            if (!found) {
                out.print(0);
            }
            out.println();
        }
    }

    private static boolean check(int[][] counts, int r) {
        for (int k = 0; k < 9; k++) {
            if (counts[r][k] == 0) {
                continue;
            }
            if (k < 7 && counts[r][k + 1] > 0 && counts[r][k + 2] > 0) {
                if (r == 5) {
                    return true;
                }
                System.arraycopy(counts[r], 0, counts[r + 1], 0, 9);
                counts[r + 1][k]--;
                counts[r + 1][k + 1]--;
                counts[r + 1][k + 2]--;
                if (check(counts, r + 1)) {
                    return true;
                }
            }
            if (counts[r][k] >= 3) {
                if (r == 5) {
                    return true;
                }
                System.arraycopy(counts[r], 0, counts[r + 1], 0, 9);
                counts[r + 1][k] -= 3;
                if (check(counts, r + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}