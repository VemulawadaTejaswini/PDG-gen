import java.util.Scanner;

public class Main {
    private static Integer[][] memo;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String x = in.next();
            String y = in.next();
            memo = new Integer[x.length()][y.length()];
            System.out.println(lcsLength(x, y));
        }
    }

    private static int lcsLength(String x, String y) {
        return lcs(x, y, x.length() - 1, y.length() - 1);
    }

    private static int lcs(String x, String y, int xi, int yi) {
        if (xi < 0 || yi < 0) {
            return 0;
        } else if (memo[xi][yi] == null) {
            if (x.charAt(xi) == y.charAt(yi)) {
                memo[xi][yi] = lcs(x, y, xi-1, yi-1) + 1;
            } else {
                memo[xi][yi] = Math.max(lcs(x, y, xi, yi-1), lcs(x, y, xi-1, yi));
            }
        }
        return memo[xi][yi];
    }
}

