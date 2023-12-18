import java.util.Scanner;

/**
 * A - Not
 * 0 以上 1 以下の整数 x が与えられます。
 * x が 0 なら 1 を、1 なら 0 を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );

        System.out.println( sc.nextInt() == 0 ? 1 : 0 );

        sc.close();
    }
}
