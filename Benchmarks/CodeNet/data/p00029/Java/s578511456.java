
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = inputReader.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int maxCount = 0;
        int maxLength = 0;
        String maxLengthString = "";
        for (String token : inputs) {
            if (!map.containsKey(token)) {
                map.put(token, 1);
            } else {
                map.put(token, map.get(token) + 1);
            }
            if (maxCount < map.get(token)) {
                maxCount = map.get(token);
            }
            if (maxLength < token.length()) {
                maxLength = token.length();
                maxLengthString = token;
            }
        }
        for (Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == maxCount) {
                System.out.print(e.getKey());
                break;
            }
        }
        System.out.println(" " + maxLengthString);
    }
}