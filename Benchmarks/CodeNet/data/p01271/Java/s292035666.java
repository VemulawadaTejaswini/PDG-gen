import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static final int[] DX = {0, 1, 0, -1}, DY = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int w = in.nextInt(), h = in.nextInt();
        while (w > 0) {
            boolean[][][][] dist = new boolean[h][w][h][w];

            int lsx = -1, lsy = -1, rsx = -1, rsy = -1;
            int lgx = -1, lgy = -1, rgx = -1, rgy = -1;
            String[] lb = new String[h], rb = new String[h];
            for (int i = 0; i < h; i++) {
                lb[i] = in.next();
                rb[i] = new StringBuilder(in.next()).reverse().toString();
                for (int j = 0; j < w; j++) {
                    if (lb[i].charAt(j) == 'L') {
                        lsx = j;
                        lsy = i;
                    } else if (lb[i].charAt(j) == '%') {
                        lgx = j;
                        lgy = i;
                    }
                    if (rb[i].charAt(j) == 'R') {
                        rsx = j;
                        rsy = i;
                    } else if (rb[i].charAt(j) == '%') {
                        rgx = j;
                        rgy = i;
                    }
                }
            }
            if (lsx == -1 || rsx == -1) throw new RuntimeException();

            Queue<Node> q = new ArrayDeque<>();
            dist[lsy][lsx][rsy][rsx] = true;
            q.offer(new Node(lsx, lsy, rsx, rsy));
            while (!q.isEmpty()) {
                Node node = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nlx = node.lx + DX[i], nly = node.ly + DY[i];
                    int nrx = node.rx + DX[i], nry = node.ry + DY[i];
                    if (nlx < 0 || nly < 0 || nlx >= w || nly >= h || lb[nly].charAt(nlx) == '#') {
                        nlx = node.lx;
                        nly = node.ly;
                    }
                    if (nrx < 0 || nry < 0 || nrx >= w || nry >= h || rb[nry].charAt(nrx) == '#') {
                        nrx = node.rx;
                        nry = node.ry;
                    }
                    if ((nlx == lgx && nly == lgy) != (nrx == rgx && nry == rgy)) continue;
                    if (dist[nly][nlx][nry][nrx]) continue;
                    dist[nly][nlx][nry][nrx] = true;
                    q.offer(new Node(nlx, nly, nrx, nry));
                }
            }

            out.println(dist[lgy][lgx][rgy][rgx] ? "Yes" : "No");
            w = in.nextInt();
            h = in.nextInt();
        }

        out.flush();
    }

    static class Node {
        int lx, ly;
        int rx, ry;

        Node(int lx, int ly, int rx, int ry) {
            this.lx = lx;
            this.ly = ly;
            this.rx = rx;
            this.ry = ry;
        }
    }
}

