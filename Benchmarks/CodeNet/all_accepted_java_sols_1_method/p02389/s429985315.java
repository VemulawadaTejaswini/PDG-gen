import java.io.*;
 
class Main {
    public static void main( String[] args ) throws IOException
    {
        int width;
        int height;
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();
        String[] splitStr = line.split( " ", 0 );
        width = Integer.parseInt( splitStr[ 0 ] );
        height = Integer.parseInt( splitStr[ 1 ] );
        System.out.println( width* height + " " + 2 * ( width + height ) );
    }
}