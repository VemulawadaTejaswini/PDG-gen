import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * C - Tsundoku
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();   // 机Aに積んである本の数
        int m = sc.nextInt();   // 机Bに積んである本の数
        int k = sc.nextInt();   // 限界合計所要時間
//        int[] a = new int[n];   // Aに積んである本を読むのに必要な時間
//        int[] b = new int[m];   // Bに積んである本を読むのに必要な時間
        List<Integer> ab = new ArrayList<Integer>();

        for( int i = 0; i < n + m; i++ ) {
            ab.add( sc.nextInt() );
        }
        Collections.sort( ab );

        int result = 0;
        for ( int time : ab ) {
            k -= time;
            if( k < 0 ) break;

            ++result;
        }

        System.out.println( result );

        sc.close();
    }
}
