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
        long L = scan.nextLong();
        long R = scan.nextLong();
        if (2018 < R - L) {
            System.out.println(0);
            return;
        }
        long answer = Integer.MAX_VALUE;
        for (long i = L; i < R; i++) {
            for (long j = i + 1; j <= R; j++) {
                answer = Math.min(answer, (i * j) % 2019);
            }
        }
        System.out.println(answer);
    }
}
