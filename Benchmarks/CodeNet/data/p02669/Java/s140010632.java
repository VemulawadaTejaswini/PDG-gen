
import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);

    void handle(long[] curr, long m, long cost, long d, PriorityQueue<long[]> q, Map<Long, Long> visited) {
        long c = curr[0] + cost + d * (curr[1] % m);
        if (!visited.containsKey(curr[1]/m) || visited.get(curr[1]/m) > c) {
            q.add(new long[]{c, curr[1]/m});
            visited.put(curr[1]/m, c);
        }

        c = curr[0] + cost + d * (m-curr[1] % m);
        if (!visited.containsKey(curr[1] / m + 1) || visited.get(curr[1] / m + 1) > c) {
            q.add(new long[]{c, curr[1] / m + 1});
            visited.put(curr[1] / m + 1, c);
        }
    }

    long solve() {
        long n = in.nextLong(), a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), d = in.nextLong();
        PriorityQueue<long[]> q = new PriorityQueue<>(Comparator.comparingLong(x -> x[0]));
        q.add(new long[]{0, n});
        long ret = -1;
        Map<Long, Long> visited = new HashMap<>();
        while (!q.isEmpty()) {
            long[] curr = q.poll();
            if (curr[1] == 0) {
                ret = curr[0];
                break;
            }

            handle(curr, 2, a, d, q, visited);
            handle(curr, 3, b, d, q, visited);
            handle(curr, 5, c, d, q, visited);

            if (curr[1] == 1) {
                if (!visited.containsKey(0) || visited.get(0) < curr[0] + d) {
                    visited.put(0L, curr[0] + d);
                    q.add(new long[]{curr[0] + d, 0});
                }
            }
        }

        return Math.min(ret, d * n);
    }

    void run() {
        int T = in.nextInt();
        while (T-- > 0) {
            System.out.println(solve());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
