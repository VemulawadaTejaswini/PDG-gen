import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(sc.next());
        }

        int res = Integer.MAX_VALUE;

        for (int l = 0; l <= N - K; l++) {
            int r = l + K - 1;
            // left -> right
            int xl = Math.abs(x[l]) + Math.abs(x[r] - x[l]);
            res = Math.min(res, xl);

            // right -> left
            int xr = Math.abs(x[r]) + Math.abs(x[l] - x[r]);
            res = Math.min(res, xr);

        }

        System.out.println(res);
    }
}
