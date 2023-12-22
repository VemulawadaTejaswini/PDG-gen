import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[][] dp = new int[a.length()+1][b.length()+1];
        for (int i=0; i<=a.length(); i++) {
            for (int j=0; j<=b.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        // for (int i=0; i<=a.length(); i++) {
        //     for (int j=0; j<=b.length(); j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(dp[a.length()][b.length()]);
        StringBuilder sb = new StringBuilder();
        int i = a.length(), j = b.length();
        while (i > 0 && j > 0) {
            if (a.charAt(i-1) == b.charAt(j-1)) {
                sb.append(a.charAt(i-1));
                i -= 1;
                j -= 1;
            } else {
                if (dp[i][j] == dp[i-1][j]) {
                    i -= 1;
                } else {
                    j -= 1;
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }
}