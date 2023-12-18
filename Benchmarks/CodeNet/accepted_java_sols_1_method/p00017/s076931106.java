
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
            String testString = input;
            while (true) {
                if (testString.matches("(^|.* )(the|this|that)( |\\.).*")) {
                    break;
                }
                char[] temp = testString.toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i] < 'a' || temp[i] > 'z') continue;
                    final char c = (char) (temp[i] + 1);
                    temp[i] = c > 'z' ? 'a' : c;
                }
                testString = String.valueOf(temp);
            }
            System.out.println(testString);
        }
    }
}