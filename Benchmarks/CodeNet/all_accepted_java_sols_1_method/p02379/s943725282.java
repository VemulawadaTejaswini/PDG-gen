import java.util.*;
 
public class Main {
	
	public static final int A = 0;
	public static final int B = 1;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double width = x2 - x1;
		double height = y2 - y1;
		
		double distance = Math.sqrt( ( width * width + height * height ) );
		System.out.println( distance );
		
	}
	
}