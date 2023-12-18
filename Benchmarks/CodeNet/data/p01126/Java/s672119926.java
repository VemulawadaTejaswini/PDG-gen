import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        for (;;) {
            int n = ni();
            int m = ni();
            int a = ni();
            if (n == 0) {
                break;
            }
            boolean[][][] link = new boolean[1000 + 1][n + 1][n + 1];
            for (int i = 0; i < m; ++i) {
                int h = ni();
                int p = ni();
                int q = ni();
                link[h][p][q] = true;
                link[h][q][p] = true;
            }
            for (int h = 1000; 1 <= h; --h) {
                for (int i = 1; i <= n; ++i) {
                    if (link[h][a][i]) {
                        a = i;
                        break;
                    }
                }
            }
            System.out.println(a);
        }
    }

    int ni() {
        return sc.nextInt();
    }
    static public void main(String[] args) {
        new Main().run();
    }
}