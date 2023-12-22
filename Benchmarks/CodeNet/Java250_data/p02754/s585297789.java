import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 文字 複数 ----------------------------------------------------------------------------
        String[] stringArray = scanner.nextLine().split(" ");

        long n = Long.parseLong(stringArray[0]);
        long a = Long.parseLong(stringArray[1]);
        long b = Long.parseLong(stringArray[2]);


        // ##### メイン処理 #######################################################################

        long amari = n%(a+b);
        long result = (n-amari)/(a+b)*a;

        if (amari > a) {
            result += a;
        } else {
            result += amari;
        }
        System.out.println(result);
    }
}