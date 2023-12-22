import java.util.Scanner;

/**
 * ARC061C_Many_Formulas
 */
public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        String S = sc.next();

        int length = S.length() - 1; // 文字列の間に"+"を入れるかどうか、文字列の間の数
        int tmp = 0;
        long answer = 0;
        for (int i = 0; i < (1 << length); i++) {
            // パターン1つ1つの繰り返し区切り場所をリセット
            tmp = 0;
            for (int j = 0; j < length; j++) {
                // 場所ごとの組み合わせで対応が異なる処理を入れる
                // 0ならなにもせず、1なら+を入れて区切り場所を移動
                if ((i >> j) % 2 == 1) {
                    // "+"を入れる場合
                    answer += Long.parseLong(S.substring(tmp, j + 1));
                    tmp = j + 1; // 区切りの位置を更新
                }
            }
            // 残りの文字列部分全てを計算する
            answer += Long.parseLong(S.substring(tmp));
        }

        System.out.println(answer);

        sc.close();
    }
}