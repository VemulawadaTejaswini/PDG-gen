
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner( System.in );
    	
    	int x = scan.nextInt();
    	x = (int)Math.pow( x, 3 );
    	
    	System.out.println( x );
    }
}