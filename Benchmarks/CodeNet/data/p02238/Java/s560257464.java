import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    private static int[] d, f;
    private static int[][] g;
    private static int t = 0;
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        d = new int[n+1];
        f = new int[n+1];
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
        dfs(1);
        final StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append(i).append(' ').append(d[i]).append(' ').append(f[i]).append('\n');
        }
        System.out.print(sb);
    }
    private static void dfs(int e){
        if(d[e]!=0) return;
        d[e] = ++t;
        for(int i = 1, n = g[e][0]; i<=n; i++)
            dfs(g[e][i]);
        f[e] = ++t;
    }
}