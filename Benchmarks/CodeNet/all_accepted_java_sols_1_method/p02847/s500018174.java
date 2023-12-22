import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            Map<String, Integer> days = new HashMap<>();
            days.put("MON", 6);
            days.put("TUE", 5);
            days.put("WED", 4);
            days.put("THU", 3);
            days.put("FRI", 2);
            days.put("SAT", 1);
            days.put("SUN", 7);

            System.out.println(days.get(input).intValue());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}