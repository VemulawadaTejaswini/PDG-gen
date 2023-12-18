
import java.util.*;

public class Main {
    static int[][] DIR = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static int bfs(int n, int pos, int[][] grid) {
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
        q.add(new int[]{pos, 0});
        visited.add(pos);
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int i = curr[0] / n, j = curr[0] % n;
            for (int[] dir : DIR) {
                int ni = i + dir[0], nj = j + dir[1];
                if (visited.contains(ni * n + nj)) continue;
                if (ni < 0 || ni >= n || nj < 0 || nj >= n) return curr[1];
                q.add(new int[]{ni * n + nj, grid[ni][nj] == 0 ? curr[1] : curr[1] + 1});
                visited.add(ni * n + nj);
            }
        }
        return -1;
    }


    static void solve(int N, int[] P) {
        int[][] grid = new int[N][N];
        for (int[] g : grid) Arrays.fill(g, 1);
        int ret = 0;
        for (int p : P) {
            ret += bfs(N, p, grid);
            grid[p/N][p%N] = 0;
        }
        System.out.println(ret);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] P = new int[N*N];
        for (int i=0;i<P.length;i++) P[i] = in.nextInt() - 1;
        solve(N, P);
    }
}
