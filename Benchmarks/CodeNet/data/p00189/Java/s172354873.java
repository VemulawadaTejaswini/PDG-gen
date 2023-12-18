
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
 
public class Main {
 
        int INF = 1 << 28;
        int MAX = 10;
        int[][] map;
        int n, m;
        
        void run() {
                Scanner sc = new Scanner(System.in);
                for(;;) {
                        n = sc.nextInt();
                        if( n == 0) break;
                        
                        map = new int[MAX][MAX];
                        for(int[] a: map) fill(a, INF);
                        m = 0;
                        for(int i=0;i<n;i++) {
                                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                                m = max(m, max(a, b)+1);
                                map[a][b] = map[b][a] = min(c, map[a][b]);
                        }
 
                        int p=-1, min = INF;
                        for(int i=0;i<m;i++) {
                                int v = dijkstra(i);
                                if( min > v) {
                                        p = i;
                                        min = v;
                                }
                        }
                        
                        System.out.println(p + " " + min);
                }
        }
        
        int dijkstra(int s) {
                int[] d = new int[m];
                boolean[] visited = new boolean[m];
                fill(d, INF);
                d[s] = 0;
                
                for(;;) {
                        int v = -1;
                        for(int u=0;u<m;u++) if(!visited[u]) {
                                if(v == -1 || d[u] < d[v]) v = u;
                        }
                        
                        if( v == -1 ) break;
                        visited[v] = true;
                        
                        for(int u=0;u<m;u++) {
                                d[u] = min(d[u], d[v]+map[v][u]);
                        }
                }
                int ret = 0;
                for(int v: d) ret += v;
                return ret;
        }
 
        public static void main(String[] args) {
                new Main().run();
        }
 
        void debug(Object... os) {
                System.err.println(Arrays.deepToString(os));
        }
}