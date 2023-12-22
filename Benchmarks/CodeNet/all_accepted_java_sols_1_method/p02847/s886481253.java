import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> week = new HashMap<>();
        week.put("SAT", 1);
        week.put("FRI", 2);
        week.put("THU", 3);
        week.put("WED", 4);
        week.put("TUE", 5);
        week.put("MON", 6);
        week.put("SUN", 7);
        String S = br.readLine();
        System.out.println(week.get(S));
    }
}
