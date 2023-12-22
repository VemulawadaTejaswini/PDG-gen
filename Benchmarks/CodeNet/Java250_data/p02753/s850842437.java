import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 文字 複数 ----------------------------------------------------------------------------
        String[] stringArray = scanner.nextLine().split("");
        String s1 = stringArray[0];
        String s2 = stringArray[1];
        String s3 = stringArray[2];

        // ##### メイン処理 #######################################################################
        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}