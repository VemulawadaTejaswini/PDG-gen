
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author takumi.oodaira
 */
final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        Calendar calendar = Calendar.getInstance();
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String[] inputs = input.split(" ");
            if (inputs[0].equals("0")) {
                break;
            }
            calendar.set(2004, Integer.parseInt(inputs[0]) - 1, Integer.parseInt(inputs[1]));
            final String week = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
            System.out.println(week);
        }
    }
}