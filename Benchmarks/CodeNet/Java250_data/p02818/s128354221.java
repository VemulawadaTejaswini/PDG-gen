import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        long a = Long.parseLong( params[0] );
        long b = Long.parseLong( params[1] );
        long k = Long.parseLong( params[2] );
        
        if( a == 0 && b == 0 ){
            System.out.println( "0 0" );   
        }
        else if( a > k ){
            System.out.println( "" + ( a - k ) + " " + b );
        }
        else if( a == k ){
            System.out.println( "" + 0 + " " + b );
        }
        else {
            System.out.println( "0 " + ( ( b - ( k - a ) ) > 0 ? ( b - ( k - a ) ) : 0 ) );
        }

    }

}