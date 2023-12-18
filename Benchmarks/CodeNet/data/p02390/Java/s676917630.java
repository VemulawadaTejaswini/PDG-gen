import java.io.*;
class Main {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int sec = Integer.parseInt( br.readLine() );
        int hh = sec / 3600;
        int mm = sec / 60;
        int ss = sec - ( hh * 3600 ) - ( mm * 60 );
        System.out.println( hh + ":" + mm + ":" + ss );
    }
}

         