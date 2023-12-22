import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        for (int i = 0, sum = 0; i < n; i++) {
            sum = (sum + scanner.nextInt()) % m;
            map.put(sum, map.getOrDefault(sum, 0L) + 1);
        }
        long ans = 0;
        for (long i : map.values()) {
            ans += i * (i - 1) / 2;
        }
        System.out.println(ans);
    }
}