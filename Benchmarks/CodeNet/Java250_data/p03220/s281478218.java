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
        int T = scan.nextInt();
        int A = scan.nextInt();
        double min_abs = Double.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int h = scan.nextInt();
            double x = (double) T - 0.006 * h;
            double abs = Math.abs(x - A);
            if (abs < min_abs) {
                min_abs = abs;
                answer = i + 1;
            }
        }
        System.out.println(answer);
    }
}
