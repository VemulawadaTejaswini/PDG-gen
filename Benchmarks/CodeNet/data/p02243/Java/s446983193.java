import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    
    static int n;
    static Map<Integer, Map<Integer, Integer>> graph;
    static int[] d;
    static final int INF = Integer.MAX_VALUE / 10;
    static final int WHITE = 0;
    static final int GRAY = 1;
    static final int BLACK = 2;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        graph = new HashMap<>();
        for(int i = 0; i < n; i++){
            int u = Integer.parseInt(sc.next());
            graph.put(u, new HashMap<>());
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                int v = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());
                graph.get(u).put(v, c);
            }
        }
        
        dijkstra(0);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(i).append(" ").append(d[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
    
    static void dijkstra(int s){
        
        int[] color = new int[n];
        d = new int[n];
        Arrays.fill(d, INF);
        d[s] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(s, 0));
        
        while(!pq.isEmpty()){
            Node u = pq.poll();
            
            color[u.id] = BLACK;
            
            if(d[u.id] < u.dist) continue;
            
            for (Integer v : graph.get(u.id).keySet()) {
                if(color[v] != BLACK){
                    if(d[u.id] + graph.get(u.id).get(v) < d[v]){
                        d[v] = d[u.id] + graph.get(u.id).get(v);
                        color[v] = GRAY;
                        pq.add(new Node(v, d[v]));
                    }
                }
            }
        }
    }
    
    static class Node implements Comparable<Node>{
        int id;
        int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node n) {
            return this.dist - n.dist;
        }
    }
}
