class Main
{
	static int[] pointer;
	static int[] rank;
	
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		pointer = new int[n];
		rank    = new int[n];
		for( int a = 0 ; a < n ; a++ )
		{
			pointer[a] = a;
			rank[a]    = 0;
		}
		
		char sw;
		int x,y;
		for( int a = 0 ; a < q ; a++ )
		{
			sw = ( sc.next().toCharArray()[0] );
			x  = sc.nextInt();
			y  = sc.nextInt();
			switch( sw )
			{
				case '0' : 
					union( x, y );
					break;
				case '1' :
					if( isSame( x, y ) )System.out.println( 1 );
					else System.out.println( 0 );
					break;
			}
		}
	}
	static int findRoot( int x )
	{
		if( x != pointer[x] )
			pointer[x] = findRoot( pointer[x] );
		return pointer[x];
	}
	static boolean isSame( int x, int y )
	{
		if( findRoot( x ) == findRoot( y ) )return true;
		return false;
	}
	static void union( int x, int y )
	{
		link( findRoot( x ), findRoot( y ) );
	}
	static void link( int x, int y )
	{
		if( !isSame( x, y ) )
		{
			if( rank[x] < rank[y] )
			{
				pointer[x] = y;
			}else if( rank[x] > rank[y] )
			{
				pointer[y] = x;
			}else
			{
				pointer[x] = y;
				rank[y]++;
			}
		}
	}
}