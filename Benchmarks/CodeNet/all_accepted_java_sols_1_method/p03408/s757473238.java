import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Integer count = map1.getOrDefault(s, 0);
            map1.put(s, ++count);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            Integer count = map1.getOrDefault(s, 0);
            map1.put(s, --count);
        }

        int max = 0;
        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            max = Math.max(max, e.getValue());
        }

        System.out.println(max);
    }
}