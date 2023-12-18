import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) - 1);
            } else {
                map.put(key, 1);
            }
        }

        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }
        System.out.print(max);
    }
}