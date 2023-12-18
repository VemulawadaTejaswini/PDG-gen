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
        int H1 = scan.nextInt();
        int M1 = scan.nextInt();
        int H2 = scan.nextInt();
        int M2 = scan.nextInt();
        int K = scan.nextInt();
        int start = H1 * 60 + M1;
        int end = H2 * 60 + M2 - K;
        int ans = end - start;
        System.out.println(ans);
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
}
