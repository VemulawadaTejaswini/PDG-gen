import java.util.Scanner;

/**
 * B - One Clue
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int k = sc.nextInt();   // 黒石の数
        int x = sc.nextInt();   // 必ず黒石である座標

        int before = x - ( k - 1 );
        int after = x + ( k - 1 );

        for( int i = before; i <= after; i++ ) {
            if( i > before ) System.out.print( " " );
            System.out.print( i );
        }
        System.out.println();

        sc.close();
    }
}