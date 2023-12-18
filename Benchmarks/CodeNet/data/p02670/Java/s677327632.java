import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] P = new int[N*N];
        dp = new int[N][N];
        removed = new int[N][N];
        diff = new ArrayList<int[]>();
        int[] add_1 = {1, 0};int[] add_2 = {-1, 0};int[] add_3 = {0, 1};int[] add_4 = {0, -1};
        diff.add(add_1);diff.add(add_2);diff.add(add_3);diff.add(add_4);
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                dp[i][j] = INF;
            }
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                dp[i][j] = Math.min(dp[i][j], Math.min(i, j)+1);
                dp[i][j] = Math.min(dp[i][j], Math.min(N-1-i, N-1-j)+1);
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        int ans = 0;
        for (int i=0;i<N*N;i++) {
            P[i] = sc.nextInt()-1;
            int y = P[i]/N;
            int x = P[i]%N;
            removed[y][x] = 1;
            dp[y][x]--;
            l_to_r(y, 0);
            r_to_l(y, N-1);
            u_to_d(0, x);
            d_to_u(N-1, x);
            l_to_r(y, 0);
            r_to_l(y, N-1);
            u_to_d(0, x);
            d_to_u(N-1, x);
            ans += dp[y][x];
        }
        // System.out.println(Arrays.deepToString(dp));
        System.out.println(ans);
        // map = new HashMap<Integer, HashMap<Integer, Point>>();
    }


    static int INF = 1_000_000_000;
    static HashMap<Integer, HashMap<Integer, Point>> map;
    static int[][] dp;
    static int[][] removed;
    static ArrayList<int[]> diff;
    static int N;

    static void l_to_r(int y, int x) {
        for (int i=0;i<4;i++) {
            if (0 <= y+diff.get(i)[0] && y+diff.get(i)[0] < N && 0 <= x+diff.get(i)[1] && x+diff.get(i)[1] < N) {
                dp[y][x] = Math.min(dp[y][x], dp[y+diff.get(i)[0]][x+diff.get(i)[1]]+1-removed[y][x]);
            }
        }
        if (x<N-1) {
            l_to_r(y, x+1);
        }
    }

    static void r_to_l(int y, int x) {
        for (int i=0;i<4;i++) {
            if (0 <= y+diff.get(i)[0] && y+diff.get(i)[0] < N && 0 <= x+diff.get(i)[1] && x+diff.get(i)[1] < N) {
                dp[y][x] = Math.min(dp[y][x], dp[y+diff.get(i)[0]][x+diff.get(i)[1]]+1-removed[y][x]);
            }
        }
        if (x>0) {
            r_to_l(y, x-1);
        }
    }

    static void u_to_d(int y, int x) {
        for (int i=0;i<4;i++) {
            if (0 <= y+diff.get(i)[0] && y+diff.get(i)[0] < N && 0 <= x+diff.get(i)[1] && x+diff.get(i)[1] < N) {
                dp[y][x] = Math.min(dp[y][x], dp[y+diff.get(i)[0]][x+diff.get(i)[1]]+1-removed[y][x]);
            }
        }
        if (y<N-1) {
            u_to_d(y+1, x);
        }
    }

    static void d_to_u(int y, int x) {
        for (int i=0;i<4;i++) {
            if (0 <= y+diff.get(i)[0] && y+diff.get(i)[0] < N && 0 <= x+diff.get(i)[1] && x+diff.get(i)[1] < N) {
                dp[y][x] = Math.min(dp[y][x], dp[y+diff.get(i)[0]][x+diff.get(i)[1]]+1-removed[y][x]);
            }
        }
        if (y>1) {
            d_to_u(y-1, x);
        }
    }

    static class Point {
        int x;
        int y;
        int up;
        int down;
        int left;
        int right;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            up = y + 1;
            down = y - 1;
            left = x - 1;
            right = x + 1;
        }

        public int getUp() {
            if (map.containsKey(x) && map.get(x).containsKey(up)) {
                up = map.get(x).get(up).getUp();
            }
            return up;
        }

        public int getDown() {
            if (map.containsKey(x) && map.get(x).containsKey(down)) {
                down = map.get(x).get(down).getDown();
            }
            return down;
        }

        public int getLeft() {
            if (map.containsKey(left) && map.get(left).containsKey(y)) {
                left = map.get(left).get(y).getLeft();
            }
            return left;
        }

        public int getRight() {
            if (map.containsKey(right) && map.get(right).containsKey(y)) {
                right = map.get(right).get(y).getRight();
            }
            return right;
        }
    }
}