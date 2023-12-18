import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<Long, HashMap<Integer, Long>> pow_cache = new HashMap<>();
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String X = scan.next();
        char[] data = X.toCharArray();
        HashMap<Long, Long> cache = new HashMap<>();
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
                if (cache.containsKey(current)) {
                    current = cache.get(current);
                    ans += 1;
                    continue;
                }
                long previous = current;
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
                cache.put(previous, current);
                ans += 1;
            }
            System.out.println(ans);
        }
    }
    private long pow(int base, int count, long mod) {
        if (!pow_cache.containsKey(mod)) {
            pow_cache.put(mod, new HashMap<>());
        }
        HashMap<Integer, Long> cache = pow_cache.get(mod);
        if (cache.containsKey(count)) {
            return cache.get(count);
        }
        if (count == 0) {
            long t = 1 % mod;
            cache.put(0, t);
            return t;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count - 1, mod);
            t %= mod;
            cache.put(count, t);
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        cache.put(count, t);
        return t;
    }
}
