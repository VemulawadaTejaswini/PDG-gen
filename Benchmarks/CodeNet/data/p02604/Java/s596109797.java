import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Group[] groups = new Group[N];
        for (int i = 0; i < N; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            long P = scan.nextLong();
            groups[i] = new Group(X, Y, P);
        }
        int limit = pow(2, N);
        long[][] distX = new long[limit][N];
        long[][] distY = new long[limit][N];
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < N; j++) {
                distX[i][j] = Math.abs(groups[j].x);
                distY[i][j] = Math.abs(groups[j].y);
                for (int k = 0; k < N; k++) {
                    if (((i >> k) & 1) == 1) {
                        distX[i][j] = Math.min(distX[i][j], Math.abs(groups[j].x - groups[k].x));
                        distY[i][j] = Math.min(distY[i][j], Math.abs(groups[j].y - groups[k].y));
                    }
                }
            }
        }
        long[] ans = new long[N+1];
        Arrays.fill(ans, Long.MAX_VALUE);
        limit = pow(3, N);
        for (int i = 0; i < limit; i++) {
            int posX = 0;
            int posY = 0;
            int t = i;
            int c = 1;
            int count = 0;
            while (0 < t) {
                if (t % 3 == 1) {
                    posX += c;
                    count += 1;
                }
                if (t % 3 == 2) {
                    posY += c;
                    count += 1;
                }
                t /= 3;
                c *= 2;
            }
            long current = 0;
            for (int j = 0; j < N; j++) {
                current += Math.min(distX[posX][j], distY[posY][j])*groups[j].p;
            }
            ans[count] = Math.min(ans[count], current);
        }
        for (int i = 0; i <= N; i++) {
            System.out.println(ans[i]);
        }
    }
    private int pow(int base, int count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            return base * pow(base, count - 1);
        }
        int t = pow(base, count / 2);
        return t * t;
    }
    class Group {
        int x;
        int y;
        long p;
        Group(int x, int y, long p) {
            this.x = x;
            this.y = y;
            this.p = p;
        }
    }
}
