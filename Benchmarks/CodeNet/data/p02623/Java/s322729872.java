import java.util.Scanner;

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
        
        int max = 0;
        int j = 0;
        long total = 0;
        
        while (j < M) {
            if (total + B[j] <= K) {
                total += B[j];
                j++;
            } else {
                max = j;
                break;
            }
        }
        
        int i = 0;
        while (i < N) {
            total += A[i];
            i++;
            
            while (0 < j && K < total) {
                j--;
                total -= B[j];
            }
            if (K < total) {
                break;
            }
            if (max < i + j) {
                max = i + j;
            }
        }
        
        System.out.println(max);
    }
}
