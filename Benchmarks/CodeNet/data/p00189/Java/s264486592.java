import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int INF = 1 << 25;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            // ????????°
            int vn = 0;
            int[][] c = new int[10][10];
            for (int i = 0; i < 10; i++) {
                Arrays.fill(c[i], INF);
                c[i][i] = 0;
            }
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int d = sc.nextInt();
                c[a][b] = c[b][a] = Math.min(c[a][b], d);
                vn = Math.max(vn, Math.max(a, b));
            }
            vn++;
            for (int i = 0; i < vn; i++) {
                for (int j = 0; j < vn; j++) {
                    for (int k = 0; k < vn; k++) {
                        c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
                    }
                }
            }
            int k = 0;
            int w = INF;
            for (int i = 0; i < vn; i++) {
                int s = 0;
                for (int j = 0; j < vn; j++) {
                    s += c[i][j];
                }
                if (s < w) {
                    k = i;
                    w = s;
                }
            }
            System.out.println(k + " " + w);
        }
    }
}