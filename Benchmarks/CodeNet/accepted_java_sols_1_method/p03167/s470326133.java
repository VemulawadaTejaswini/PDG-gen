import java.util.Scanner;

public class Main {

    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] map = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String tmp = scanner.nextLine();
            map[i] = tmp.toCharArray();
        }
        int mod = (int)(1e9 + 7);
        int[][] dp = new int[n][m];
        dp[0][0]=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               int[][] directions = new int[][]{{1,0},{0,1}};
                for (int[] direction : directions) {
                    int x= i + direction[0];
                    int y= j + direction[1];
                    if(x<n&&y<m&&map[x][y]=='.') {
                        dp[x][y] += dp[i][j];
                        if(dp[x][y] > mod) {
                            dp[x][y]-=mod;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n-1][m-1]);
    }




}