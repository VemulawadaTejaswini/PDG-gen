import java.io.*;
import java.util.*;

class Main
{
	static Scanner sc;
	
	public static void main( String[] args ) throws IOException
	{
	sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
		int a = sc.nextInt();
		int h = a / 3600, m = (a - h * 3600) / 60, s = a - h * 3600 - m * 60;
		System.out.printf("%s\n", "" + h + ":" + m + ":" +s);
	}
}
