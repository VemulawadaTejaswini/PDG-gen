
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[] Ps = new int[N];
        for (int i = 0; i < N; i++) {
            Ps[i] = sc.nextInt() - 1;
        }
        
        final long[] Cs = new long[N];
        for (int i = 0; i < N; i++) {
            Cs[i] = sc.nextLong();
        }
        
        long maxScore = Long.MIN_VALUE;
        final long[][] scores = new long[N][N];
        
        for (int i = 0; i < N; i++) {
            int p = Ps[i];
            scores[i][0] = Cs[p];
            
            int n = 1;
            p = Ps[p];
            while (p != Ps[i]) {
                scores[i][n] = scores[i][n - 1] + Cs[p];
                n++;
                p = Ps[p];
            }
            
            if (K <= n) {
                final long currMax = LongStream.of(scores[i]).limit(K).max().getAsLong();
                if (maxScore < currMax) {
                    maxScore = currMax;
                }
            } else {
                final int Kdiv = K % n == 0 ? K / n - 1 : K / n;
                final int Kmod = K % n == 0 ? n : K % n;
                
                final long total = scores[i][n - 1];
                if (0 < total) {
                    for (int j = 0; j < n; j++) {
                        scores[i][j] += j < Kmod ? total * Kdiv : total * (Kdiv - 1);
                    }
                }
                
                final long currMax = LongStream.of(scores[i]).max().getAsLong();
                if (maxScore < currMax) {
                    maxScore = currMax;
                }
            }
        }
        
        System.out.println(maxScore);
    }
}
