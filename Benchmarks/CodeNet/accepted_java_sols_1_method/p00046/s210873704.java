
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            double val = Double.parseDouble(input);
            if (max < val) {
                max = val;
            }
            if (min > val) {
                min = val;
            }
        }
        System.out.println(max - min);
    }
}