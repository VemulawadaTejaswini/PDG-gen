import java.util.*;

public class Main {
    public static int[] dx = new int[]{-1, 0, 0, 1};
    public static int[] dy = new int[]{0, -1, 1, 0};

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean in(int nx, int ny, int n, int m) {
        return 1 <= nx && nx <= n && 1 <= ny && ny <= m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sc = scan.nextInt();
        int sd = scan.nextInt();
        int ec = scan.nextInt();
        int ed = scan.nextInt();
        int[][] a = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String st = scan.next();
            for (int j = 1; j <= m; j++) {
                char ch = st.charAt(j - 1);
                if (ch == '.') a[i][j] = 0;
                else a[i][j] = 1;
            }
        }
        int[][] vis = new int[n + 1][m + 1];
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) Arrays.fill(dp[i], -1);
        vis[sc][sd] = 1;
        dp[sc][sd] = 0;
        Deque<Node> Q = new ArrayDeque();
        Q.offer(new Node(sc, sd));
        while (!Q.isEmpty()) {
            Deque<Node> nQ = new ArrayDeque();
            while (!Q.isEmpty()) {
                Node cur = Q.poll();
                nQ.offer(cur);
                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if (in(nx, ny, n, m) && vis[nx][ny] == 0 && a[nx][ny] == 0) {
                        vis[nx][ny] = 1;
                        dp[nx][ny] = dp[cur.x][cur.y];
                        Q.offer(new Node(nx, ny));
                    }
                }
            }
            Q = nQ;
            int size = Q.size();
            for (int k = 1; k <= size; k++) {
                Node cur = Q.poll();
                for (int i = cur.x - 2; i <= cur.x + 2; i++) {
                    for (int j = cur.y - 2; j <= cur.y + 2; j++) {
                        if (in(i, j, n, m) && vis[i][j] == 0 && a[i][j] == 0) {
                            vis[i][j] = 1;
                            dp[i][j] = dp[cur.x][cur.y] + 1;
                            Q.offer(new Node(i, j));
                        }
                    }
                }
            }
        }
        System.out.println(dp[ec][ed]);
    }
}
