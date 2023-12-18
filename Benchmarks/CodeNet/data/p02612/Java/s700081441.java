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
        if (N % 1000 == 0) {
            System.out.println(0);
            return;
        }
        int ans = ((N / 1000) + 1) * 1000 - N;
        System.out.println(ans);
    }
}
