import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = -1;
        for (int bit = 0; bit < (1 << n); bit++) {
            int csum = 0;
            int[] asum = new int[m];
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    csum += c[i];
                    for (int j = 0; j < m; j++) {
                        asum[j] += a[i][j];
                    }
                }
            }
            boolean morethanx = true;
            for (int i = 0; i < m; i++) {
                if (asum[i] < x) {
                    morethanx = false;
                    break;
                }
            }
            if (morethanx) {
                if (ans == -1) {
                    ans = csum;
                } else {
                    ans = Math.min(ans, csum);
                }
            }
        }
        System.out.println(ans);
    }
}
