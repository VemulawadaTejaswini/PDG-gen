import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    /** 入力される係数の数 */
    private static final int NUMBER_OF_ELEMENT = 6;

    /** 入力される解の数 */
    private static final int NUMBER_OF_ANSWER = 2;

    /** 配列がそれぞれどの係数に対応するか（A） */
    private static final int INDEX_A = 0;

    /** 配列がそれぞれどの係数に対応するか（B） */
    private static final int INDEX_B = 1;

    /** 配列がそれぞれどの係数に対応するか（C） */
    private static final int INDEX_C = 2;

    /** 配列がそれぞれどの係数に対応するか（D） */
    private static final int INDEX_D = 3;

    /** 配列がそれぞれどの係数に対応するか（E） */
    private static final int INDEX_E = 4;

    /** 配列がそれぞれどの係数に対応するか（C） */
    private static final int INDEX_F = 5;

    /** 配列がそれぞれどの解に対応するか（X） */
    private static final int INDEX_X = 0;

    /** 配列がそれぞれどの解に対応するか（Y） */
    private static final int INDEX_Y = 1;

    /**
     * 空白区切りの6つの数字を受け取り、
     * その6つの数字からなる連立方程式の解を求める。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // 入力がある限り処理を行う
        String line = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while((line = reader.readLine()) != null) {

            // 入力文字列を数値配列に変換する
            int[] input = convertStringToIntArray(line);

            // 連立方程式を解く
            BigDecimal[] answers = calculateSimultaneousEquation(input);

            // 結果を出力する
            printAnswers(answers);
        }

        if (reader != null) {
            reader.close();
        }

     }

    /**
     * 空白区切りの数値を取得し、整数の配列として返却する。
     *
     * @param line 空白区切りの数値文字列
     * @return 整数の配列
     */
    protected static int[] convertStringToIntArray(String line){
        int [] result = new int[NUMBER_OF_ELEMENT];

        String[] splittedLine = line.split(" ");
        for( int i = 0; i < splittedLine.length; i++){
            result[i] = Integer.parseInt(splittedLine[i]);
        }

        return result;
    }

    /**
     * 指定された連立方程式の解を求める。
     * 解が1意に定まる前提でロジックを構築している。
     *
     * @param target 連立方程式を表す整数配列
     * @return 解となる x と y
     */
    protected static BigDecimal[] calculateSimultaneousEquation(int[] target) {

        BigDecimal[] answers = new BigDecimal[NUMBER_OF_ANSWER];

        BigDecimal a = BigDecimal.valueOf(target[INDEX_A]);
        BigDecimal b = BigDecimal.valueOf(target[INDEX_B]);
        BigDecimal c = BigDecimal.valueOf(target[INDEX_C]);
        BigDecimal d = BigDecimal.valueOf(target[INDEX_D]);
        BigDecimal e = BigDecimal.valueOf(target[INDEX_E]);
        BigDecimal f = BigDecimal.valueOf(target[INDEX_F]);

        // （a * e - b * d）
        BigDecimal divisor = a.multiply(e).subtract(b.multiply(d));

        // x = (c * e - f * b) / divisor
        answers[INDEX_X] = c.multiply(e).subtract(f.multiply(b)).divide(divisor);

        // y = (a * f - c * d) / divisor
        answers[INDEX_Y] = a.multiply(f).subtract(c.multiply(d)).divide(divisor);

        return answers;
    }

    /**
     * 方程式の解を出力する。
     *
     * @param answers 解の配列
     */
    protected static void printAnswers(BigDecimal[] answers) {
        printFormattedAnswer(answers[INDEX_X]);
        System.out.print(" ");
        printFormattedAnswer(answers[INDEX_Y]);
        System.out.println();
    }

    /**
     * 解を小数点以下第4位で四捨五入し、出力する。
     *
     * @param answer 1つの解
     */
    protected static void printFormattedAnswer(BigDecimal answer) {
        // 小数点以下第4位で四捨五入
        BigDecimal formattedAnser = answer.setScale(3, RoundingMode.HALF_UP);
        System.out.print(formattedAnser);
    }

}