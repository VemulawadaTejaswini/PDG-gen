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
        int N = scan.nextInt();
        for (int t = 1; t <= N; t++) {
            int ans = solve(t);
            System.out.println(ans);
        }
    }
    private int solve(int t) {
        int ans = 0;
        for (int x = 1; x * x <= t; x++) {
            int remain1 = t - x * x;
            if (remain1 < 0) {
                continue;
            }
            for (int y = 1; y * y <= remain1; y++) {
                int remain2 = remain1 - y * y - x * y;
                if (remain2 < 0) {
                    continue;
                }
                for (int z = 1; z * z <= remain2; z++) {
                    int remain = remain2 - z * z - x * z - y * z;
                    if (remain == 0) {
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }
}
