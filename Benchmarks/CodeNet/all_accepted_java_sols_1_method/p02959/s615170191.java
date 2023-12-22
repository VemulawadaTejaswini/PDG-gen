

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for(int i = 0; i < N+1; i++) A[i] = sc.nextInt();
        for(int i = 0; i < N; i++) B[i] = sc.nextInt();

        long res = 0;
        for(int i = 0; i < N; i++) {
            int d = Math.min(A[i], B[i]);
            res += d;
            A[i] -= d;
            B[i] -= d;

            d = Math.min(B[i], A[i+1]);
            res += d;
            A[i+1] -= d;
            

        }
        System.out.println(res);
    }
}
