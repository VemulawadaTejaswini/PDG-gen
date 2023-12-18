import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int max = 0;
            int[] x = { -1, 0, 1, -1 };
            int[] y = { -1, -1, -1, 0 };
            int[][][] map = new int[n + 1][n + 2][4];
            for (int i = 1; i <= n; i++) {
                char[] line = scanner.next().toCharArray();
                for (int j = 1; j <= n; j++) {
                    if (line[j - 1] == '1') {
                        for (int k = 0; k < 4; k++) {
                            max = Math.max(max, map[i][j][k] = map[i + y[k]][j + x[k]][k] + 1);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
