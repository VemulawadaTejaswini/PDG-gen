import java.util.Scanner;

/**
 * B - Roller Coaster
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        // 一緒に遊園地へ行った人数
        int n = sc.nextInt();
        // 身長制限
        int k = sc.nextInt();
        // ジェットコースターに乗れる人数：結果
        int result = 0;
        // 人数分の身長取得
        int[] a = new int[n];
        for( int i = 0; i < n; i++ ) {
//          System.out.println( "i : " + i );
          a[i] = sc.nextInt();
//          System.out.println( "a[" + i + "]" + a[i] );
          if( a[i] >= k ) {
              result++;
          }
        }
        System.out.println( result );
    }
}