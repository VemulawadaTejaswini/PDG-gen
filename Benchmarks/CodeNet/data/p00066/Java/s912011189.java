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
            if (line == null) {
                break;
            }
            char result = 'd';
            for (int i = 0; i < patterns.length; i++) {
                int[] pattern = patterns[i];
                char ch = line.charAt(pattern[0]);
                if (ch == 's') {
                    continue;
                }
                if (ch == line.charAt(pattern[1])
                        && ch == line.charAt(pattern[2])) {
                    result = ch;
                    break;
                }
            }
            out.println(result);
        }
    }

    private static final int[][] patterns = { { 0, 1, 2 }, { 3, 4, 5 },
            { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 },
            { 2, 4, 6 } };
}