import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /** 区切り文字 */
    private static final String DELIMITER = ",";

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        // ローカルテスト用。提出時は"System.in"に修正。
        InputStream input = System.in;
        // File input = new File("D:/Temp/AOJ/0011_DrawingLots.txt");

        try (Scanner scanner = new Scanner(input)) {
            int[] numbers = createFirstNumbers(Integer.parseInt(scanner
                    .nextLine()));
            int loopNum = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < loopNum; i++) {
                // 入れ替え前の順番を一時的に記憶しておく。
                int[] copy = Arrays.copyOf(numbers, numbers.length);
                // 入れ替え対象の番号を、配列のインデックスで表す。
                int[] changeNums = convert(scanner.nextLine().split(DELIMITER));

                numbers[changeNums[0]] = copy[changeNums[1]];
                numbers[changeNums[1]] = copy[changeNums[0]];
            }

            for (int number : numbers) {
                System.out.println(number);
            }
        } catch (Exception e) {
            // 対応しない。
        }
    }

    /**
     * 最初の数字の並びを格納した配列を作成する。
     *
     * @param numberOfArray 配列の要素数
     * @return 1?の数字を格納した配列
     */
    private static int[] createFirstNumbers(int numberOfArray) {
        int[] result = new int[numberOfArray];
        Arrays.fill(result, 1);
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + 1;
        }

        return result;
    }

    /**
     * 入れ替え対象のインデックスを格納したString配列を、int配列に変換する。
     *
     * @param target
     * @return
     */
    private static int[] convert(String[] target) {
        int[] result = new int[2];
        result[0] = Integer.parseInt(target[0]) - 1;
        result[1] = Integer.parseInt(target[1]) - 1;

        return result;
    }
}