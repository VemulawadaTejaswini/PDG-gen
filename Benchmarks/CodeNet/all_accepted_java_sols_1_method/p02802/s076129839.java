import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split( " " );
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );

        boolean[] acs = new boolean[n];
        int[] was = new int[n];
        int acCount = 0;
        int waCount = 0;

        for( int i = 0 ; i < m ; i++ ){

            params = in.nextLine().split( " " );
            int number = Integer.parseInt( params[0] );
            String result = params[1];

            if( !acs[number-1] ){
                if( "WA".equals( result ) ){
                    was[number-1]++;
                }
                if( "AC".equals( result ) ){
                    acs[number-1] = true;
                    acCount++;
                    waCount += was[number-1];
                }
            }

        }

        System.out.println( "" + acCount + " " + waCount );

    }

}
