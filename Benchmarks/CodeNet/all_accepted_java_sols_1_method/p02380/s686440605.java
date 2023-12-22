import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
public class Main {
    public static void main( String args[] ) throws IOException {
		BufferedReader bufRed	= new BufferedReader( new InputStreamReader( System.in ) );
        String[] dat			= bufRed.readLine().split( " " );
        int a, b, C;
		a = Integer.parseInt(dat[0]);
        b = Integer.parseInt(dat[1]);
        C = Integer.parseInt(dat[2]);
		
		double radianC	= Math.toRadians( C );
		double ab		= a * b;
        double sinC		= Math.sin( radianC );
        double cosC		= Math.cos( radianC );
        double S		= ab * sinC / 2;
        double L		= a + b + Math.sqrt( a * a + b * b - 2 * ab * cosC );
        double h		= b * sinC;
          
        System.out.print(S + "\n" + L + "\n" + h + "\n");
          
    }
      
}