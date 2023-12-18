import java.util.Scanner;

public class Main {
    static String a;
    static String b;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] answer = new int[number];
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            a = scanner.nextLine();
            b = scanner.nextLine();
            dp = new int[a.length()+1][b.length()+1];
            for (int g = 0; g < dp.length; g++) {
                for (int h = 0; h < dp[0].length; h++) {
                    dp[g][h] = -1;
                }
            }
            answer[i] = lcs(0,0);
        }
        for (int a : answer){
            System.out.println(a);
        }
    }

    static int lcs(int i, int j) {
        if (dp[i][j] == -1) {
            if ( (i == a.length() && j == b.length())
                    || (i == a.length() && j < b.length())
                    || (j == b.length() && i < a.length())) {
                dp[i][j] = 0;
            } else {
                int s = 0;
                if (a.charAt(i) == b.charAt(j)) {
                    s += 1 + lcs(i+1, j+1);
                } else {
                    int x = lcs(i, j+1);
                    int y = lcs(i+1, j);
                    s += Math.max(x,y);
                }
                dp[i][j] = s;
            }
        }
        return dp[i][j];
    }
}
