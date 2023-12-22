import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        // visited[i][j]: 当該マスを既に通ったか否か
        boolean[][] visited = new boolean[h][w];
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        int[][] newboard = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                newboard[i][j] = -1;
            }
        }
        
        int now = 1;
        char nowchr = board[0][0];
        for (int i = 0; i < h; i++) {
            if (board[i][0] != nowchr) {
                now++;
                nowchr = board[i][0];
            }
            newboard[i][0] = now;
        }
        now = 1;
        nowchr = board[0][0];
        for (int i = 0; i < w; i++) {
            if (board[0][i] != nowchr) {
                now++;
                nowchr = board[0][i];
            }
            newboard[0][i] = now;
        }
        
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                int a = newboard[i-1][j];
                if (board[i][j] != board[i-1][j]) a++;
                int b = newboard[i][j-1];
                if (board[i][j] != board[i][j-1]) b++;
                newboard[i][j] = Math.min(a, b);
            }
        }
        
        int group = newboard[h-1][w-1];
        if (board[0][0] == '.') {
            System.out.println(group / 2);
        } else {
            System.out.println((group+1) / 2);
        }
    }
}