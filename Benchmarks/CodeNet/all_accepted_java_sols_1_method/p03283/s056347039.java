import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] seg = new int[n][n];
        for(int i = 0; i < m; i++)
            seg[sc.nextInt()-1][sc.nextInt()-1]++;

        for(int i = 1; i < n; i++) {
            seg[0][i] += seg[0][i-1];
            seg[i][0] += seg[i-1][0];
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                seg[i][j] += seg[i-1][j] + seg[i][j-1] - seg[i-1][j-1];
            }
        }

        for(int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int cnt = 0;
            if(l == 1 || r == 1)
                cnt = seg[r-1][r-1];
            else
                cnt = seg[r-1][r-1] + seg[l-2][l-2] - seg[r-1][l-2] - seg[l-2][r-1];
            System.out.println(cnt);
        }


    }
}
