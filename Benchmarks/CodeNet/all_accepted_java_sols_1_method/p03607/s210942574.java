import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // シミュレーション
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Long> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long e = sc.nextLong();
            if (m.containsKey(e)) {
                m.put(e, m.get(e) + 1L);
            } else {
                m.put(e, 1L);
            }
        }

        int ans = 0;
        for (Entry<Long, Long> ent : m.entrySet()) {
            if (ent.getValue() % 2 == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

