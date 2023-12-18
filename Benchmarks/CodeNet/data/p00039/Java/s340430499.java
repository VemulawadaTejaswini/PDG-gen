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
            line += 'Z';
            int sum = 0;
            int n1 = numbers[line.charAt(0) - 'A'];
            for (int i = 0; i < line.length() - 1; i++) {
                int n2 = numbers[line.charAt(i + 1) - 'A'];
                if (n1 >= n2) {
                    sum += n1;
                } else {
                    sum -= n1;
                }
                n1 = n2;
            }
            out.println(sum);
        }
    }

    private static final int[] numbers = { 0, 0, 100, 500, 0, 0, 0, 0, 1, 0, 0,
            50, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10, 0, 0 };
}