import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        if( K == 0 ) {
            System.out.println( (long) N * N );
            return;
        }

        long ans = 0;
        for(int b = 1; b <= N; b++ ) {
            ans += Math.max( (long)(N / b) * (b-K), 0) + Math.max(N % b - K + 1, 0);
        }
        
        System.out.println(ans);
    }
}
