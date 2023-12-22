import java.util.Scanner;

/**
 * B - String Palindrome
 * 長さが奇数である文字列 S が以下の条件をすべて満たすとき、S は「強い回文」であるといいます。
 *  ・S は回文である。
 *  ・N を S の長さとするとき、S の 1 文字目から (N−1)/2 文字目まで(両端含む)からなる文字列は回文である。
 *  ・S の (N+3)/2 文字目から N 文字目まで(両端含む)からなる文字列は回文である。
 * S が強い回文かどうかを判定してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 文字列S
        String s = sc.next();

        String result = "No";
        StringBuilder sbs = new StringBuilder( s );
        // 回文であるか
        if( s.equals( sbs.reverse().toString() ) ) {
            String n = s.substring( 0, ( s.length() - 1 ) / 2 );
//            System.out.println( "n:" + n );
            StringBuilder sbn = new StringBuilder( n );
            // 前の文字が回文であるか
            if( n.equals( sbn.reverse().toString() ) ) {
                String nLast = s.substring( ( s.length() - 1 ) / 2 + 1 );
 //               System.out.println( "nLast:" + nLast );
                StringBuilder sbnLast = new StringBuilder( nLast );
                // 前の文字が回文であるか
                if( nLast.equals( sbnLast.reverse().toString() ) ) {
                    result = "Yes";
                }
            }
        }
        System.out.println( result );

        sc.close();
    }
}