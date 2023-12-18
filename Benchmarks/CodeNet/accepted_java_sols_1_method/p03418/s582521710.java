import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int K = sc.nextInt();
        sc.close();
        if (K == 0) {
            System.out.println(N * N);
            return;
        }
        long ans = 0;
        for (int b = K + 1; b <= N; b++) {
            long p = N / b, r = N % b;
            long k = Math.max(b - K, 0) * p + Math.max(r - K + 1, 0);
            ans += k;
        }
        System.out.println(ans);
    }
}
