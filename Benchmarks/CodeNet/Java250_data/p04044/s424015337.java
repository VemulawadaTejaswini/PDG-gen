import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		String[] str = new String[ sc.nextInt () ];
		sc.nextInt ();

		for ( int i = 0; i < str.length; i++ )
		{
			str[ i ] = sc.next ();
		}

		new Main ().run ( str );
	}

	public void run ( String[] str )
	{
		Arrays.sort ( str , 0 , str.length );

		String result = "";

		for ( int i = 0; i < str.length; i++ )
		{
			result = result + str[ i ];
		}

		System.out.println ( result );
	}

}
