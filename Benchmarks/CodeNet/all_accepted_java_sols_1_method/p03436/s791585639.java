import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        int[][] flag = new int[h][w];
        int c = 0;
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            map[i] = s.toCharArray();
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.') {
                    c++;
                }
            }
            Arrays.fill(flag[i], -1);
        }
        final int[] dx = {-1, 1, 0, 0};
        final int[] dy = {0, 0, -1, 1};

        flag[0][0] = 0;
        Queue<Integer[]> q = new ArrayDeque<Integer[]>();
        q.add(new Integer[]{0, 0});
        while(!q.isEmpty()){
            Integer[] pos = q.poll();
            if (pos[0] == h - 1 && pos[1] == w - 1) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int yp = pos[0] + dy[i];
                int xp = pos[1] + dx[i];
                if (0 <= yp && yp < h && 0 <= xp && xp < w && map[yp][xp] == '.' && flag[yp][xp] == -1){
                    flag[yp][xp] = flag[pos[0]][pos[1]] + 1;
                    q.add(new Integer[]{yp, xp});
                }
            }
        }
        if (flag[h - 1][w - 1] == -1) {
            System.out.println("-1");
        } else {
            System.out.println(c - flag[h - 1][w - 1] - 1);
        }
    }
}
