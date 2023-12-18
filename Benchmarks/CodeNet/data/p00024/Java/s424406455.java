
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            final String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            double cv = Double.parseDouble(input);
            double t = cv / 9.8;
            int N = 1;
            while (4.9 * Math.pow(t, 2) > 5 * N - 5) {
                N++;
            }
            System.out.println(N);
        }
    }
}