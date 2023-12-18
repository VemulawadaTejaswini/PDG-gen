import java.util.*;

class Main {
    //Floyd Warshall's Algorithm
    private static final int MAX = (int) (2e7 + 1);
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        int[][] dist = new int[V][V];

        for(int i = 0; i < V; ++i){
            Arrays.fill(dist[i], MAX);
            dist[i][i] = 0;
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();

            dist[u][v] = weight;
        }

        for(int k = 0; k < V; ++k){
            for(int i = 0; i < V; ++i){
                for(int j = 0; j < V; ++j){
                    if(dist[i][k] != MAX && dist[k][j] != MAX && dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        for(int i = 0; i < V; ++i){
            if(dist[i][i] < 0){
                System.out.println("NEGATIVE CYCLE");
                return;
            }
        }

        for(int i = 0; i < V; ++i){
            for(int j = 0; j < V; ++j){
                System.out.print(dist[i][j] == MAX ? "INF" : dist[i][j]);
                if(j != V - 1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}