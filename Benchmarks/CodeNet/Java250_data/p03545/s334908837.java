import java.util.Scanner;

/**
 * ABC079C_Train_Ticket
 */
public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        String ABCD = sc.next();
        String[] strArray = ABCD.split("");
        int length = ABCD.length() - 1; // 文字列の間に"+"を入れるかどうか、文字列の間の数

        String answer = "";
        int ansNum = 0;
        for (int i = 0; i < (1 << length); i++) {
            // パターン1つ1つの繰り返し区切り場所をリセット
            answer = strArray[0];
            ansNum = Integer.valueOf(strArray[0]);
            for (int j = 0; j < length; j++) {
                // 場所ごとの組み合わせで対応が異なる処理を入れる
                if ((i >> j) % 2 == 0) {
                    // "-"を入れる場合
                    answer += "-" + strArray[j + 1];
                    ansNum -= Integer.valueOf(strArray[j + 1]);
                } else {
                    // "+"を入れる場合
                    answer += "+" + strArray[j + 1];
                    ansNum += Integer.valueOf(strArray[j + 1]);
                }
            }
            if (ansNum == 7) {
                answer += "=7";
                break;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}