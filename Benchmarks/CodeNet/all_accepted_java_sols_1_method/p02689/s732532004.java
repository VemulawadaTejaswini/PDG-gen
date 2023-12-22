
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] height = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            height[i] = scanner.nextInt();
        }
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!graph.containsKey(a)) {
                graph.put(a, new HashMap<>());
            }
            if (!graph.containsKey(b)) {
                graph.put(b, new HashMap<>());
            }
            Integer aToB = graph.get(a).getOrDefault(b, 0);
            graph.get(a).put(b, aToB + 1);
            graph.get(b).put(a, aToB + 1);
        }
        int[] good = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            if (good[i] == -1) {
                continue;
            }
            if (!graph.containsKey(i)) {
                good[i] = 1;
                continue;
            }
            Map<Integer, Integer> neighbors = graph.get(i);
         //   System.out.println("i: " + i);
            for (Map.Entry<Integer, Integer> neighborRoads : neighbors.entrySet()) {
                int neighbor = neighborRoads.getKey();
             //   System.out.println("neighbor:  " + neighbor + " roads: " + neighborRoads.getValue());
                if (height[neighbor] >= height[i]) {
                    good[i] = -1;
                    break;
                }
            }
            if (good[i] == 0) {
                good[i] = 1;
           //     System.out.println("good: " + i);
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            if (good[i] == 1) {
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
