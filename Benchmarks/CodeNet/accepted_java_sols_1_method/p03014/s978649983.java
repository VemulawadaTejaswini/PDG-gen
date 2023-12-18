import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int H = scanner.nextInt();
        final int W = scanner.nextInt();
        final int[][] a = new int[H][W];
        final int[][][] dp = new int[H][W][2];
        for (int i = 0; i < H; i++) {
            final String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                a[i][j] = s.charAt(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int sum = 0;
                if (a[i][j] == '#') {
                    continue;
                }
                // horizontal
                if (dp[i][j][0] != 0) {
                    sum += dp[i][j][0];
                } else {
                    int hori = 0;
                    for (int k = j; k < W; k++) {
                        if (a[i][k] == '#') {
                            break;
                        }
                        hori++;
                    }
                    for (int k = j; k < W; k++) {
                        if (a[i][k] == '#') {
                            break;
                        }
                        dp[i][k][0] = hori;
                    }
                    sum += hori;
                }

                // vertial
                if (dp[i][j][1] != 0) {
                    sum += dp[i][j][1];
                } else {
                    int ver = 0;
                    for (int k = i; k < H; k++) {
                        if (a[k][j] == '#') {
                            break;
                        }
                        ver++;
                    }
                    for (int k = i; k < H; k++) {
                        if (a[k][j] == '#') {
                            break;
                        }
                        dp[k][j][1] = ver;
                    }
                    sum += ver;
                }
                ans = Math.max(ans, sum);
            }

        }

        System.out.println(ans - 1);
        
    }
}
