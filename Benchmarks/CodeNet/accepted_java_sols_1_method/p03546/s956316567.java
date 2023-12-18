import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] c = new int[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                c[i][j] = scanner.nextInt();

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    c[j][k] = Math.min(c[j][k], c[j][i] + c[i][k]);

        long ans = 0;
        for (int i = 0; i < h * w; i++) {
            int a = scanner.nextInt();
            if (a != -1) {
                ans += c[a][1];
            }
        }

        System.out.println(ans);
    }
}