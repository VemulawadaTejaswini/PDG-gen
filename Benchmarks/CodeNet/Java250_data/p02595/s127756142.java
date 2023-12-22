import java.util.Scanner;

/**
 * B - Distance
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt(); // 2次元平面上にある点の数
        int d = sc.nextInt(); // 原点からD以下の点を求める

        int result = 0;
        for( int i = 0; i < n; i++ ) {
            double calc = Math.sqrt( Math.pow( sc.nextInt(), 2 ) + Math.pow( sc.nextInt(), 2 ) );
            if( calc <= d ) result++;
        }

        System.out.println( result );

        sc.close();
    }
}