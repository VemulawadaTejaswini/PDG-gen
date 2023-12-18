import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long res = 0;
        final long INF = (long)Math.pow(10, 9) + 7;
        for (long i = K; i <= N + 1; i++) {
            long min = (i - 1) * i / 2;
            long max = i * (N - i + 1) + (i - 1) * i / 2;
            res += max - min + 1;
        }
        System.out.println(res % INF);
        sc.close();
    }
}