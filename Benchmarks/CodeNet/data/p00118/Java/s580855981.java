import java.util.*;

public class AOJ0118 {
    private static char[][] room;
    private static boolean[][] roomVisited;
    private static int count;
    private static int[][] directions = {{1,0}, {0,1}, {0,-1}, {-1,0}};


    public static void main(String[] args) {
        test();
        Scanner sc = new Scanner(System.in);
        int w, h;
        String lineOfInput;

        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) break;

            room = new char[h][w];
            roomVisited = new boolean[h][w];
            for (boolean[] row: roomVisited)
                Arrays.fill(row, false);
            count = 0;

            sc.nextLine(); // for empty line
            for (int i = 0; i < h; i++) {
                lineOfInput = sc.nextLine();
                for (int j = 0; j < w; j++) {
                    room[i][j] = lineOfInput.charAt(j);
                }
            }

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (!roomVisited[y][x]) {
                        roomVisited[y][x] = true;
                        dfs(x, y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        int nx, ny;
        for (int[] direction: directions) {
            nx = x + direction[0];
            ny = y + direction[1];
            if (nx >= 0 && ny >= 0 && nx < room[0].length && ny < room.length) {
                if (!roomVisited[ny][nx] && room[y][x] == room[ny][nx]) {
                    roomVisited[ny][nx] = true;
                    dfs(nx, ny);
                }
            }
        }
    }

    private static int calc(int x) {

        return x;
    }

    private static void test() {
        assert calc(0) == 0;
    }
}