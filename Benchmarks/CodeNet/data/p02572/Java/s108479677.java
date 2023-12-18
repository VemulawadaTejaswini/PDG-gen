import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final long[] A = new long[N];
        
        A[0] = sc.nextLong();
        long prevSum = 0;
        long total = 0;
        final long MOD = 1_000_000_007;
        
        for (int i = 1; i < N; i++) {
            A[i] = sc.nextLong();
            
            prevSum += A[i - 1];
            prevSum %= MOD;
            
            total += prevSum * A[i];
            total %= MOD;
        }
        
        System.out.println(total);
    }
}
