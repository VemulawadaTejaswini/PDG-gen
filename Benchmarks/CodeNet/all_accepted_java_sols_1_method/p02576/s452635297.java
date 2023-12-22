import java.util.Scanner;

/**
 * A - Takoyaki
 * 高橋君はたこ焼きが好きです。
 * たこ焼き器を使うと、1 度に最大で X 個のたこ焼きを作ることができます。
 * これにかかる時間は作る個数によらず T 分です。
 * N 個のたこ焼きを作るためには何分必要ですか？
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();   // 作るたこ焼きの数
        int x = sc.nextInt();   // 一度に作れるたこ焼きの数
        int t = sc.nextInt();   // 1回作るのにかかる時間

        if( n <= x ) System.out.println( t );
        else System.out.println( ( ( int ) Math.ceil( ( double ) n / x ) ) * t );

        sc.close();
    }
}
