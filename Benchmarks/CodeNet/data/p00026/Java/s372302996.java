import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
 
    //行数
    static final int n = 10;
 
    //列数
    static final int m = 10;
 
    //インキ滴（小）
    static final String INK_SIZE_SMALL = "1";

    //インキ滴（中） 
    static final String INK_SIZE_MEDIUM = "2";
 
    //インキ滴（大）
    static final String INK_SIZE_LARGE = "3";
 
    public static void main(String[] args) throws IOException {
 
        //紙
        int[][] paper = new int[n][m];
 
        //標準出力より、「落とすインキ滴」の x座標, y座標, サイズを取得する。
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in), 1);
 
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //「落とすインキ滴」のサイズを取得
            String inkSize = line.split(",")[2];
 
            //「落とすインキ滴」のx座標を取得
            int x = Integer.parseInt(line.split(",")[0]);
 
            //「落とすインキ滴」のy座標を取得
            int y = Integer.parseInt(line.split(",")[1]);
 
            //インキ滴のサイズによって演算処理を選択
            if (INK_SIZE_SMALL.equals(inkSize)) {
                paper = smallInk(x, y, paper);
            } else if (INK_SIZE_MEDIUM.equals(inkSize)) {
                paper = mediumInk(x, y, paper);
            } else if (INK_SIZE_LARGE.equals(inkSize)) {
                paper = largeInk(x, y, paper);
            }
        }
 
        //色がついていないマス数
        int colorless = 0;
        
        //色の濃さ
        int depth = 0;
 
        //色がついていないマス数、および色の濃さ（最大）の計算
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (paper[i][j] == 0) {
                    colorless++;
                }
                if (depth < paper[i][j]) {
                    depth = paper[i][j];
                }
            }
        }
        //結果の出力
        System.out.println(colorless);
        System.out.println(depth);
    }
 
    //インキ滴（小）の演算メソッド
    private static int[][] smallInk(int x, int y, int[][] array) {
        if (x - 1 >= 0) {
            array[y][x - 1]++;
        }
 
        if (y - 1 >= 0) {
            array[y - 1][x]++;
        }
        array[y][x]++;
        if (y + 1 < n) {
            array[y + 1][x]++;
        }
 
        if (x + 1 < m) {
            array[y][x + 1]++;
        }
        return array;
    }
 
    //インキ滴（中）の演算メソッド
    private static int[][] mediumInk(int x, int y, int[][] array) {
        //インキ滴（小）の演算結果の取得
        array = smallInk(x, y, array);
        
        //インキ滴（中）分の範囲拡大
        if (y - 1 >= 0) {
            if (x - 1 >= 0)
                array[y - 1][x - 1]++;
            if (x + 1 < m)
                array[y - 1][x + 1]++;
        }
        if (y + 1 < n) {
            if (x - 1 >= 0)
                array[y + 1][x - 1]++;
            if (x + 1 < m)
                array[y + 1][x + 1]++;
        }
 
        return array;
    }
 
    //インキ滴（大）の演算メソッド
    private static int[][] largeInk(int x, int y, int[][] array) {
        //インキ滴（中）の演算結果の取得
        array = mediumInk(x, y, array);

        //インキ滴（大）分の範囲拡大
        if (x - 2 >= 0) {
            array[y][x - 2]++;
        }
 
        if (y - 2 >= 0) {
            array[y - 2][x]++;
        }
        if (y + 2 < n) {
            array[y + 2][x]++;
        }
 
        if (x + 2 < m) {
            array[y][x + 2]++;
        }
 
        return array;
    }
 
}