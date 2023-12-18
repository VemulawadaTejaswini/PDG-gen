import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final long[] A = new long[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        
        final long MOD = 1_000_000_007;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                sum += A[i] * A[j];
                sum %= MOD;
            }
        }
        
        System.out.println(sum);
    }
}
