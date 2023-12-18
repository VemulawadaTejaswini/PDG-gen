import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int x1 = sc.nextInt()-1;
        int y1 = sc.nextInt()-1;
        int x2 = sc.nextInt()-1;
        int y2 = sc.nextInt()-1;
        boolean[][] g = new boolean[h][w];
        for(int i=0; i<h; i++) {
            char[] c = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                g[i][j] = c[j]=='@';
            }
        }
        long[][][] d = new long[h][w][4];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                Arrays.fill(d[i][j], Long.MAX_VALUE);
            }
        }
        d[x1][y1][0] = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        PriorityQueue<P> q = new PriorityQueue<>();
        q.offer(new P(x1, y1, 0, 0));
        while(!q.isEmpty()) {
            P p = q.poll();
            if(p.d > d[p.x][p.y][p.dir]) continue;
            long nd = p.d + (k - p.d % k) % k;
            for(int i=0; i<4; i++) {
                if(p.dir == i) continue;
                if(d[p.x][p.y][i] > nd) {
                    d[p.x][p.y][i] = nd;
                    q.offer(new P(p.x, p.y, i, nd));
                }
            }
            int nx = p.x + dx[p.dir];
            int ny = p.y + dy[p.dir];
            if(0 <= nx && nx < h && 0 <= ny && ny < w && !g[nx][ny] && d[nx][ny][p.dir]>p.d+1) {
                d[nx][ny][p.dir] = p.d+1;
                q.offer(new P(nx, ny, p.dir, p.d+1));
            }
        }
        long min = d[x2][y2][0];
        min = Math.min(min, d[x2][y2][1]);
        min = Math.min(min, d[x2][y2][2]);
        min = Math.min(min, d[x2][y2][3]);
        if(min == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println((min + k - 1) / k);
        }

    }
    static class P implements Comparable<P> {
        int x;
        int y;
        int dir;
        long d;
        P(int x, int y, int dir, long d) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.d = d;
        }

        @Override public int compareTo(P o) {
            return Long.compare(d, o.d);
        }
    }


}
