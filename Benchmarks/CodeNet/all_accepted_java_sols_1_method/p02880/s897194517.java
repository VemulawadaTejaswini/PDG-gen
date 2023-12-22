import java.util.Scanner;

/**
 * B - 81
 * 入力された数字が九九として表現できる場合はYes,できない場合はNoを出力する
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 確認する数値
        int n = sc.nextInt();
        String result = "No";

        // 81以下であること
        if( n <= 81 ) {
            for( int i = 1; i <= 9; i++ ) {
                if( n % i == 0 && n / i <= 9 ) {
                    result = "Yes";
                    break;
                }
            }
        }
        System.out.println( result );

        sc.close();
    }
}