import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(lcs(a, b));
        }
    }
    public static int lcs(String a, String b) {
        a = ' ' + a;
        b = ' ' + b;
        int m = a.length();
        int n = b.length();
        int max = 0;
        int[][] c = new int[m][n];
        for (int i = 1; i < m; i++) c[i][0] = 0;
        for (int j = 1; j < n; j++) c[0][j] = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                  c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
                max = Math.max(max, c[i][j]);
            }
        }
        return max;
    }
}
