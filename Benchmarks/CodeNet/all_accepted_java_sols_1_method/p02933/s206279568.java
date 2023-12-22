import java.util.Scanner;

/**
 * A - Red or Not
 * 整数 aと、英小文字からなる文字列 sが入力されます。
 * a が 3200以上なら s と出力し、a が 3200未満なら red と出力するプログラムを書いてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        String s = sc.next();

        if( a >= 3200 ) {
            System.out.println( s );
        } else {
            System.out.println( "red" );
        }
    }
}