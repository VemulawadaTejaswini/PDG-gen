import java.io.*;
class Main {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();
        String[] p = line.split( " " );
        int p1 = Integer.parseInt( p[ 0 ] );
        int p2 = Integer.parseInt( p[ 1 ] );
        String ans = "";
        if( p1 < p2 ) {
            ans = "a < b";
        } else if( p1 > p2 ) {
            ans = "a > b";
        } else {
            ans = "a == b";
        }
        System.out.println( ans );
    }
}

        