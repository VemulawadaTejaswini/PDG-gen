import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String[] line1 = br.readLine().split(" ");
        int V = Integer.valueOf(line1[0]);
        int E = Integer.valueOf(line1[1]);
        int r = Integer.valueOf(line1[2]);
        ArrayList<Edge>[] list = new ArrayList<Edge>[V];
        for (int i = 0; i < V; i++) {
            list[i] = new ArrayList<Edge>();
        }
 
        for (int i = 0; i < E; i++) {
            String[] line = br.readLine().split(" ");
            int s = Integer.valueOf(line[0]);
            int t = Integer.valueOf(line[1]);
            int d = Integer.valueOf(line[2]);
            Edge edge = new Edge(t, d);
            list[s].add(edge);
        }
 
        int[] dist = new int[V];
        Arrays.fill(dist, 20000000);
        dist[r] = 0;
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[j] != 20000000) {
                    for (int k = 0; k < list[j].size(); k++) {
                        Edge edge = (Edge) (list[j].get(k));
                        dist[edge.to] = Math.min(dist[edge.to], dist[j] + edge.dist);
                    }
                }
 
            }
        }
        //最後
        for (int j = 0; j < V; j++) {
            if (dist[j] != 20000000) {
                for (int k = 0; k < list[j].size(); k++) {
                    Edge edge = (Edge) (list[j].get(k));
                    if (dist[edge.to] > dist[j] + edge.dist) {
                        System.out.println("NEGATIVE CYCLE");
                        return;
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == 20000000) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
 
}
 
class Edge {
 
    int to, dist;
 
    public Edge(int to, int dist) {
        this.to = to;
        this.dist = dist;
    }
}