import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int count = 0;
        if( n < 10 ) {
            System.out.println(n);
            return;
        }
        if( n < 100 ){
            System.out.println( 9 );
            return;
        }
        if( n < 1000 ){
            System.out.println( n - 99 + 9 );
            return;
        }
        if( n < 10000 ){
            System.out.println( 999 - 99 + 9);
            return;
        }
        if( n < 100000 ){
            System.out.println( n - 9999 + 999 - 99 + 9);
            return;
        }
        System.out.println( 90909 );

    }

}
