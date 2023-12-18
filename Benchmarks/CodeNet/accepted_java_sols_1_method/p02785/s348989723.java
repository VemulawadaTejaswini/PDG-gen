import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int k = Integer.parseInt( params[1] );

        params = sc.nextLine().split(" ");
        long[] hs = new long[n];
        for( int i = 0 ; i < n ; i++ ){
            hs[i] = Long.parseLong( params[i] );
        }

        Arrays.sort(hs);

        if( n <= k ){
            System.out.println( 0 );
            return;
        }

        long ans = 0;
        for( int i = 0 ; i < n - k ; i++ ){
            ans += hs[i];
        }

        System.out.println( ans );

    }

}
