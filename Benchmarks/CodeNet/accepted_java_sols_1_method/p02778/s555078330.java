import java.util.Scanner;

/**
 * B - I miss you...
 * 文字列 S が与えられます。
 * S のすべての文字を x で置き換えて出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        String s = sc.next();   // 英小文字のみからなる文字列

        StringBuilder reseult = new StringBuilder();
        for( int i = 0; i < s.length(); i++ ) {
            reseult.append( "x" );
        }

        System.out.println( reseult );

        sc.close();
    }
}