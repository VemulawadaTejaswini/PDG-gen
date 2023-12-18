import java.util.*;

public class Main {
    
    static int n;
    static boolean[][] s;
    static int[] vis;
    static int[] d;
    static int[] f;
    static int time = 1;
    
    static void dfs(int x) {
        vis[x] = 1;
        d[x] = time++;
        for(int i=1; i<=n; i++) {
            if(vis[i] != 1 && s[x][i]) {
                dfs(i);
            }
        }
        f[x] = time++;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            s = new boolean[n+1][n+1];
            vis = new int[n+1];
            d = new int[n+1];
            f = new int[n+1];
            for(int i=0; i<n; i++) {
                int u = sc.nextInt();
                int k = sc.nextInt();
                for(int j=0; j<k; j++) {
                    int v = sc.nextInt();
                    s[u][v] = true;
                }
            }
            for(int i=1; i<=n; i++) {
                if(vis[i] == 0) {
                    dfs(i);
                }
            }
            for(int i=1; i<=n; i++) {
                System.out.printf("%d %d %d\n", i, d[i], f[i]);
            }
        }
    }
}

