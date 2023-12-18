import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        
        final int[] A = new int[M];
        
        for (int j = 0; j < M; j++) {
            A[j] = 0;
        }
        
        for (int i = 0; i < N; i++) {
            final int K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                A[sc.nextInt() - 1]++;
            }
        }
        
        final long answer = Arrays.stream(A).filter(e -> e == N).count();
        System.out.println(answer);
        return;
    }
}
