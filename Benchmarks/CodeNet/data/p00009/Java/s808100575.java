class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		while( sc.hasNext() )
		{
			int n = sc.nextInt();
			int count = 0;
			
			for( int s = 2 ; s <= n ; s++ )
			{
				if( n % s == 0 )count++;
			}
			
			System.out.println( count );
		}
	}
}