import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; i * j <= N; j++) {
                ans += i * j;
            }
        }
        System.out.println(ans);
    }
}
