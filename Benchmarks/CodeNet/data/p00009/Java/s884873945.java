import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> cache = new HashMap<String, Integer>();

        final Integer MAX = 1000000;
        boolean[] natural = new boolean[MAX];
        int[] counts = new int[MAX];

        for (int i = 2; i <= 500000; i++) {
            for (int j = 2; j <= Math.ceil(999999 / i); j++) {
                natural[i * j] = true;
            }
        }

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            if (cache.containsKey(line))
                System.out.println(cache.get(line));

            int cnt = 0;
            for (int i = 2; i <= Integer.parseInt(line); i++) {
                if (!natural[i]) cnt++;
            }
            cache.put(line, cnt);
            System.out.println(cnt);
        }
    }
}