import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int K = sc.nextInt();
        
        final long[] A = new long[N];
        final long[] B = new long[M];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for (int j = 0; j < M; j++) {
            B[j] = sc.nextLong();
        }
        
        int maxNum = 0;
        int numA = 0;
        int numB = M;
        long totalA = 0;
        long totalB = LongStream.of(B).sum();
        
        while (numA <= N) {
            while (K < totalA + totalB && 0 < numB) {
                numB--;
                totalB -= B[numB];
            }
            if (K < totalA + totalB) {
                break;
            }
            if (maxNum < numA + numB) {
                maxNum = numA + numB;
            }
            
            if (numA < N) {
                totalA += A[numA];
            }
            numA++;
        }
        
        System.out.println(maxNum);
    }
}
