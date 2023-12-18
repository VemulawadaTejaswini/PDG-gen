public class
Main {
	private void
	sort ( int[ ] a )
	{
		for ( int i = 0; i < a.length; ++i )
		{
			int temp;
			int t = i;
			
			for ( int j = t + 1; j < a.length; ++j )
			{
				if ( a[ j ] < a[ t ] )
					t = j;
			}
			
			temp   = a[ i ];
			a[ i ] = a[ t ];
			a[ t ] = temp;
		}
	}
 
	public static void
	main ( String[ ] args )
	{
		java.util.Scanner sc = new java.util.Scanner ( System.in );
		int[ ] a;
 
		a = new int[ sc.nextInt ( ) ];
		for ( int i = 0; i < a.length; ++i )
			a[ i ] = sc.nextInt ( );
		sc.close ( );
 
		( new Main ( ) ).sort ( a );
		for ( int i = 0; i < a.length; ++i )
			System.out.print ( ( i == 0 ? "" : " " ) + a[ i ] );
		System.out.println ( );
	}
}