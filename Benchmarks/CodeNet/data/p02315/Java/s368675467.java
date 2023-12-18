import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int[] V = new int[n];
        int[] W = new int[n];
        for(int i = 0; i < n; i++) {
            V[i] = in.nextInt();
            W[i] = in.nextInt();
        }

        long[][] dp = new long[n+1][w+1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < w+1; j++) {
                if(j < W[i]) {
                    dp[i+1][j] = dp[i][j];
                }else{
                    dp[i+1][j] = Math.max(dp[i][j-W[i]] + V[i], dp[i][j]);
                }
            }
        }

        System.out.println(dp[n][w]);
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void printArray2D(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%d\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}

