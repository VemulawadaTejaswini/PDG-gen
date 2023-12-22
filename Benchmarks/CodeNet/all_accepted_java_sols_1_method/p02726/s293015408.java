import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int[][] g = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            g[i][i + 1] = 1;
            g[i + 1][i] = 1;
        }
        g[x - 1][y - 1] = 1;
        g[y - 1][x - 1] = 1;
        x--;
        y--;
        int[] ans = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int v = Math.min(j - i, Math.min(Math.abs(x - i) + 1 + Math.abs(y - j), Math.abs(y - i) + 1 + Math.abs(x - j)));
                ans[v - 1]++;
            }
        }
        for (int a : ans) {
            System.out.println(a);
        }
    }
}
