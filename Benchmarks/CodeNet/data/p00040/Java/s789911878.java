
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    public static final int LOOP_MAX = 26;

    private static char convert(final int alpha, final int beta, final char c) {
        return (char) ((alpha * c + beta) % LOOP_MAX);
    }

    private static boolean check(final int alpha, final int beta) {
        int[] test = new int[LOOP_MAX];
        for (int i = 0; i < LOOP_MAX; i++) {
            final char index = convert(alpha, beta, (char) i);
            test[index]++;
            if (test[index] > 1) {
                return false;
            }
        }
        return true;
    }

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        String input = inputReader.readLine();
        int loopCount = Integer.parseInt(input);
        while (loopCount-- > 0) {
            input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String testString = input;
            boolean flag = true;
            for (int alpha = 1; flag && alpha < LOOP_MAX; alpha++) {
                for (int beta = 0; flag && beta < LOOP_MAX; beta++) {
                    if (!check(alpha, beta)) {
                        continue;
                    }
                    char[] temp = input.toCharArray();
                    for (int i = 0; i < temp.length; i++) {
                        if (temp[i] < 'a' || temp[i] > 'z') {
                            continue;
                        }
                        temp[i] = (char) (convert(alpha,
                                beta, (char) (temp[i] - 'a')) + 'a');
                    }
                    testString = String.valueOf(temp);
                    if (testString.matches("(^|.* )(the|this|that)( |\\.).*")) {
                        flag = false;
                    }
                }
            }
            System.out.println(testString);
        }
    }
}