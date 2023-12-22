import java.util.Scanner;

/**
 * B - Count ABC
 * 英大文字のみからなる長さ N の文字列 S があります。
 * S の連続する部分列 (入出力例をご覧ください) として ABC がいくつ含まれるかを求めてください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();   // 文字列Sの長さ
        String s = sc.next();   // 英大文字のみからなる文字列

        String replaceStr = s.replaceAll( "ABC", "" );
        System.out.println( ( n - replaceStr.length() ) / 3 );

        sc.close();
    }
}