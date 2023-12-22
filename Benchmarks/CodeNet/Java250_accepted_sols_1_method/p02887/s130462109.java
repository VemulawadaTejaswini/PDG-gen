import java.util.Scanner;

/**
 * C - Slimes
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();      // スライムの数
        String s = sc.next();      // 文字列

        int result = 1;
        for( int i = 0; i < s.length(); i++ ) {
//            System.out.println("charat : " + s.charAt(i));
            if( i == 0 ) continue;
            if( s.charAt(i) != s.charAt(i - 1) ) {
                result++;
            }
        }

        System.out.println( result );

        sc.close();
    }
}