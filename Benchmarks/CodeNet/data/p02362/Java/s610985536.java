import java.util.*;

class Main {
    //Bellman-Ford's Algorithm
    private static final int MAX = 99999;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int src = scanner.nextInt();

        int[] dist = new int[V];
        int[][] edges = new int[E][3];

        for(int i = 0; i < V; ++i){
            dist[i] = MAX;
        }
        dist[src] = 0;

        for(int i = 0; i < E; ++i){
            int[] edge = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            edges[i] = edge;
        }

        for(int i = 1; i < V; ++i){
            for(int j = 0; j < E; ++j){
                int[] edge = edges[j];
                if(dist[edge[1]] > dist[edge[0]] + edge[2]){
                    dist[edge[1]] = dist[edge[0]] + edge[2];
                }
            }
        }

        boolean containNegativeCycle = false;
        for(int j = 0; j < E; ++j){
            int[] edge = edges[j];
            if(dist[edge[1]] > dist[edge[0]] + edge[2]){
                containNegativeCycle = true;
                break;
            }
        }

        if(containNegativeCycle){
            System.out.println("NEGATIVE CYCLE");
            return;
        }

        for(int i = 0; i < V; ++i){
            System.out.println(dist[i] == MAX ? "INF" : dist[i]);
        }
    }
}