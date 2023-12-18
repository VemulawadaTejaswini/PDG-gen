import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String X = scan.next();
        char[] data = X.toCharArray();
        for (int i = 0; i < N; i++) {
            char[] t = Arrays.copyOf(data, data.length);
            t[i] = t[i] == '1' ? '0':'1';
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (t[j] == '1') {
                    count += 1;
                }
            }
            long current = 0;
            for (int j = 0; j < N; j++) {
                if (t[j] == '0') {
                    continue;
                }
                current += pow(2, N - 1 - j, count);
                current %= count;
            }
            int ans = 1;
            while (current != 0) {
                char[] x = Long.toBinaryString(current).toCharArray();
                int len = x.length;
                int c = 0;
                for (int j = 0; j < len; j++) {
                    if (x[j] == '1') {
                        c += 1;
                    }
                }
                current = 0;
                for (int j = 0; j < len; j++) {
                    if (x[j] == '0') {
                        continue;
                    }
                    current += pow(2, len - 1 - j, c);
                    current %= c;
                }
                ans += 1;
            }
            System.out.println(ans);
        }
    }
    private long pow(int base, int count, long mod) {
        if (count == 0) {
            long t = 1 % mod;
            return t;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count - 1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        return t;
    }
}
