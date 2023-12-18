import java.io.*;
import java.util.*;

class Main
{
	static Scanner sc;
	
	public static void main( String[] args ) throws IOException
	{
	sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if(a < b && b < c) System.out.printf("Yes\n");
		else System.out.printf("No\n");
	}
}
