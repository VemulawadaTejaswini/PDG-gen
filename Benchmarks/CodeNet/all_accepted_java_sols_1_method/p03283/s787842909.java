import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int n, m, q;
    static int[] L, R;
    static int[][] X, C;

    public static void main(String[] args) {
        L = new int[2000009];
        R = new int[2000009];
        X = new int[509][509];
        C = new int[509][509];

        Scanner in = new Scanner(System.in);
        n = in.nextInt(); m = in.nextInt(); q = in.nextInt();
        for(int i = 1; i <= m; i++) {
            L[i] = in.nextInt(); R[i] = in.nextInt(); X[L[i]][R[i]]++;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) C[i][j] = C[i][j-1] + X[i][j];
        }

        for(int i = 1; i <= q; i++) {
            int l = in.nextInt(), r = in.nextInt();
            int ans = 0;
            for(int j = l; j <= r; j++) ans += C[j][r] - C[j][l-1];
            System.out.println(ans);
        }
    }
}