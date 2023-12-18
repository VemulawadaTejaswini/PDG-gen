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
        int X = scan.nextInt();
        int T = scan.nextInt();
        int ans = N / X * T;
        if (0 < N % X) {
            ans += T;
        }
        System.out.println(ans);

    }
}
