import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            char[][] l = new char[n][n];
            for (int i = 0; i < n; i++) {
                l[i] = sc.next().toCharArray();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (l[i][j] == '.') {
                        max = max(max, check(l, i, j, n));
                    }
                }
            }
            System.out.println(max);
        }
    }

    static int check(char[][] l, int x, int y, int n) {
        int limit = n - max(x, y);
        for (int i = 1; i < limit; i++) {
            for (int j = y; j < y + i; j++) {
                for (int k = x; k < x + i; k++) {
                    if (l[j][k] == '*') {
                        return i - 1;
                    }
                }
            }
        }
        return limit;
    }
}
