import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * あみだくじの情報を受け取り、その結果を表示する。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // 入力値を受け取る
        Lots lots = readLots();

        // あみだくじを左から順番に実施する
        int[] resultArray = new int[lots.numberOfVerticalLine];
        for (int i = 1; i <= lots.numberOfVerticalLine; i++) {
            int result = i;

            // 横棒すべてに対してジャンプできるかどうか判定する
            for (HorizontalLine horizontalLine : lots.getHorizontalLineArray()) {
                result = horizontalLine.jumpIfOnThisLine(result);
            }

            // 最終的にどこに着いたかを保持する
            resultArray[result - 1] = i;
        }

        // 結果を出力する
        for (int result : resultArray) {
            System.out.println(result);
        }

    }

    /**
     * 標準入力から空白区切りの数値を取得し、三角形を表す数値の2次元配列として返却する。
     *
     * @return 三角形を表す整数の2次元配列（6×データ数）
     */
    protected static Lots readLots() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        // 最初に縦棒の数、横棒の数を取得する
        int numberOfVerticalLine = Integer.parseInt(reader.readLine());
        int numberOfHorizontalLine = Integer.parseInt(reader.readLine());

        // 1行につき、横棒の接続位置を表す2データを取り込む
        HorizontalLine[] horizontalLineArray = new HorizontalLine[numberOfHorizontalLine];
        for (int i = 0; i < horizontalLineArray.length; i++) {
            String[] numbers = reader.readLine().split(",");
            int left = Integer.parseInt(numbers[0]);
            int right = Integer.parseInt(numbers[1]);
            horizontalLineArray[i] = new HorizontalLine(left, right);
        }

        if (reader != null) {
            reader.close();
        }

        // 入力値をクラスにまとめて返却する
        Lots lots = new Lots(numberOfVerticalLine, horizontalLineArray);
        return lots;
    }

    /**
     * あみだくじを表すクラス
     *
     */
    static class Lots {

        /** 縦棒の数 */
        int numberOfVerticalLine;

        /** 横棒を表すペア数字の配列 */
        HorizontalLine[] horizontalLineArray;

        /**
         * コンストラクタ
         *
         * @param numberOfVerticalLine 縦棒の数
         * @param horizontalLineArray 横棒を表すペア数字の配列
         */
        public Lots(int numberOfVerticalLine, HorizontalLine[] horizontalLineArray) {
            this.numberOfVerticalLine = numberOfVerticalLine;
            this.horizontalLineArray = horizontalLineArray;
        }

        public int getNumberOfVerticalLine() {
            return numberOfVerticalLine;
        }

        public void setNumberOfVerticalLine(int numberOfVerticalLine) {
            this.numberOfVerticalLine = numberOfVerticalLine;
        }

        public HorizontalLine[] getHorizontalLineArray() {
            return horizontalLineArray;
        }

        public void setHorizontalLineArray(HorizontalLine[] horizontalLineArray) {
            this.horizontalLineArray = horizontalLineArray;
        }
    }

    /**
     * 横棒を表すクラス
     *
     */
    static class HorizontalLine {

        /** 左端 */
        private int left;

        /** 右端 */
        private int right;

        /**
         * コンストラクタ
         *
         * @param left 左端
         * @param right 右端
         */
        public HorizontalLine(int left, int right) {
            this.left = left;
            this.right = right;
        }

        /**
         * 横棒の上にある場合はもう一方に飛び、飛んだ先の番号を取得する。
         *
         * @param value 元の値
         * @return 飛べる場合は飛んだ先、飛べなかった場合は元の値
         */
        public int jumpIfOnThisLine(int value) {
            if (value == right) {
                return left;
            }
            else if (value == left) {
                return right;
            }
            return value;
        }
    }
}