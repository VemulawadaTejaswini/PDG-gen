import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<Integer[]> edgeList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            edgeList.add(new Integer[] { a, b });
        }
        sc.close();

        // 主処理
        int max = 0;
        Map<Integer, HashSet<Integer>> graph = createGraph(n, edgeList);
        for (int key : graph.keySet()) {
            Set<Integer> set = new HashSet<>();
            set.addAll(graph.get(key));
            for (int num : graph.get(key)) {
                set.addAll(graph.get(num));
            }
            max = Math.max(max, set.size());
        }
        int result = max;

        // 出力
        System.out.println(result);
    }

    public static Map<Integer, HashSet<Integer>> createGraph(int nodeSize, List<Integer[]> edgeList) {
        Map<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= nodeSize; i++) {
            graph.put(i, new HashSet<>());
        }
        for (Integer[] edge : edgeList) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
}
