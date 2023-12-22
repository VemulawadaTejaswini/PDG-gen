import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /** 入力される数値の数 */
    private static final int NUMBER_OF_ELEMENT = 3;

    /** 配列がそれぞれどの辺に対応するか（X） */
    private static final int INDEX_X = 0;

    /** 配列がそれぞれどの辺に対応するか（Y） */
    private static final int INDEX_Y = 1;

    /** 配列がそれぞれどの辺に対応するか（Z） */
    private static final int INDEX_Z = 2;

    /** 出力文字列のマップ */
    private static final Map<Boolean, String> printMap = new HashMap<Boolean, String>();;
    static {
        printMap.put(true, "YES");
        printMap.put(false, "NO");
    }

    /**
     * 空白区切りの3つの数字を受け取り、
     * その3つの数字を3辺とする三角形が直角三角形であるかどうかを判定する。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // 入力値を読み込む
        int[][] triangleList = readTriangleList();

        // 入力値の数だけ処理を行い、結果を出力する
        for (int i = 0; i < triangleList.length; i++) {
            boolean isTriangle = isRightTriangle(triangleList[i]);
            System.out.println(printMap.get(isTriangle));
        }

     }

    /**
     * 標準入力から空白区切りの数値を取得し、三角形を表す整数の2次元配列として返却する。
     *
     * @return 三角形を表す整数の2次元配列（3×データ数）
     */
    protected static int[][] readTriangleList() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 最初にデータの個数を取得する
        int numberOfLine = Integer.parseInt(reader.readLine());

        // 1行につき、3データずつ取り込む
        int[][] triangleList = new int[numberOfLine][NUMBER_OF_ELEMENT];
        for (int i = 0; i < triangleList.length; i++) {
            String[] lengthArray = reader.readLine().split(" ");
            for (int j = 0; j < lengthArray.length; j++) {
                triangleList[i][j] = Integer.parseInt(lengthArray[j]);
            }
        }

        if (reader != null) {
            reader.close();
        }

        return triangleList;
    }

    /**
     * 指定された三角形のデータが直角三角形かどうかを判定する。
     *
     * @param triangle 三角形を表す整数配列
     * @return 直角三角形なら true、そうでないなら false
     */
    protected static boolean isRightTriangle(int[] triangle) {

        // 一番長い辺が最後にくるように配列をソートする
        Arrays.sort(triangle);

        // ピタゴラスの定理を用いて判定する
        int xx = (int)Math.pow(triangle[INDEX_X], 2);
        int yy = (int)Math.pow(triangle[INDEX_Y], 2);
        int zz = (int)Math.pow(triangle[INDEX_Z], 2);

        // x^2 + y^2 = z^2 ならば直角三角形
        return ((xx + yy) == zz);
    }
}