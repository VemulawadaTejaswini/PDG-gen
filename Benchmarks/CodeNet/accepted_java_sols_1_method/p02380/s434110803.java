import java.util.*;
 
public class Main {
	
	public static final int A = 0;
	public static final int B = 1;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();
		
		double sinC =Math.sin( Math.toRadians( C ) );
		double cosC = Math.cos( Math.toRadians( C ) );
		
		
		// S
		double S = a * b * sinC / 2;
		
		// L
		double L = a + b + Math.sqrt( a * a + b * b - 2 * a * b * cosC );
		
		// h
		double h = b * sinC;
		
		System.out.print(S + "\n" + L + "\n" + h + "\n");
		
	}
	
}