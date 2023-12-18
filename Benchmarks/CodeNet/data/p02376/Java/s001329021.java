import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        FordFulkerson fordFulkerson = new FordFulkerson();
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            fordFulkerson.addEdge(e[0], e[1], e[2]);
        }

        System.out.println(fordFulkerson.run(0, V - 1));
    }

}

class FordFulkerson {
    Map<Integer, Map<Integer, Integer>> edges;

    public FordFulkerson() {
        edges = new HashMap<>();
    }

    public void addEdge(int from, int to, int cost) {
        if (!edges.containsKey(from)) {
            edges.put(from, new HashMap<>());
        }
        edges.get(from).put(to, cost);

        if (!edges.containsKey(to)) {
            edges.put(to, new HashMap<>());
        }
        edges.get(to).put(from, 0);
    }

    public long run(int s, int e) {
        long totalFlow = 0;
        List<Integer> path = findPath(s, e, new HashSet<>());
        while (!path.isEmpty()) {
            int maxFlow = Integer.MAX_VALUE;
            for (int i = 0; i < path.size() - 1; i++) {
                maxFlow = Math.min(maxFlow, edges.get(path.get(i)).get(path.get(i + 1)));
            }
            for (int i = 0; i < path.size() - 1; i++) {
                int curr = edges.get(path.get(i)).get(path.get(i + 1));
                edges.get(path.get(i)).put(path.get(i + 1), curr - maxFlow);
                curr = edges.get(path.get(i + 1)).get(path.get(i));
                edges.get(path.get(i + 1)).put(path.get(i), curr + maxFlow);
            }
            totalFlow = totalFlow + maxFlow;
            path = findPath(s, e, new HashSet<>());
        }
        return totalFlow;
    }

    private List<Integer> findPath(int s, int e, Set<Integer> visited) {
        if (s == e) {
            List<Integer> res = new ArrayList<>();
            res.add(s);
            return res;
        }

        if (visited.add(s)) {
            for (Map.Entry<Integer, Integer> entry : edges.getOrDefault(s, Collections.emptyMap()).entrySet()) {
                int to = entry.getKey();
                int cost = entry.getValue();
                if (cost == 0) {
                    continue;
                }
                List<Integer> res = findPath(to, e, visited);
                if (!res.isEmpty()) {
                    res.add(0, s);
                    return res;
                }
            }
        }
        return Collections.emptyList();
    }

}



