import java.util.Scanner;

public class Main {
    static int[] A;
    static int[] B;
    static int[] C;
    static int M;
    static int N;
    static int m;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        A = new int[M];
        B = new int[M];
        C = new int[N];

        int L;
        for(L = 0; L < M; ++L) {
            A[L] = scan.nextInt() - 1;
            B[L] = scan.nextInt() - 1;
        }

        L = 0;

        for(int j = 0; j < N; ++j) {
            if (C[j] == 0) {
                m = 1;
                C[j] = 1;
                dfs(j);
                if (m > L) {
                    L = m;
                }
            }
        }

        System.out.println(L);
    }

    static void dfs(int i) {
        for(int k = 0; k < M; ++k) {
            if (i == A[k] && C[B[k]] == 0) {
                C[B[k]] = 1;
                ++m;
                dfs(B[k]);
            } else if (i == B[k] && C[A[k]] == 0) {
                C[A[k]] = 1;
                ++m;
                dfs(A[k]);
            }
        }

    }
}
