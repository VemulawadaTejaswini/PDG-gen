import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N + 1];
        long[] B = new long[M + 1];
        A[N] = 0;
        B[M] = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextLong();
        }
        long T = 0;
        long a = A[0];
        long b = B[0];
        int Ca = 0;
        int Cb = 0;
        if ( a <= K && b <= K) {
        while ( T <= K ) {
            if ( a > 0 && a > b ) {
                T = T + a;
                Ca = Ca + 1;
                a = A[Ca];
            } else if (b > 0 && b >= a){
                T = T + b;
                Cb = Cb + 1;
                b = B[Cb];
            } else {
                break;
            }
        }
    }
        System.out.println(Ca + Cb);
    }
}