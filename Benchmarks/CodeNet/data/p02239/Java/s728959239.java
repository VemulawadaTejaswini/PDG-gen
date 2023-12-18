import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main{
    private static int[] d;
    private static int[][] g;
    private static int t = 0;
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        d = new int[n+1];
        for(int i = 0; i<=n; i++)
            d[i] = -1;
        g = new int[n+1][n+1];
        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int u = Integer.parseInt(st.nextToken());
            final int k = Integer.parseInt(st.nextToken());
            g[u][0] = k;
            for(int j = 1; j<=k; j++){
                g[u][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(1);
        final StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append(i).append(' ').append(d[i]).append('\n');
        }
        System.out.print(sb);
    }
    private static void bfs(int e){
        final Deque<state> q = new ArrayDeque<state>();
        q.add(new state(e, 0));
        while(!q.isEmpty()){
            final state s = q.remove();
            final int id = s.id;
            int t = s.d;
            if(d[id]!=-1) continue;
            d[id] = t++;
            for(int i = 1, n = g[s.id][0]; i<=n; i++)
                q.add(new state(g[id][i], t));
        }
    }
}
class state{
    final int id;
    final int d;
    state(int id, int d){
        this.id = id;
        this.d = d;
    }
}