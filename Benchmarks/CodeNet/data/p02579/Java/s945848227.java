
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int h = sc.nextInt();
        int w = sc.nextInt();

        Integer[] c = new Integer[]{sc.nextInt() - 1, sc.nextInt() - 1, 0};

        int dh = sc.nextInt() - 1;
        int dw = sc.nextInt() - 1;

        char[][] field = new char[h][w];

        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
        }

        boolean[][] visited = new boolean[h][w];
        Deque<Integer[]> q = new ArrayDeque<>();
        q.add(c);
        int ans = -1;
        while (!q.isEmpty()) {
            Integer[] cur = q.poll();
            if (visited[cur[0]][cur[1]]) {
                continue;
            }
            visited[cur[0]][cur[1]] = true;
            if (cur[0] == dh && cur[1] == dw) {
                ans = cur[2];
                break;
            }
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    int x = cur[0] + i;
                    int y = cur[1] + j;
                    int cost = cur[2];
                    if (x >= 0 && y >= 0 && x < h && y < w && field[x][y] == '.' && !visited[x][y]) {
                        if (Math.abs(i + j) == 1 && (i == 0 || j == 0)) {
                            q.addFirst(new Integer[]{x, y, cost});
                        } else {
                            q.addLast(new Integer[]{x, y, cost + 1});
                        }
                    }
                }
            }
        }
        System.out.println(ans);


        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
