import java.util.*;
 
public class Main {
	
	public static final int A = 0;
	public static final int B = 1;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		int width = x2 - x1;
		int height = y2 - y1;
		
		double distance = Math.sqrt( ( width * width + height * height ) );
		System.out.println( distance );
		
	}
	
}