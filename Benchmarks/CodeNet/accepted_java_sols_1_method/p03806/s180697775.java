import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> next = new HashMap<>(map);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey() + a * 1000 + b;
                int value = entry.getValue() + c;
                if (next.containsKey(key)) {
                    if (next.get(key) > value) {
                        next.put(key, value);
                    }
                } else {
                    next.put(key, value);
                }
            }
            map = next;
        }
        int min = Integer.MAX_VALUE;
        
        for (int key = ma * 1000 + mb; key < 4000400; key += ma * 1000 + mb) {
            if (map.containsKey(key) && map.get(key) < min) {
                min = map.get(key);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}