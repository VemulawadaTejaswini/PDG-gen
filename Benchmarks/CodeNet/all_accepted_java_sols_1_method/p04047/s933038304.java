import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main ( String[] args ) throws Exception {
        Scanner in = new Scanner( System.in );
        int N = Integer.parseInt( in.next() );
        int[] L = new int[ N * 2 ];
        for ( int i = 0; i < N * 2; i++ ) {
            L[ i ] = Integer.parseInt( in.next() );
        }
        Arrays.sort( L );
        int cnt = 0;
        for ( int i = 0; i < N * 2; i++ ) {
            if ( i % 2 == 0 ) {
                cnt += L[ i ];
            }
        }
        System.out.println( cnt );
    }
}