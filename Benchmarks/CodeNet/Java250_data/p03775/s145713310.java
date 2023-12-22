import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        List<Long> list = new ArrayList<>();
        for(long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }
        long answer = String.valueOf(N).length();
        for (long x : list) {
            long y = N / x;
            answer = Math.min(answer, Math.max(String.valueOf(x).length(), String.valueOf(y).length()));
        }
        System.out.println(answer);
    }
}
