import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }

        // 主処理
        int[] x = new int[] { 0, 0, -1, 1 };
        int[] y = new int[] { -1, 1, 0, 0 };

        boolean judge = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '.') {
                    continue;
                }
                boolean canPaint = false;
                for (int k = 0; k < 4; k++) {
                    int targetX = j + x[k];
                    int targetY = i + y[k];
                    boolean isOutside = targetX < 0 || w <= targetX || targetY < 0 || h <= targetY;
                    if (!isOutside) {
                        canPaint = canPaint || s[targetY][targetX] == '#';
                    }
                }
                if (!canPaint) {
                    judge = false;
                }
            }
        }

        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
