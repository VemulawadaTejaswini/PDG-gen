import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 文字を取得
        Scanner sc = new Scanner( System.in );
        String tapAll  = sc.next();
        String tap;
        String result = "Yes";

        for( int i = 0; i < tapAll.length(); i++ ) {
            tap = String.valueOf( tapAll.charAt( i ) );
            // 偶数
            if( ( i + 1 ) % 2 == 0 ) {
                if( !tap.equals( "L" ) && !tap.equals( "U" ) && !tap.equals( "D" ) ) {
                    result = "No";
                }
            }
            // 奇数
            else {
                if( !tap.equals( "R" ) && !tap.equals( "U" ) && !tap.equals( "D" ) ) {
                    result = "No";
                }
            }
        }
        System.out.println( result );
    }
}