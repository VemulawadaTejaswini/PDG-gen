class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int[] street = new int[sc.nextInt()+1];
		int   n = sc.nextInt();
		
		for( int w = 1 ; w < street.length ; w++ )
			street[w] = w;
			
		String in;
		String[] sp;
		int work = 0;
		int change1 = 0;
		int change2 = 0;
		for( int i = 0 ; i < n ; i++ )
		{
			in = sc.next();
			sp = in.split( "," );
			change1 = Integer.parseInt(sp[0]);
			change2 = Integer.parseInt(sp[1]);
			
			work = street[change1];
			street[change1] = street[change2];
			street[change2] = work;
		}
		for( int w = 1 ; w < street.length ; w++ )
			System.out.println( street[w] );
	}
}