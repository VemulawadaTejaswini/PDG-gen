import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] map = new char[h + 2][w + 2];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                map[i + 1][j + 1] = s.charAt(j);
            }
        }
        int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
        int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (map[i][j] == '#') {
                    continue;
                }
                int num = 0;
                for (int k = 0; k < 8; k++) {
                    if (map[i + dy[k]][j + dx[k]] == '#') {
                        num++;
                    }
                }
                map[i][j] = (char)('0' + num);
            }
        }
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
