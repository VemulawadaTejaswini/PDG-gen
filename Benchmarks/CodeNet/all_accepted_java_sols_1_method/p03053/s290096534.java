import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int[] dx = {1, 0, -1, 0};
        final int[] dy = {0, 1, 0, -1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int h = Integer.parseInt(in[0]);
        int w = Integer.parseInt(in[1]);
        
        int ans = 0;
        int[][] dist = new int[h][w];
        Queue<Point> que = new ArrayDeque<>();
        for(int i = 0; i < h; i++) {
            char[] in2 = br.readLine().toCharArray();
            for(int j = 0; j < w; j++) {
                if(in2[j] == '#') {
                    que.add(new Point(i, j));
                    dist[i][j] = 0;
                }else {
                    dist[i][j] = -1;
                }
            }
        }

        while(!que.isEmpty()) {
            Point p = que.poll();
            int d = dist[p.x][p.y];

            for(int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(0 <= nx && nx < h && 0 <= ny && ny < w && dist[nx][ny] == -1) {
                    ans = Math.max(ans, d + 1);
                    dist[nx][ny] = d + 1;
                    que.add(new Point(nx, ny));
                }
            }
        }

        System.out.println(ans);

        br.close();
    }
}