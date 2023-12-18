import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            m.putIfAbsent(a, 0);
            m.put(a, m.get(a) + 1);
        }

        int ans = 0;
        for (int a : m.keySet()) {
            if (m.get(a) > a) {
                ans += m.get(a) - a;
            } else if (m.get(a) < a) {
                ans += m.get(a);
            }
        }

        System.out.println(ans);
    }
}