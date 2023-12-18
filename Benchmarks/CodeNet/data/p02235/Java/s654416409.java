import java.util.Scanner;

public class Main {

    public static int lcs(String str1, String str2) {

        if (str1.equals(str2)) {
            return str1.length();
        }

        int m = str1.length();
        int n = str2.length();
        int[][] d = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            d[i][0] = 0;
        }

        for (int i = 0; i <= n; i++) {
            d[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    d[i][j] = 1 + d[i-1][j-1];
                } else {
                    d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
                }
            }
        }

        return d[m][n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = Integer.parseInt(in.nextLine());
        String prev = "";
        String curr = "";
        for (int i = 0; i < q * 2; i++) {
            if (i % 2 == 0) {
                prev = in.nextLine();
            } else {
                curr = in.nextLine();
                System.out.println(lcs(prev, curr));
            }
        }
    }
}
