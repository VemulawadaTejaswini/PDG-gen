import java.io.InputStream;
import java.util.Scanner;

/**
 * @author MS14A
 * @version 2017/03/06
 */
public class Main {

    /** Input：空白 */
    private static final String INPUT_EMPTY = "s";

    /** 結果：引き分け */
    private static final String RESULT_DRAW = "d";

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        // ローカルテスト用。提出時は"System.in"に修正。
        InputStream input = System.in;
        // File input = new File("D:/Temp/AOJ/0066_TicTacToe.txt");

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                System.out.println(judgeWinner(splitLine(scanner.nextLine())));
            }
        } catch (Exception e) {
            // 対応しない。
        }
    }

    /**
     * 1行分の文字列を、1文字ずつの配列に変換する。
     *
     * @param line 1行分の文字列
     * @return 分割した配列
     */
    private static String[] splitLine(String line) {
        String[] result = new String[line.length()];

        for (int i = 0; i < line.length(); i++) {
            result[i] = String.valueOf(line.charAt(i));
        }

        return result;
    }

    /**
     * 勝ち負けを判定する。
     *
     * @param line 1行分の文字を格納した配列
     * @return 判定結果
     */
    private static String judgeWinner(String[] line) {
        String result = null;

        // 縦のチェック
        result = judgeVertical(line);
        if (result != null) {
            return result;
        }

        // 横のチェック
        result = judgeHorizontal(line);
        if (result != null) {
            return result;
        }

        // 斜めのチェック
        result = checkDiagonal(line);
        if (result != null) {
            return result;
        }

        // 縦横斜め、全てダメなら引き分け
        return RESULT_DRAW;
    }

    /**
     * 縦一列が揃っているか判定する。<br>
     * 揃っていなければ{@code null}を返却する。
     *
     * @param line 1行分の文字を格納した配列
     * @return 判定結果。
     */
    private static String judgeVertical(String[] line) {

        for (int i = 0; i < 3; i++) {
            // 縦のマスで一致するか確認するため、マス目の番号を3ずつ増やして確認する。
            if (!INPUT_EMPTY.equals(line[i]) && line[i].equals(line[i + 3])
                    && line[i + 3].equals(line[i + 6])) {
                return line[i];
            }
        }

        return null;
    }

    /**
     * 横一列が揃っているか判定する。<br>
     * 揃っていなければ{@code null}を返却する。
     *
     * @param line 1行分の文字を格納した配列
     * @return 判定結果。
     */
    private static String judgeHorizontal(String[] line) {
        // 横一列はマス目の番号"1""4""7"から始まるため、カウンタを3ずつインクリメントする。
        for (int i = 0; i < 9; i += 3) {
            // それぞれの列で、横のマス目と一致しているか確認する。
            if (!INPUT_EMPTY.equals(line[i]) && line[i].equals(line[i + 1])
                    && line[i + 1].equals(line[i + 2])) {
                return line[i];
            }
        }

        return null;
    }

    /**
     * 斜めで揃っているか判定する。<br>
     * 揃っていなければ{@code null}を返却する。
     *
     * @param line 1行分の文字を格納した配列
     * @return 判定結果。
     */
    private static String checkDiagonal(String[] line) {
        if (!INPUT_EMPTY.equals(line[0]) && line[0].equals(line[4])
                && line[4].equals(line[8])) {
            return line[0];
        }

        if (!INPUT_EMPTY.equals(line[2]) && line[2].equals(line[4])
                && line[4].equals(line[6])) {
            return line[2];
        }

        return null;
    }
}