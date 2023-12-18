import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // 障害物のマスをキューに入れる
        char[][] board = new char[h][w];
        Queue<int[]> que = new ArrayDeque<int[]>();
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
                if (board[i][j] == '#') {
                    que.add(new int[]{i, j, 0});
                }
            }
        }
        
        // visited[i][j]: 当該マスを既に通ったか否か
        boolean[][] visited = new boolean[h][w];
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        // max = 障害物からの最短距離の最大値
        int max = 0;
        // 障害物から上下左右に1ずつ配り障害物にする
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int depth = cur[2];
            
            max = Math.max(max, depth);
            
            // 上下左右のマスに深さ+1を配ってキューに入れる
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                int ndepth = depth + 1;
                
                if (0 <= nx && nx < h && 0 <= ny && ny < w &&
                    board[nx][ny] == '.' && !visited[nx][ny]) {
                    que.add(new int[]{nx, ny, ndepth});
                    visited[nx][ny] = true;
                }
            }
        }
        System.out.println(max);
    }
}
