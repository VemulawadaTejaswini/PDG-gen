import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int nowY = 0;
        int nowX = 0;

        int[][] ans = new int[h][w];

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            while (a > 0) {
                // 奇数行
                if (nowY % 2 == 0) {
                    int decreased = Math.min(w - nowX, a);
                    a -= decreased;
                    for (int j = 0; j < decreased; j++) {
                        ans[nowY][nowX++] = i;
                    }
                    if (nowX == w) {
                        nowY++;
                    }
                }
                // 偶数行
                else {
                    int decreased = Math.min(nowX, a);
                    a -= decreased;
                    for (int j = 0; j < decreased; j++) {
                        ans[nowY][--nowX] = i;
                    }
                    if (nowX == 0) {
                        nowY++;
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w - 1; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(ans[i][w - 1]);
        }
    }
}