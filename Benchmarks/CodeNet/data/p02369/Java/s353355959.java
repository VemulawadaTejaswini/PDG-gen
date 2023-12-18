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

        CycleDetection cycleDetection = new CycleDetection(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cycleDetection.addEdge(e[0], e[1]);
        }

        cycleDetection.run();
        System.out.println(cycleDetection.cycles.isEmpty() ? 0 : 1);
    }
}

class CycleDetection {
    public Map<Integer, Set<Edge>> edges;
    private TreeSet<Integer> unvisited;
    public List<List<Integer>> cycles;

    public CycleDetection(int size) {
        edges = new HashMap<>();
        cycles = new ArrayList<>();
        unvisited = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            unvisited.add(i);
        }
    }

    public void addEdge(int from, int to) {
        if (!edges.containsKey(from)) {
            edges.put(from, new HashSet<>());
        }
        edges.get(from).add(new Edge(from, to, 1));
    }

    public void run() {
        while (!unvisited.isEmpty()) {
            dfs(unvisited.pollFirst(), new LinkedHashSet<>(), new HashSet<>());
        }
    }

    private void dfs(int s, LinkedHashSet<Integer> inProcess, Set<Integer> visited) {
        if (visited.contains(s)) {
            return;
        }
        if (inProcess.contains(s)) {
            cycles.add(new ArrayList<>(inProcess));
            return;
        }
        inProcess.add(s);
        for (Edge e : edges.getOrDefault(s, Collections.emptySet())) {
            dfs(e.to, inProcess, visited);
        }
        inProcess.remove(s);
        visited.add(s);
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

