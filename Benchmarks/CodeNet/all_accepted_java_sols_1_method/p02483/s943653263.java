import java.util.Arrays;
import java.util.Scanner;


/**
 * Sorting Three Numbersのエントリポイントを持つメインクラスです。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try {

            // 入力を取得して配列へ
            int num1 = stdIn.nextInt();
            int num2 = stdIn.nextInt();
            int num3 = stdIn.nextInt();
            int[] nums = new int[] {num1, num2, num3};

            // 昇順ソート
            Arrays.sort(nums);

            // ソート結果を文字列にまとめて最後にtrim
            String answer = "";
            for (int num : nums) {
                answer += num + " ";
            }

            System.out.println(answer.trim());

        } finally {
            stdIn.close();
        }
    }
}