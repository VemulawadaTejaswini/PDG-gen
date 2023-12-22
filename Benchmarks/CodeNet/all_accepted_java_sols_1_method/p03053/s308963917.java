import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] grid = new int[h][w];
        List<int[]> que = new LinkedList<>(), next = new LinkedList<>();
        for (int i = 0 ; i < h ; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0 ; j < w ; j++) {
                if (s[j] == '#') {
                    grid[i][j] = 1;
                    que.add(new int[] {i, j});
                }
            }
        }
        int step = 0;
        int[] dr = {1,0,-1,0};
        int[] dc = {0,1,0,-1};
        while (que.size() > 0) {
            for (int[] x : que) {
                for (int i = 0 ; i < 4 ; i++) {
                    int r = x[0] + dr[i];
                    int c = x[1] + dc[i];
                    if (r >= 0 && r < h && c >= 0 && c < w && grid[r][c] == 0) {
                        next.add(new int[] {r,c});
                        grid[r][c] = 1;
                    }
                }
            }
            step++;
            que = next;
            next = new LinkedList<>();
        }
        System.out.println(step - 1);

    }

}