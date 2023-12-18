import java.util.Scanner;

/**
 * A - Curtain
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();   // 窓の実際の横の長さ
        int b = sc.nextInt();   // カーテン１枚の横の長さ

        int length = b * 2;

        if( length >= a ) {
            System.out.println( "0" );
        }
        else {
            System.out.println( a - length );
        }

        sc.close();
    }
}