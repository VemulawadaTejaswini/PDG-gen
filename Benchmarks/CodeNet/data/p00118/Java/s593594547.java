import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static final char DONE_FLAG = 'd';
    static final int[] dx = new int[]{-1, 0, 1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};
    static int maxX;
    static int maxY;

    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[] maxXY = getXY(r);
        maxX = maxXY[0];
        maxY = maxXY[1];
        char[][] farm = getFarmArray(r);
        r.readLine(); // 0 0 ?????????????????????

        int answer = 0;
        for (int i = 0; i < maxXY[0]; i++) {
            for (int j = 0; j < maxXY[1]; j++) {
                char target = farm[i][j];
                if (target == DONE_FLAG) { continue; }

                depthFirstSearch(target, farm, i, j);
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void depthFirstSearch(char target, char[][] farm, int x, int y) throws Exception {
        // ????´¢??????????????°????????????
        if (farm[x][y] == DONE_FLAG) {
            throw new Exception("Invalid Input!");
        }
        farm[x][y] = DONE_FLAG;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            if (nx < 0 || nx >= maxX) { continue; } // ??????????????´??????????´¢?????????
            int ny = y + dy[k];
            if (ny < 0 || ny >= maxY) { continue; } // ??????????????´??????????´¢?????????

            // ???????¨??????????????????????????????????????????????
            if (target != DONE_FLAG && farm[nx][ny] == target) {
                depthFirstSearch(target, farm, nx, ny);
            }
        }
    }

    private static char[][] getFarmArray(BufferedReader r) throws IOException {
        char[][] farm = new char[maxX][maxY];
        for (int i = 0; i < maxX; i++) {
            String line = r.readLine();
            for (int j = 0; j < maxY; j++) {
                farm[i][j] = line.charAt(j);
            }
        }
        return farm;
    }

    private static int[] getXY(BufferedReader r) throws IOException {
        String[] xyStr = r.readLine().split(" ");
        int[] xy = new int[xyStr.length];
        for (int i = 0; i < xyStr.length; i++) {
            xy[i] = Integer.parseInt(xyStr[i]);
        }
        return xy;
    }
}