import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static final int[] dx = {
            1, 0, -1, 0
    };
    static final int[] dy = {
            0, 1, 0, -1
    };
    static final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    static {
        map.put((int) 'E', 0);
        map.put((int) 'N', 1);
        map.put((int) 'W', 2);
        map.put((int) 'S', 3);
    }

    public static void main(String[] args) {
        InputStream in = System.in;
        scanner = new Scanner(in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            boolean[][] masu = new boolean[21][21];
            int nx = 10;
            int ny = 10;
            masu[nx][ny] = true;
            for (int i = 0; i < m; i++) {
                String D = scanner.next();
                int d = (int) D.charAt(0);
                int l = scanner.nextInt();
                for (int j = 0; j < l; j++) {
                    nx += dx[map.get(d)];
                    ny += dy[map.get(d)];
                    masu[nx][ny] = true;
                }
            }
            boolean flg = false;
            for (int i = 0; i < n; i++) {
                if (!masu[x[i]][y[i]]) {
                    flg = true;
                    break;
                }
            }
            if (flg) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}