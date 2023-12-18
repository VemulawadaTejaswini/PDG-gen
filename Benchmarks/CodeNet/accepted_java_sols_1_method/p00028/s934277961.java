
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[101];
        Arrays.fill(count, 0);
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            count[Integer.parseInt(input)]++;
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                System.out.println(i);
            }
        }
    }
}