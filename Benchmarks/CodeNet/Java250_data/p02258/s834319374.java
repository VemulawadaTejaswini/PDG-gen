class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int n = sc.nextInt();
		int max = -1000000000, min = sc.nextInt();
		int in;
		for( int ct = 1 ; ct < n ; ct++ ){
			in = sc.nextInt();
			if( in-min > max )max = in-min;
			if( in < min )min = in;
		}
		System.out.printf( "%d\n" , max );
	}
}