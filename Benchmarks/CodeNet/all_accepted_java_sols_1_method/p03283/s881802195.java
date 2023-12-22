import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] plane = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            plane[r][l]++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                plane[i][j] = plane[i][j - 1] + plane[i][j];
            }
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            int cnt = 0;
            for (int j = l; j <= r; j++) {
                ans += plane[j][r] - plane[j][l - 1];
            }

            System.out.println(ans);
        }
    }
}
