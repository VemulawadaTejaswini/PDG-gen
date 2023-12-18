
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
            String input = inputReader.readLine();
            if (input == null || input.equals("0 0")) {
                break;
            }
            String[] inputs = input.split(" ");
            int n = Integer.parseInt(inputs[0]);
            int s = Integer.parseInt(inputs[1]);
            System.out.println(solv(n, s));
        }
    }

    private static int solv(final int n, final int s) {
        return solv(n, s, 0);
    }

    private static int solv(final int n, final int s, final int min) {
        if (n == 0) {
            return s == 0 ? 1 : 0;
        }
        int count = 0;
        for (int i = min; i < 10 && i <= s; i++) {
            count += solv(n - 1, s - i, i + 1);
        }
        return count;
    }
}