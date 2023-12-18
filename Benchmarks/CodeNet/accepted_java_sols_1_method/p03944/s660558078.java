import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        int[][] hw = new int[h][w];
        for (int i = 0; i < n; i++) {
            if(a[i] == 1) {
                for (int j = 0; j < h; j++) {
                    for (int j2 = 0; j2 < x[i]; j2++) {
                        hw[j][j2] = 1;
                    }
                }
            } else if(a[i] == 2) {
                for (int j = 0; j < h; j++) {
                    for (int j2 = x[i]; j2 < w; j2++) {
                        hw[j][j2] = 1;
                    }
                }
            } else if(a[i] == 3) {
                for (int j = 0; j < y[i]; j++) {
                    for (int j2 = 0; j2 < w; j2++) {
                        hw[j][j2] = 1;
                    }
                }
            } else if(a[i] == 4) {
                for (int j = y[i]; j < h; j++) {
                    for (int j2 = 0; j2 < w; j2++) {
                        hw[j][j2] = 1;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(hw[i][j] == 0) ans++;
            }
        }
        System.out.println(ans);
    }
}