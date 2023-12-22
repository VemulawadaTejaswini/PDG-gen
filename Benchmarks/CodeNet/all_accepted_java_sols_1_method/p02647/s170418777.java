import java.util.*;
import static java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        K = Math.min(K, 41);

        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for (int j=0; j<K; j++){
            int[] B = new int[N];

            for (int i=0; i<N; i++){
                int start = Math.max(i-A[i], 0);
                int end = Math.min(i+A[i], N-1);

                B[start] += 1;
                if (end+1 < N){
                    B[end+1] -= 1;
                }
            }
            for (int i=1; i<N; i++){
                B[i] += B[i-1];
            }
            for (int i=0; i<N; i++){
                A[i] = B[i];
            }
        }
        for (int i=0; i<N-1; i++){
            System.out.print(A[i] + " ");
        }
        System.out.print(A[N-1]);
        
    }
}