import java.util.Scanner;

/**
 * B - Multiplication 2
 * N 個の整数 A1,...,AN が与えられます。
 * A1×...×AN を求めてください。
 * ただし、結果が 10の18乗 を超える場合は、代わりに -1 を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();
        long[] a = new long[n];

        for ( int i = 0; i < n; i++ ) {
            a[i] = sc.nextLong();
            if ( a[i] == 0 ) {
                System.out.println(0);
                sc.close();
                return;
            }
        }

        // 最大値
        long max = ( long ) Math.pow( 10, 18 );

        // 入力値を計算
        long result = 1;
        for( int i = 0; i < n; i++ ) {

            try {
                result = Math.multiplyExact( result, a[i] );
                if( result > max ) {
                    System.out.println( "-1" );
                    sc.close();
                    return;
                }
            }
            catch ( Exception e ) {
                System.out.println( "-1" );
                sc.close();
                return;
            }
        }

        System.out.println( result );

        sc.close();
    }
}