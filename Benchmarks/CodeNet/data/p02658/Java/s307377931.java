

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i ++ ) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i ++ ) {
            if (A[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        long res = A[0];
        for (int i = 1; i < N; i ++ ) {
            if (A[i] < 1e18 / res) {
                res *= A[i];
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(res);
    }
}
