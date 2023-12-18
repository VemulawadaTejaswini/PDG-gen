import java.util.Scanner;

/**
 * A - Five Variabless
 * 変数xのうち、すぬけくんが0を代入した変数はどれか
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        for( int i = 0; i < 5; i++ ) {
            int x = sc.nextInt();
            if( x == 0 ) {
                System.out.println( i + 1 );
                break;
            }
        }

        sc.close();
    }
}
