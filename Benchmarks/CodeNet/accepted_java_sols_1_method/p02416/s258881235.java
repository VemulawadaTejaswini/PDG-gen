import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 最初の文字の固まりを整数値と想定して読み込む
        while (true) {
            String Num = sc.next();
            int Sum = 0;
            if (Num.equals("0")) {
                break;
            }
            for (int i = 0; i < Num.length(); i++) {
                Sum += Num.charAt(i) - '0';

            }
            System.out.printf("%d\n", Sum);
        }
    }
}
