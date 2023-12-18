
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        String input = inputReader.readLine();
        int problemCount = Integer.parseInt(input);
        while (problemCount-- > 0) {
            input = inputReader.readLine();
            int B = Integer.MIN_VALUE;
            int C = Integer.MIN_VALUE;
            boolean success = true;
            for (String ball : input.split(" ")) {
                int value = Integer.parseInt(ball);
                if (B < value) {
                    B = value;
                } else if (C < value) {
                    C = value;
                } else {
                    success = false;
                    break;
                }
            }
            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}