import java.util.Scanner;

/**
 * B - Minor Change
 * 文字列 S, T が与えられます。
 * 次の操作を繰り返して S を T に変更するとき、操作回数の最小値を求めてください。
 * 操作：S の 1 文字を選んで別の文字に書き換える
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        String s = sc.next();
        String t = sc.next();

        int result = 0;
        for( int i = 0; i < s.length(); i++ ) {
            if( s.charAt( i ) != t.charAt( i ) ) ++result;
        }

        System.out.println( result );

        sc.close();
    }
}
