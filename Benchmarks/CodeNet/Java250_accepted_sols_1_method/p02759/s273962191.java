import java.util.Scanner;

/**
 * A - Duplex Printing
 * 高橋君は、全 N ページから成る書類を両面印刷します。
 * 両面印刷では、1 枚の紙に 2 ページ分のデータを印刷することが出来ます。
 * 最小で何枚の紙が必要か求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 書類の枚数
        int n = sc.nextInt();
        // 両面印刷したときのプリント枚数
        double result = ( double ) n / 2;
        System.out.println( ( int ) Math.ceil( result ) );

        sc.close();
    }
}