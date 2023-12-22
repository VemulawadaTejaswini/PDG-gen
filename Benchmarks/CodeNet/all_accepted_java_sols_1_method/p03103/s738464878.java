import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 07:00
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            long[] A = new long[N];
            int[] B = new int[N];
            TreeMap<Long, Integer> map = new TreeMap<>();
            for (int i = 0; i < N; i++) {
                long cost = scanner.nextLong();
                int num = scanner.nextInt();
                map.compute(cost, (k,v) -> v == null? num : num + v);
            }
            long totalCost = 0;
            int bought = 0;
            for (final Map.Entry<Long, Integer> kv : map.entrySet()) {
                long cost = kv.getKey();
                int maxnum = kv.getValue();
                int buyCount = Math.min(maxnum, M - bought);
                totalCost += buyCount * cost;
                bought += buyCount;
                if (bought >= M) {
                    break;
                }
            }
            System.out.println(totalCost);
        }
    }
}
