import java.util.Scanner;

/**
 * A - Harmony
 * 相違なる整数 A, B があります
 * |A−K|=|B−K| となるような整数 K を出力してください。
 * そのような整数が存在しなければ、代わりに IMPOSSIBLE を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 1の容器の容量
        int a = sc.nextInt();
        // 1の容器に入っている水の量
        int b = sc.nextInt();

        // 入力値A, Bが偶数と奇数で異なる場合、IMPOSSIBLE
        if( a % 2 != b % 2 ) {
            System.out.println( "IMPOSSIBLE" );
        } else {
            System.out.println( ( a + b ) / 2 );
        }

        sc.close();
    }
}