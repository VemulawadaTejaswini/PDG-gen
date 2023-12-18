import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int Q = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            a[l][r]++;
        }
        int[][] c = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j <= n; j++) {
                sum += a[i][j];
                c[i][j] = sum;
            }
        }
        int[] p = new int[Q];
        int[] q = new int[Q];
        for (int i = 0; i < Q; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();

        }
        for (int i = 0; i < Q; i++) {
            int pp = p[i];
            int qq = q[i];
            int ans = 0;
            for (int j = pp; j <= qq; j++) {
                ans += c[j][qq] - c[j][pp - 1];
            }
            System.out.println(ans);
        }

    }

}