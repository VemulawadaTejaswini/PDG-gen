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
        long X = Math.abs(scan.nextLong());
        long K = scan.nextLong();
        long D = scan.nextLong();
        if (K <= X / D) {
            long ans = X - K * D;
            System.out.println(ans);
            return;
        }
        // 可能性
        long min1 = Math.abs(X - (X / D) * D);
        long remain1 = K - X / D;
        if (remain1 % 2 == 0) {
            System.out.println(min1);
            return;
        }
        long min2 = Math.abs(X - ((X / D) + 1) * D);
        long remain2 = K - X / D - 1;
        if (remain2 % 2 == 0) {
            System.out.println(min2);
            return;
        }
        throw new RuntimeException("NG");

    }
}
