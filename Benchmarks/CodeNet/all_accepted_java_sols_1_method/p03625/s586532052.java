import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        long a = 0;
        long b = 0;
        for (long num : map.keySet()) {
            if (map.get(num) < 2) continue;

            if (num > a && num > b && map.get(num) >= 4) {
                a = num;
                b = num;
            } else if (num > a) {
                b = a;
                a = num;
            } else if (num > b && num < a) {
                b = num;
            }
        }
        System.out.println(a * b);
    }
}
