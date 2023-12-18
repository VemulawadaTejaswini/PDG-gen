import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################

        // 1行 数字 1文字 ---------------------------------------------------------------------------
        long a = Long.parseLong(scanner.nextLine());



        // ##### メイン処理 #######################################################################
        if (a % 2 == 0) {
            System.out.println(a /2);
        } else {
            System.out.println((a + 1) / 2);
        }
    }
}