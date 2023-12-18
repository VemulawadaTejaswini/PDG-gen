

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long k = sc.nextLong();
        long[] A = new long[N+1];
        long[] B = new long[M+1];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for(int i = 0; i < M; i++) {
            B[i] = sc.nextLong();
        }
        A[N] = Integer.MAX_VALUE;
        B[M] = Integer.MAX_VALUE;

        int a = 0;
        int b = 0;
        int res = 0;
        long total = 0;
        while(true) {
            if(A[a] > B[b]) {
                total += B[b];
                b++;
            } else {
                total += A[a];
                a++;
            }
            if(a+b>(M+N)) break;
            if(total > k) break;
            res++;
        }
        System.out.println(res);
    }
}
