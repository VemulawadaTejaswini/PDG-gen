import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] array = new char[h][];
        for (int i = 0; i < h; i++) {
            array[i] = sc.next().toCharArray();
        }

        int[][] dp = new int[h][w];
        if (array[0][0] == '#') {
            dp[0][0]++;
        }

        int[] dx = {1, 0};
        int[] dy = {0, 1};

        boolean[][] visited = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < 2; k++) {
                    int x = j + dx[k];
                    int y = i + dy[k];
                    if (x >= w || y >= h) {
                        continue;
                    }
                    int add = 0;
                    if (array[y][x] == '#' && array[i][j] == '.') {
                        add = 1;
                    }
                    if (!visited[y][x] && dp[y][x] == 0) {
                        dp[y][x] =  dp[i][j] + add;
                    } else {
                        dp[y][x] = Math.min(dp[y][x], dp[i][j] + add);
                    }
                    visited[y][x] = true;
                }
            }
        }

        System.out.println(dp[h - 1][w - 1]);
    }
}