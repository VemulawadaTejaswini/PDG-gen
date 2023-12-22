import java.util.Scanner;

/**
 * A - 500 Yen Coins
 * 高橋君は 500 円玉を K 枚持っています。
 * これらの総額が X 円以上である場合は Yes を、そうでない場合は No を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int k = sc.nextInt();   // 所持している500円玉の枚数
        int x = sc.nextInt();   // 所持金額

        System.out.println( k * 500 >= x ? "Yes" : "No" );

        sc.close();
    }
}