import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static int n;
    static int[][] m;
    static int[] d;
    static final int INF = Integer.MAX_VALUE;
    static final int WHITE = 0;
    static final int GRAY = 1;
    static final int BLACK = 2;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        m = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(m[i], INF);
        }
        for(int i = 0; i < n; i++){
            int u = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                int v = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());
                m[u][v] = c;
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
        int[] p = new int[n];
        d[s] = 0;
        p[s] = -1;
        
        while(true){
            int minCost = INF;
            int u = 0;
            for(int i = 0; i < n; i++){
                if(color[i] != BLACK && d[i] < minCost){
                    minCost = d[i];
                    u = i;
                }
            }
            
            if(minCost == INF) break;
            
            color[u] = BLACK;
            
            for(int v = 0; v < n; v++){
                if(color[v] != BLACK && m[u][v] != INF){
                    if(d[u] + m[u][v] < d[v]){
                        d[v] = d[u] + m[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
    }
}
