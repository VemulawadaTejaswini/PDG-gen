import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int a = std.nextInt();
        int b = std.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = std.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        map.put(b+1, 0);
        map.put(b, 0);
        map.put(a, 0);

        for (int i = 0; i < n; i++) {
            int point = p[i];
            if (point >= b + 1) {
                map.put(b+1, map.getOrDefault(b+1, 0) + 1);
            } else if (point > a) {
                map.put(b, map.getOrDefault(b, 0) + 1);
            } else {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        long min = Long.MAX_VALUE;
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> e = it.next();
            min = Math.min(e.getValue(), min);
        }

        System.out.println(min);
    }
}
