import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String s = in.nextLine();

        if( n % 2 == 1 ){
            System.out.println( "No" );
            return;
        }

        String front = s.substring( 0 , n / 2 );
        String back = s.substring( n / 2 );

        System.out.println( front.equals(back) ? "Yes" : "No" );

    }

}
