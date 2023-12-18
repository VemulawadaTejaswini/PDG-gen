import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    // マス目の縦横の長さ
    static final int MATH_LENGTH = 10;

    // 入力値格納用（座標とインキ滴の大きさ)
    static int x, y, scale;
    // 10×10のマス目の「紙」
    static int[][] math;
    // 座標格納用
    static HashSet<Point> scopes;

    static void init() {
        x = 0;
        y = 0;
        scale = 0;
        math = new int[MATH_LENGTH][MATH_LENGTH];
        scopes = new HashSet<Point>();
    }

    public static void main(String[] args) {
        // 変数の初期化
        init();

        // 入力値を一行分取得
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

            // インク滴の大きさ別に滲む範囲の計算
            scopes.clear();
            switch (scale) {
            case 1: // インキ滴「小」
                setSmallScopes(x, y);
                break;
            case 2: // インキ滴「中」
                setMediumScopes(x, y);
                break;
            case 3: // インキ滴「大」
                setLargeScopes(x, y);
                break;
            }

            // インク滴がマスの範囲内(10×10)であれば配列の値に1を加算
            for (Point scope : scopes) {
                if (0 <= scope.x && scope.x < MATH_LENGTH && 0 <= scope.y && scope.y < MATH_LENGTH) {
                    math[scope.x][scope.y]++;
                }
            }
        }

        // 色のついていない部分のマス目の個数と１番濃いマス目の濃さを計算
        int whiteNumber = 0;
        int mostNumber = 0;
        for (int i = 0; i < MATH_LENGTH; i++) {
            for (int j = 0; j < MATH_LENGTH; j++) {
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

    private static void setSmallScopes(int x, int y) {
        scopes.add(new Point(x - 1, y));
        scopes.add(new Point(x, y - 1));
        scopes.add(new Point(x, y));
        scopes.add(new Point(x, y + 1));
        scopes.add(new Point(x + 1, y));
    }

    private static void setMediumScopes(int x, int y) {
        scopes.add(new Point(x - 1, y - 1));
        scopes.add(new Point(x - 1, y));
        scopes.add(new Point(x - 1, y + 1));

        scopes.add(new Point(x, y - 1));
        scopes.add(new Point(x, y));
        scopes.add(new Point(x, y + 1));

        scopes.add(new Point(x + 1, y - 1));
        scopes.add(new Point(x + 1, y));
        scopes.add(new Point(x + 1, y + 1));
    }

    private static void setLargeScopes(int x, int y) {
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
    }
}