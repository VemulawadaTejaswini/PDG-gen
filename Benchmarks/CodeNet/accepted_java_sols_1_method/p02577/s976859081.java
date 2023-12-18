import java.util.Scanner;

/**
 * B - Multiple of 9
 * 整数 N が 9 の倍数であることと、N を十進法で表したときの各桁の数の和が 9 の倍数であることは同値です。
 * N が 9 の倍数であるか判定してください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        String n = sc.next(); // 整数

        int sum = 0;
        for( int i = 0; i < n.length(); i++ ) {
            sum += Integer.parseInt( n.substring( i, i + 1 ) );
        }

        System.out.println( ( sum % 9 == 0 ) ? "Yes" : "No"  );

        sc.close();
    }
}