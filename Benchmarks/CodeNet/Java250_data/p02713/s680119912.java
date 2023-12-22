import java.util.Scanner;

/**
 * C - Sum of gcd of Tuples (Easy)
 * K∑a=1  K∑b=1  K∑c=1 gcd(a,b,c) を求めてください。
 * ただし、gcd(a,b,c) は a,b,c の最大公約数を表します。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        long n = sc.nextLong();

        long sum = 0;
        for( int i = 1; i <= n; i++ ) {
            long gcd1 = 0;
            for( int j = 1; j <= n; j++ ) {
                gcd1 = gcd( i, j );
                for( int k = 1; k <= n; k++ ) {
                    sum += gcd( gcd1, k );
                }
            }
        }

        System.out.println( sum );

        sc.close();
    }

    /*
     * 最大公約数を求める
     */
    private static long gcd( long m, long n ) {
        if( m < n ) return gcd(n, m);
        if( n == 0 ) return m;
        return gcd( n, m % n );
    }
}
