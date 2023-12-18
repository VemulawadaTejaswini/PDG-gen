import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static final int[] dr = { -1, 0, 0, 1, };
    private static final int[] dc = { 0, -1, 1, 0, };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int CH = sc.nextInt() - 1;
            int CW = sc.nextInt() - 1;
            int DH = sc.nextInt() - 1;
            int DW = sc.nextInt() - 1;
            boolean[][] S = new boolean[H][W];
            for (int h = 0; h < H; h++) {
                String line = sc.next();
                for (int w = 0; w < W; w++) {
                    S[h][w] = line.charAt(w) == '#';
                }
            }

            int n = search(H, W, CH, CW, DH, DW, S);

            System.out.println(n);
        }
    }

    private static int search(int h, int w, int cH, int cW, int dH, int dW, boolean[][] isWall) {
        Comparator<Node> comparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.n < o2.n) {
                    return -1;
                }
                if (o1.n > o2.n) {
                    return 1;
                }
                return 0;
            }
        };
        PriorityQueue<Node> queue = new PriorityQueue<>(comparator);
        int[][] used = new int[h][w];
        for (int r = 0; r < h; r++) {
            Arrays.fill(used[r], (int) 1e9);
        }
        {
            used[cH][cW] = 0;
            queue.add(new Node(cH, cW, 0));
        }
        int min = (int) 1e9;
        for (; !queue.isEmpty();) {
            Node node = queue.poll();
//            Utils.debug(node.r, node.c, node.n);

            if (node.n > used[node.r][node.c]) {
                continue;
            }

            if (node.r == dH && node.c == dW) {
                if (node.n < min) {
                    min = node.n;
                }
                continue;
            }

            for (int d = 0; d < dr.length; d++) {
                int nr = node.r + dr[d];
                int nc = node.c + dc[d];
                if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
                    continue;
                }
                if (isWall[nr][nc]) {
                    continue;
                }
                int nn = node.n;
                if (nn >= used[nr][nc]) {
                    continue;
                }
                used[nr][nc] = nn;
                queue.add(new Node(nr, nc, nn));
            }
            for (int dr2 = -2; dr2 <= 2; dr2++) {
                for (int dc2 = -2; dc2 <= 2; dc2++) {
                    int nr = node.r + dr2;
                    int nc = node.c + dc2;
                    if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
                        continue;
                    }
                    if (isWall[nr][nc]) {
                        continue;
                    }
                    int nn = node.n + 1;
                    if (nn >= used[nr][nc]) {
                        continue;
                    }
                    used[nr][nc] = nn;
                    queue.add(new Node(nr, nc, nn));
                }
            }
        }

        return min >= (int) 1e9 ? -1 : min;
    }
}

class Node {
    int r;
    int c;
    int n;

    public Node(int r, int c, int n) {
        super();
        this.r = r;
        this.c = c;
        this.n = n;
    }

}