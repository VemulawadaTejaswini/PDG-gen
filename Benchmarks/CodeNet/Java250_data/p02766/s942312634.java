import java.util.Scanner;

/**
 * B - Digits
 * 整数 N を K 進数で表したとき、何桁になるかを求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 整数N
        int n = sc.nextInt();
        // 何進法か
        int k = sc.nextInt();

        if( k == 10 ) {
            System.out.println( String.valueOf( n ).length() );
        }
        else {
            String baseK = Integer.toString( n, k );
            System.out.println( String.valueOf( baseK ).length() );
        }

        sc.close();
    }
}