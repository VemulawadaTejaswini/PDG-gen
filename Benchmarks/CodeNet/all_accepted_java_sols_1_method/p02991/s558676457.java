
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int m = in.nextInt();
        final Map<Integer, List<Integer>> edges = new HashMap<>();
        final int[][] cost = new int[n][3];
        // -1 means not visited.
        for (int i = 0; i < n; i++) {
            Arrays.fill(cost[i], Integer.MIN_VALUE);
        }


        for (int i = 0; i < m; i++) {
            final int from = in.nextInt();
            final int to = in.nextInt();
            edges.compute(from - 1, (key, list) -> {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(to - 1);
                return list;
            });
        }
        final int s0 = in.nextInt() - 1;
        final int t0 = in.nextInt() - 1;
        final List<int[]> nodes = new ArrayList<>();
        nodes.add(new int[]{s0, 0});
        cost[s0][0] = 0;
        while (!nodes.isEmpty()) {
            final int[] from = nodes.remove(0);
            if (from[0] == t0 && from[1] == 0) {
                System.out.println(cost[from[0]][0] / 3);
                return;
            }

            for (Integer to : edges.getOrDefault(from[0], new ArrayList<>())) {
                final int state = from[1];
                final int nextState = (state + 1) % 3;
                if (cost[to][nextState] == Integer.MIN_VALUE) {
                    cost[to][nextState] = cost[from[0]][state] + 1;
                    nodes.add(new int[]{to, nextState});
                }
            }
        }
        System.out.println(-1);
    }
}
