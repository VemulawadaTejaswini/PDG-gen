import java.util.*;
   
public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
          
        double a				= scan.nextDouble();
        double b				= scan.nextDouble();
        double C				= scan.nextDouble();
		final double radianC	= Math.toRadians( C );
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