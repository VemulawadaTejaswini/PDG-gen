
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        String s = itr.next();
        String t = itr.next();

        int[][] dp = new int[s.length() + 1][t.length() + 1];
        int[][] dir = new int[s.length() + 1][t.length() + 1];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    dir[i][j] = 1; // to left-up
                } else {
                    if (dp[i - 1][j] >= dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        dir[i][j] = 2; //to up;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        dir[i][j] = 3; //to left
                    }
                }
            }
        }

        StringBuilder res = new StringBuilder();

        int row = s.length();
        int col = t.length();

        while (row >= 0 && col >= 0) {
            if (dir[row][col] == 1) {
                res.insert(0, s.charAt(row - 1));
                row--;
                col--;
            } else if (dir[row][col] == 2) {
                row--;
            } else {
                col--;
            }
        }

        System.out.println(res);


    }
}
