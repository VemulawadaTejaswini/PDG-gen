import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
public class Main {
	public static final double PI = 3.1415926;
	
    public static void main( String args[] ) throws IOException {
		BufferedReader bufRed	= new BufferedReader( new InputStreamReader( System.in ) );
        String[] dat			= bufRed.readLine().split( " " );
        int a, b, C;
		a = Integer.parseInt(dat[0]);
        b = Integer.parseInt(dat[1]);
        C = Integer.parseInt(dat[2]);
		
		final double radianC	= C * PI / 180.0;
		final double ab				= a * b;
          
        final double sinC = Math.sin( radianC );
        final double cosC = Math.cos( radianC );
          
          
        // S
        double S = ab * sinC / 2;
          
        // L
        double L = a + b + Math.sqrt( a * a + b * b - 2 * ab * cosC );
          
        // h
        double h = b * sinC;
          
        System.out.print(S + "\n" + L + "\n" + h + "\n");
          
    }
      
}