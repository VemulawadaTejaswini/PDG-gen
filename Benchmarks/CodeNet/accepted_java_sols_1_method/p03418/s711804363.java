import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        long ans = 0;

        for(long b = K+1; b <= N; b++) {
            if(N % b != 0) {
                ans += (N / b) * (b - K) + Math.max(0, (N % b) - K + 1);
            } else {
                ans += (N / b) * (b - K);
            }
            
        }
        if(K == 0) {
            ans = N * N;
        }
        System.out.println(ans);
    }
}