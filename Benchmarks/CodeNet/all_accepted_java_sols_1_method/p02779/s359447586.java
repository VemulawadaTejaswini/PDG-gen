import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * C - Distinct or Not
 * 整数列 A1,A2,...,AN が与えられます。
 * この整数列のどの 2 つの要素も互いに異なるならば YES を、そうでないなら NO を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();   // 入力される整数列の整数の数
        // 整数列
        Set<Integer> a = new HashSet<>();
        for( int i = 0; i < n; i++ ) {
            a.add( sc.nextInt() );
        }

        System.out.println( ( n > a.size() ) ? "NO" : "YES" );

        sc.close();
    }
}