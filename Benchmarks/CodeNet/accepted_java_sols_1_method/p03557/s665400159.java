import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        Arrays.sort(A);

        for (int i = 0; i < N; i++)
            B[i] = sc.nextInt();
        Arrays.sort(B);

        for (int i = 0; i < N; i++)
            C[i] = sc.nextInt();
        Arrays.sort(C);

        long[] up = new long[N];
        long[] dn = new long[N];

        int j = N - 1;
        for (int i = N - 1; i >= 0; i--) {
            for (; j >= 0; j--) {
                if (A[j] < B[i]) {
                    up[i] = (long)(j + 1); // record how many a is less at B[i];
                    break;
                }
            }

            if (j < 0) break;
        }

        j = 0;
        for (int i = 0; i < N; i++) {
            for (; j < N; j++) {
                if (C[j] > B[i]) {
                    dn[i] = (long) N - j;
                    break;
                }
            }

            if (j > N) break;
        }

        long res = 0;

        for (int i = 0; i < N; i++) {
                res += up[i] * dn[i];
        }

        System.out.println(res);
    }




}
