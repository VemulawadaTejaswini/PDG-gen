import java.util.Scanner;

public class Main
{
    static final int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            map[a][b] = c;
            map[b][a] = c;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        int[][] stepMap = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stepMap[i][j] = INF;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] <= l) {
                    stepMap[i][j] = 1;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    stepMap[i][j] = Math.min(stepMap[i][j], stepMap[i][k] + stepMap[k][j]);
                }
            }
        }

        int q = sc.nextInt();
        for (int iq = 0; iq < q; iq++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int step = stepMap[start][end];
            if (step == INF) {
                System.out.println(-1);
            }
            else {
                System.out.println(step - 1);
            }
        }
    }
}
