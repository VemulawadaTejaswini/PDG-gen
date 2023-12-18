import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final long D = sc.nextLong();
        final long DD = D * D;
        
        final long[] Xs = new long[N];
        final long[] Ys = new long[N];
        
        for (int i = 0; i < N; i++) {
            Xs[i] = sc.nextLong();
            Ys[i] = sc.nextLong();
        }
        
        long count = IntStream.range(0, N).parallel()
                .filter(i -> Xs[i] * Xs[i] + Ys[i] * Ys[i] <= DD)
                .count();
        
        System.out.println(count);
    }
}
