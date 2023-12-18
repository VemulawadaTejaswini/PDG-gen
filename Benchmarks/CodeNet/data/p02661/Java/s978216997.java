import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        System.out.println(solve3(N, A, B));
    }

    private static long solve3(int N, int[] A, int[] B) {
        long count = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        if (N%2 == 1) {
            count = B[N/2] - A[N/2] + 1;
        } else {
            count = (B[N/2-1] + B[N/2]) - (A[N/2-1] + A[N/2]) + 1;
        }

        return count;
    }

}