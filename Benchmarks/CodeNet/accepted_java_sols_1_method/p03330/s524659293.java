import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] d = new int[c][c];
        int[][] g = new int[3][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt()-1;
                g[(i+j)%3][x]++;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            int c1 = 0;
            for (int b = 0; b < c; b++) {
                c1 += d[b][i] * g[0][b];
            }
            for (int j = 0; j < c; j++) {
                if(i == j) continue;
                int c2 = 0;
                for (int b = 0; b < c; b++) {
                    c2 += d[b][j] * g[1][b];
                }
                for (int k = 0; k < c; k++) {
                    if(i == k || j == k) continue;
                    int c3 = 0;
                    for (int b = 0; b < c; b++) {
                        c3 += d[b][k] * g[2][b];
                    }
                    int tmp = c1 + c2 + c3;
                    if(tmp < ans) ans = tmp;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
