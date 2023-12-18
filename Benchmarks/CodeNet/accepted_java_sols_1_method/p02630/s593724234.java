import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        A[0] = 0;
        for (int i = 1; i < N+1; i++) {
            A[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] B = new int[Q+1];
        int[] C = new int[Q+1];
        B[0] = 0;
        C[0] = 0;
        for (int i= 1; i < Q+1; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        long[] S = new long[Q+1];
        S[0] = 0;
        for (int i = 0; i < A.length; i++) {
            S[0] = S[0] + A[i];
        }
        int[] n = new int[100000+1];
        for (int i = 0; i < n.length; i++) {
            n[i] = 0;
        }
        for (int i = 1; i < A.length; i++) {
            n[A[i]] = n[A[i]] + 1;
        }
        for (int i = 1; i < Q+1; i++) {
            S[i] = (C[i]-B[i])*n[B[i]] + S[i-1];
            System.out.println(S[i]);
            n[C[i]] = n[C[i]] + n[B[i]];
            n[B[i]] = 0;
        }
    }
}