import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int x1 = sc.nextInt()-1;
        int y1 = sc.nextInt()-1;
        int x2 = sc.nextInt()-1;
        int y2 = sc.nextInt()-1;
        char[][] c = new char[H][W];
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                c[i][j] = S.charAt(j);
            }
        }

        boolean[][] visited = new boolean[H][W];
        int[][] val = new int[H][W];
        int[] first = {x1, y1, 0}; // x, y, depth
        ArrayDeque<int[]> q = new ArrayDeque<int[]>();
        q.add(first);
        int ans = -1;
        while (!q.isEmpty()) {
            int[] rem = q.remove();
            visited[rem[0]][rem[1]] = true;
            val[rem[0]][rem[1]] = rem[2];
            if (rem[0] == x2 && rem[1] == y2) {
                ans = rem[2];
                break;
            }
            for (int i=0;i<4;i++) {
                int dx_ = dx[i];
                int dy_ = dy[i];
                for (int j=1;j<=K;j++) {
                    if (!(0<=rem[0]+dx_*j && rem[0]+dx_*j<H && 0<=rem[1]+dy_*j && rem[1]+dy_*j<W)) {
                        continue;
                    }
                    if (visited[rem[0]+dx_*j][rem[1]+dy_*j]) continue;
                    if (c[rem[0]+dx_*j][rem[1]+dy_*j] == '@') {
                        break;
                    }
                    int[] add = {rem[0]+dx_*j, rem[1]+dy_*j, rem[2]+1};
                    q.add(add);
                }
            }
        }
        // System.out.println(Arrays.deepToString(visited));
        // System.out.println(Arrays.deepToString(val));
        System.out.println(ans);
    }
}