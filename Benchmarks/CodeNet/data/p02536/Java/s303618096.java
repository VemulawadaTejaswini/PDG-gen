import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Map<Integer, List<Integer>> roads = new HashMap<>(M);
        for (int i = 0; i < M; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            roads.compute(u, (k, val) -> {
                if (val == null) val = new ArrayList<>();
                val.add(v);
                return val;
            });
            roads.compute(v, (k, val) -> {
                if (val == null) val = new ArrayList<>();
                val.add(u);
                return val;
            });
        }

        boolean[] visited = new boolean[N + 1];
        int components = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(roads, visited, i);
                components++;
            }
        }
        System.out.println(components - 1);
    }

    private static void dfs(Map<Integer, List<Integer>> roads, boolean[] visited, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int city = stack.pop();
            visited[city] = true;
            List<Integer> neighbours = roads.get(city);
            if (neighbours != null) {
                for (Integer n : neighbours) {
                    if (!visited[n]) {
                        stack.push(n);
                    }
                }
            }
        }
    }
}
