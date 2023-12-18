import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        boolean[] visited = new boolean[V];
        HashMap<Integer, List<int[]>> graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<int[]>());
        }

        for(int i = 0; i < E; ++i){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int weight = scanner.nextInt();

            graph.get(x).add(new int[] {y, weight});
            graph.get(y).add(new int[] {x, weight});
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        queue.offer(new int[]{0, 0});
        long minCost = 0;

        while(!queue.isEmpty()){
            int[] edge = queue.poll();
            if(visited[edge[0]]){
                continue;
            }

            visited[edge[0]] = true;
            minCost += edge[1];

            for(int[] adj : graph.get(edge[0])){
                if(!visited[adj[0]]){
                    queue.offer(adj);
                }
            }
        }

        System.out.println(minCost);
    }
}