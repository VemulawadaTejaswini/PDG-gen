import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int K = scan.nextInt();
        int[][] blacks = new int[H][W];
        for (int i = 0; i < H; i++) {
            char[] t = scan.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (t[j] == '#') blacks[i][j] = 1;
            }
        }
        int max_h = pow(2, H);
        int max_w = pow(2, W);
        int ans = 0;
        for (int i = 0; i < max_h; i++) {
            for (int j = 0; j < max_w; j++) {
                int count = 0;
                for (int row = 0; row < H; row++) {
                    if (((i >> row) & 1) == 1) continue;
                    for (int column = 0; column < W; column++) {
                        if (((j >> column) & 1) == 1) continue;
                        count += blacks[row][column];
                    }
                }
                if (count == K) ans += 1;
            }
        }
        System.out.println(ans);
    }
    private int pow(int base, int count) {
        if (count == 0) return 1;
        if (count % 2 == 1) return base * pow(base, count - 1);
        int t = pow(base, count / 2);
        return t * t;
    }
}
