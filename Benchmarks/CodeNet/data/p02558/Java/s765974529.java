import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());

        Map<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(sc.next());
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            if (t == 0) {
                graph.get(u).add(v);
                graph.get(v).add(u);
            } else {
                if (0 < distance(n, graph, u, v)) {
                    list.add("1");
                } else {
                    list.add("0");
                }
            }
        }
        sc.close();

        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }

    public static int distance(int nodeSize, Map<Integer, HashSet<Integer>> graph, int start, int target) {
        Deque<Integer> todo = new ArrayDeque<>();
        todo.add(start);

        int[] distance = new int[nodeSize];
        distance[start]++;

        int dist = 0;
        while (!todo.isEmpty()) {
            int point = todo.poll();
            if (point == target) {
                dist = distance[point] - 1;
                break;
            }
            for (int nextPoint : graph.get(point)) {
                if (distance[nextPoint] == 0) {
                    todo.add(nextPoint);
                    distance[nextPoint] = distance[point] + 1;
                }
            }
        }

        return dist;
    }
}
