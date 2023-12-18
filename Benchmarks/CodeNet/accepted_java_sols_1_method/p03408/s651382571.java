
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author rn-sshawish
 */
public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int count = 0;
        HashMap<String, Integer> blueCard = new HashMap<>();
        HashMap<String, Integer> redCard = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = input.readLine();
            blueCard.put(key, blueCard.getOrDefault(key, 0) + 1);
        }
        int m = Integer.parseInt(input.readLine());
        for (int i = 0; i < m; i++) {
            String key = input.readLine();
            redCard.put(key, redCard.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : blueCard.entrySet()) {
            if (redCard.containsKey(entry.getKey()) && entry.getValue() > redCard.get(entry.getKey())) {
                count = Math.max(entry.getValue() - redCard.get(entry.getKey()), count);
            } else if (!redCard.containsKey(entry.getKey())) {
                count = Math.max(count, entry.getValue());
            }
        }
        System.out.println(count);
    }
}
