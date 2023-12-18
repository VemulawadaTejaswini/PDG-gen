class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf( "%d %d\n" , find2( a, b ), find1( a, b ) );
	}
	static int find1( int a, int b )
	{
		int ac = a;
		int bc = b;
		while( a != b )
		{
			if( a < b )a += ac;
			if( a > b )b += bc;
		}
		
		return a;
	}
	static int find2( int a, int b )
	{
		int yakusu = 0;
		
		if( a > b )
		{
			for( int i = 1 ; i <= b ; i++ ){
				if( a%i == 0 && b%i == 0 )yakusu = i;
			}
		}else{
			for( int i = 1 ; i <= a ; i++ ){
				if( a%i == 0 && b%i == 0 )yakusu = i;
			}
		}
		
		return yakusu;
	}
}