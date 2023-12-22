import java.util.Scanner;

/**
 * B - Substring
 * 2 つの文字列 S, T が与えられます。
 * T が S の部分文字列となるように、S のいくつかの文字を書き換えます。
 * 少なくとも何文字書き換える必要がありますか？
 * ただし、部分文字列とは連続する部分列のことを指します。例えば、xxx は yxxxy の部分文字列ですが、xxyxx の部分文字列ではありません。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        String s = sc.next();
        String t = sc.next();

        int result = t.length();
        for( int i = 0; i < s.length() - ( t.length() - 1 ); i++ ) {
            int charCnt = 0;
            String subStr = s.substring( i, i + t.length() );
            if( subStr.equals( t ) ) {
                result = 0;
                break;
            }
            else {
//                char[] temp = new char[t.length()];
                for( int j = 0; j < t.length(); j++ ) {
//                    temp[j] = subStr.charAt(j);
                    if( t.charAt( j ) != subStr.charAt( j ) ) ++charCnt;
                }
            }
            if( result > charCnt ) result = charCnt;
        }

        System.out.println( result );

        sc.close();
    }
}
