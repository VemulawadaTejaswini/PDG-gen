
import java.util.Scanner;

/**
 * 消費税率が
8
 %のとき
A
 円、
10
 ％のとき
B
 円の消費税が課されるような商品の税抜き価格を求めてください。

ただし、税抜き価格は正の整数でなければならないものとし、消費税の計算において小数点以下は切り捨てて計算するものとします。

条件を満たす税抜き価格が複数存在する場合は最も小さい金額を出力してください。また、条件を満たす税抜き価格が存在しない場合は -1 と出力してください。
 * @author nkyy0
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数字の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        int target = 0;
        int kekka = 10000;

        while (target < 10000) {
            if ((int) Math.floor((double) target * 0.08) == A && (int) Math.floor((double) target * 0.1) == B) {
                // 出力
              System.out.println(target);
                    break;

            } else {
                target = target + 1;
            }
        }
        if (target == 10000) {
            System.out.println(-1);
        }

    }
}