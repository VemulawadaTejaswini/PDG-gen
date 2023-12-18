import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        TopologicalSort ts = new TopologicalSort(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ts.addEdge(e[0], e[1]);
        }

        List<Integer> sortedNodes = ts.run();
        for (int n: sortedNodes) {
            System.out.println(n);
        }
    }
}


class TopologicalSort {

    private int size;
    private int[] inDeg;
    public Map<Integer, Set<Edge>> edges;

    public TopologicalSort(int size) {
        this.size = size;
        inDeg = new int[size];
        edges = new HashMap<>();
    }

    public void addEdge(int from, int to) {
        inDeg[to]++;
        if (!edges.containsKey(from)) {
            edges.put(from, new HashSet<>());
        }
        edges.get(from).add(new Edge(from, to, 1));
    }

    public List<Integer> run() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (inDeg[i] == 0) {
                stack.push(i);
            }
        }

        List<Integer> sortedNodes = new ArrayList<>();
        while (!stack.isEmpty()) {
            int node = stack.pop();
            sortedNodes.add(node);
            for (Edge e: edges.getOrDefault(node, Collections.emptySet())) {
                inDeg[e.to]--;
                if (inDeg[e.to] == 0) {
                    stack.push(e.to);
                }
            }
        }

        // Not DAG
        if (sortedNodes.size() < size) {
            return Collections.emptyList();
        }
        return sortedNodes;
    }
}


class Edge {
    public final int from;
    public final int to;
    public final int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from &&
                to == edge.to &&
                cost == edge.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, cost);
    }
}

