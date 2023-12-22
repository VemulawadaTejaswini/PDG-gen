import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            final long n = sc.nextInt();
            if (!map.containsKey(n)) map.put(n, 0L);
            map.put(n, map.get(n) + 1);
        }

        long sum = map.entrySet().stream().mapToLong(entry -> entry.getKey() * entry.getValue()).sum();

        final int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            final long B = sc.nextInt();
            final long C = sc.nextInt();
            final long n = map.containsKey(B) ? map.get(B) : 0;
            sum -= B * n;
            map.put(B, 0L);
            sum += C * n;
            if (!map.containsKey(C)) {
                map.put(C, 0L);
            }
            map.put(C, map.get(C) + n);
            System.out.println(sum);
        }

    }
}
