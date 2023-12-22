import java.util.Scanner;

/**
 * B - Strings with the Same Length
 * 英小文字のみからなる長さ N の文字列 S, T が与えられます。
 * S の 1 文字目、T の 1 文字目、S の 2 文字目、T の2 文字目、S の 3 文字目、...、S のN 文字目、T のN 文字目というように、
 * S の各文字と T の各文字を先頭から順に交互に文字を並べ、新しい文字列を作ります。この新しくできた文字列を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        StringBuilder result = new StringBuilder();
        for( int i = 0; i < n; i++ ) {
            result.append( s[i] ).append( t[i] );
        }

        System.out.println( result );

        sc.close();
    }
}