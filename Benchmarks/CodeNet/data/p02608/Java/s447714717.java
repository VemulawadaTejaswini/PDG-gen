import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int N = scan.nextInt();
        for (int t = 1; t <= N; t++) {
            int ans = solve(t);
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    private int solve(int t) {
        int ans = 0;
        for (int x = 1; x * x <= t; x++) {
            int remain1 = t - x * x;
            if (remain1 < 0) {
                continue;
            }
            for (int y = x; y * y <= remain1; y++) {
                int remain2 = remain1 - y * y - x * y;
                if (remain2 < 0) {
                    continue;
                }
                for (int z = y; z * z <= remain2; z++) {
                    if (remain2 % z != 0) {
                        continue;
                    }
                    int w = remain2 / z;
                    if (x + y + z != w) {
                        continue;
                    }
                    if (x == y && y == z) {
                        ans += 1;
                        continue;
                    }
                    if (x == y || x == z || y == z) {
                        ans += 3;
                        continue;
                    }
                    ans += 6;
                }
            }
        }
        return ans;
    }
}
