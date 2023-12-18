import java.util.*;

class Main{
    private static HashMap<Integer, List<Integer>> graph;
    private static int time;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        List<int[]> bridges = new LinkedList<>();

        Arrays.fill(parent, -1);
        time = 0;

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                BridgeUtil(i, parent, disc, low, visited, bridges);
            }
        }

        Collections.sort(bridges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int[] bridge : bridges){
            System.out.println(Math.min(bridge[0], bridge[1]) + " " + Math.max(bridge[0], bridge[1]));
        }
    }

    private static void BridgeUtil(int u, int[] parent, int[] disc, int[] low, boolean[] visited, List<int[]> bridges){
        if(visited[u]){
            return;
        }

        visited[u] = true;
        disc[u] = low[u] = ++time;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                parent[v] = u;
                BridgeUtil(v, parent, disc, low, visited, bridges);

                low[u] = Math.min(low[u], low[v]);

                if(low[v] > disc[u]){
                    bridges.add(new int[] {u, v});
                }
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

}