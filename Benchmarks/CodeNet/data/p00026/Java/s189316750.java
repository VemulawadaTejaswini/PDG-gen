import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int scale = 0;
        // 紙[10×10]。
        int[][] math = new int[10][10];
        // インクが落ちた座標。
        HashSet<Point> scopes = new HashSet<Point>();

        // 入力値を取得
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String inputStr = null;
            try {
                inputStr = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputStr == null) {
                break;
            }
            // 入力文字列を","で分割
            String[] inputSplitStr = inputStr.split(",");
            x = Integer.valueOf(inputSplitStr[0]);
            y = Integer.valueOf(inputSplitStr[1]);
            scale = Integer.valueOf(inputSplitStr[2]);

            // インク滴が滲む範囲の計算
            scopes.clear();
            switch (scale) {
            case 1: // インキ滴「小」
                scopes = calSmallScopes(x, y, scopes);
                break;
            case 2: // インキ滴「中」
                scopes = calMediumScopes(x, y, scopes);
                break;
            case 3: // インキ滴「大」
                scopes = calLargeScopes(x, y, scopes);
                break;
            }

            // インク滴がマスの範囲内(10×10)であれば配列の値に1を加算する。
            for (Point scope : scopes) {
                if (0 <= scope.x && scope.x < 10 && 0 <= scope.y && scope.y < 10) {
                    math[scope.x][scope.y]++;
                }
            }
        }

        // 色のついていない部分のマス目の個数と１番濃いマス目の濃さを計算
        int whiteNumber = 0;
        int mostNumber = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (math[i][j] == 0) {
                    whiteNumber++;
                }
                if (mostNumber < math[i][j]) {
                    mostNumber = math[i][j];
                }
            }
        }
        System.out.println(whiteNumber);
        System.out.println(mostNumber);
    }

    private static HashSet<Point> calSmallScopes(int x, int y, HashSet<Point> scopes) {
        scopes.add(new Point(x - 1, y));
        scopes.add(new Point(x, y - 1));
        scopes.add(new Point(x, y));
        scopes.add(new Point(x, y + 1));
        scopes.add(new Point(x + 1, y));
        return scopes;
    }

    private static HashSet<Point> calMediumScopes(int x, int y, HashSet<Point> scopes) {
        scopes.add(new Point(x - 1, y - 1));
        scopes.add(new Point(x - 1, y));
        scopes.add(new Point(x - 1, y + 1));

        scopes.add(new Point(x, y - 1));
        scopes.add(new Point(x, y));
        scopes.add(new Point(x, y + 1));

        scopes.add(new Point(x + 1, y - 1));
        scopes.add(new Point(x + 1, y));
        scopes.add(new Point(x + 1, y + 1));
        return scopes;
    }

    private static HashSet<Point> calLargeScopes(int x, int y, HashSet<Point> scopes) {
        scopes.add(new Point(x - 2, y));

        scopes.add(new Point(x - 1, y - 1));
        scopes.add(new Point(x - 1, y));
        scopes.add(new Point(x - 1, y + 1));

        scopes.add(new Point(x, y - 2));
        scopes.add(new Point(x, y - 1));
        scopes.add(new Point(x, y));
        scopes.add(new Point(x, y + 1));
        scopes.add(new Point(x, y + 2));

        scopes.add(new Point(x + 1, y - 1));
        scopes.add(new Point(x + 1, y));
        scopes.add(new Point(x + 1, y + 1));

        scopes.add(new Point(x + 2, y));
        return scopes;
    }
}