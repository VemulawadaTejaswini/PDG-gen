
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

final class Main {

    public static final int PMAX = 60000;

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[PMAX];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < PMAX; i++) {
            if (prime[i]) {
                for (int j = i * 2; j < PMAX; j += i) {
                    prime[j] = false;
                }
            }
        }
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            int index = Integer.parseInt(input);
            for (int i = index - 1; i >= 0; i--) {
                if (prime[i]) {
                    System.out.print(i + " ");
                    break;
                }
            }
            for (int i = index + 1; i < PMAX; i++) {
                if (prime[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}