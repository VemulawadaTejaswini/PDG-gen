import java.io.*;
import java.util.*;

class Main
{

	static Scanner sc;

	public static void main( String[] args ) throws IOException
	{
		sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
	    int a = sc.nextInt(), b = sc.nextInt();
	    if(a == b) System.out.println("a == b");
	    if(a < b) System.out.println("a < b");
	    if(a > b) System.out.println("a > b");
	}
}
