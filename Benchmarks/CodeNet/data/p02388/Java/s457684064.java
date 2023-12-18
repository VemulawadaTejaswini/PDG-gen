import java.io.*;
import java.util.*;

class Main
{

	static Scanner sc;

	public static void main( String[] args ) throws IOException
	{
		sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
	    int x = sc.nextInt();
	    System.out.println(x * x * x);
	}
}
