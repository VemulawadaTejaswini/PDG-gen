import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() == 4) {
                c = 2;
            }
            if (e.getValue() == 2) {
                c++;
            }
        }
        System.out.println(c == 2 ? "yes" : "no");
    }
}
