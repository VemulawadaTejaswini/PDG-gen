import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Map<Integer, Integer> A = new HashMap<>();
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A.put(i + 1, scanner.nextInt());
        }

        long ans = 0;
        for (int i = 1; i < N + 1; i++) {
            int L = A.get(i) - i;
            ans += cache.getOrDefault(L, 0);

            int R = -i - A.get(i);
            cache.put(R, cache.getOrDefault(R, 0) + 1);
        }

        System.out.println(ans);
    }
}