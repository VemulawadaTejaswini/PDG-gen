import java.util.Scanner;

public class Main
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		int n, five = 0, seven = 0;
		for ( int i = 0; i < 3; i++ )
		{
			n = sc.nextInt ();
			if ( n == 5 )
			{
				five++;
			}
			else if ( n == 7 )
			{
				seven++;
			}
		}

		if ( five == 2 && seven == 1 )
		{
			System.out.println ( "YES" );
		}
		else
		{
			System.out.println ( "NO" );
		}
	}

}
