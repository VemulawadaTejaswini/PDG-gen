import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = h + w - 1;
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        int[][] d = new int[h][w];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                d[i][j] = Math.abs(a[i][j] - b[i][j]);
            }
        }
        int m = x * 80;
        int n = m * 2 + 1;
        boolean[][] prev = new boolean[w][x * 80 * 2 + 1];
        boolean[][] next;
        prev[0][m + d[0][0]] = true;
        prev[0][m - d[0][0]] = true;
        for(int j=1; j<w; j++) {
            for(int k=0; k<n; k++) {
                if(prev[j-1][k]) {
                    prev[j][k+d[0][j]] = true;
                    prev[j][k-d[0][j]] = true;
                }
            }
        }
        for(int i=1; i<h; i++) {
            next = new boolean[w][x * 80 * 2 + 1];
            for(int j=0; j<w; j++) {
                for (int k = 0; k < n; k++) {
                    if (prev[j][k]) {
                        next[j][k + d[i][j]] = true;
                        next[j][k - d[i][j]] = true;
                    }
                }
                if (j > 0) {
                    for (int k = 0; k < n; k++) {
                        if (next[j - 1][k]) {
                            next[j][k + d[i][j]] = true;
                            next[j][k - d[i][j]] = true;
                        }
                    }
                }
            }
            prev = next;
        }

        int res = m;
        for(int k=0; k<n; k++) {
            if(prev[w-1][k]) {
                res = Math.min(res, Math.abs(k-m));
            }
        }

        System.out.println(res);


    }


}


