import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        boolean isDown = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (isDown && prev < x) {
                if (map.containsKey(prev)) {
                    map.put(prev, map.get(prev) + 1);
                } else {
                    map.put(prev, 1);
                }
                isDown = false;
            } else if (!isDown && prev > x) {
                if (map.containsKey(prev)) {
                    map.put(prev, map.get(prev) - 1);
                } else {
                    map.put(prev, -1);
                }
                isDown = true;
            }
            prev = x;
        }
        if (!isDown) {
            if (map.containsKey(prev)) {
                map.put(prev, map.get(prev) - 1);
            } else {
                map.put(prev, -1);
            }
        }
        int max = 0;
        int current = 0;
        for (int x : map.values()) {
            current += x;
            max = Math.max(max, current);
        }
       System.out.println(max);
     }
}
