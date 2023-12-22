import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            final int A = sc.nextInt();
            if (!map.containsKey(A)) map.put(A, 0);
            map.put(A, map.get(A) + 1);
        }

        if (map.size() <= K) {
            System.out.println(0);
            return;
        }

        final int L = map.size() - K;
        int ans = map.values().stream().sorted().limit(L).mapToInt(Integer::valueOf).sum();
        System.out.println(ans);
    }
}
