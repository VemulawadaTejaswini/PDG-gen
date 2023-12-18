import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long wmin = 3 * N >> 2;
        if(N % 4 != 0) ++wmin;
        for(long w = wmin; w <= 3500; ++w) {
            for(long n = w; n >= 1; --n) {
                long denominator = 4 * n * w - N * (w + n);
                long numerator = N * n * w;
                if(numerator % denominator != 0) continue;
                long h = numerator / denominator;
                if(h > 0 && h <= n) {
                    System.out.printf("%d %d %d", h, n, w);
                    return;
                }
            }
        }
    }
}
