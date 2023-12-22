import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        int[] C = new int[n];
        int[][] A = new int[n][m];
        int[] M = new int[m];
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
            for(int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int bit = 0; bit < (1 << n); bit++) {
            int c = 0;
            for(int i = 0; i < n; i++) {
                if((1&bit>>i) == 1) {
                    for(int j = 0; j < m; j++) {
                        M[j] += A[i][j];
                    }
                    c += C[i];
                }
            }
            boolean flag = true;
            for(int mp : M) if(mp < x) flag = false;
            if(flag) res = Math.min(res, c);
            Arrays.fill(M, 0);
        }
        System.out.println(res == Integer.MAX_VALUE ? -1 : res);
    }
}
