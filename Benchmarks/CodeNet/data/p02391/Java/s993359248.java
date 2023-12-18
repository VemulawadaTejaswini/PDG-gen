import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 入力値を受け取る
        Scanner sc = new Scanner(System.in);
        // 入力された２つの整数をaとbへ代入する
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 大小関係を判定する
        String sign = "";
        if( a < b ) {
            sign = "<";
        } else if( a > b ) {
            sign = ">";
        } else if( a == b ) {
            sign = "==";
        }

        // 大小関係を出力する
        System.out.printf("a %s b\n", sign);
        sc.close();
    }
}
