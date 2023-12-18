import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] summary = new long[N+1];
        for (int i = 1; i <= N; i++) {
            summary[i] = divisors(i);
        }
        long ans = 0;
        for (int C = 1; C <= N - 1; C++) {
            ans += summary[N-C];
        }
        System.out.println(ans);
    }
    private long divisors(int N) {
        int current = N;
        long ans = 1;
        for (int i = 2; i * i <= current; i++) {
            if (current % i != 0) {
                continue;
            }
            long count = 0;
            while (current % i == 0) {
                current /= i;
                count += 1;
            }
            ans *= (count + 1);
        }
        if (1 < current) {
            ans *= 2;
        }
        return ans;
    }
}
