import java.util.*;

public class Main {

    static int INF = 1_000_000_000;
    static int[][] removed;
    static int N;
    static int[][] H;
    static ArrayList<int[]> diff;

    public static void dfs(int y, int x) {
        int val = H[y][x] + 1-removed[y][x];
        for (int i=0;i<4;i++) {
            if (0 <= y+diff.get(i)[0] && y+diff.get(i)[0] < N && 0 <= x+diff.get(i)[1] && x+diff.get(i)[1] < N) {
                int tmp = H[y+diff.get(i)[0]][x+diff.get(i)[1]];
                if (tmp > val) {
                    H[y+diff.get(i)[0]][x+diff.get(i)[1]] = val;
                    dfs(y+diff.get(i)[0], x+diff.get(i)[1]);
                }
            }
        }
    }

    public static void init_diff() {
        diff = new ArrayList<int[]>();
        int[] add_1 = {1, 0};int[] add_2 = {-1, 0};int[] add_3 = {0, 1};int[] add_4 = {0, -1};
        diff.add(add_1);diff.add(add_2);diff.add(add_3);diff.add(add_4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = new int[N][N];
        removed = new int[N][N];
        init_diff();
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                H[i][j] = INF;
            }
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                H[i][j] = Math.min(H[i][j], Math.min(i, j)+1);
                H[i][j] = Math.min(H[i][j], Math.min(N-1-i, N-1-j)+1);
            }
        }
        int ans = 0;
        for (int i=0;i<N*N;i++) {
            int P = Integer.parseInt(sc.next())-1;
            int y = P/N;
            int x = P%N;
            ans += H[y][x]-1;
            removed[y][x] = 1;
            dfs(y, x);
        }
        System.out.println(ans);
    }
}