import java.io.*;
class Main {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();
        String[] p = line.split( " ", 0 );
        boolean flg = true;
        for( int i = 1 ; i < p.length ; i++ ) {
            if( Integer.parseInt( p[ i - 1 ] ) >= Integer.parseInt( p[ i ] ) ) {
                flg = false;
                break;
            }
        }
        if( flg ) {
            System.out.println( "Yes" );
        } else {
            System.out.println( "No" );
        }
    }
}