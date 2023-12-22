class Main
{
	static int count = 0;
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int n = sc.nextInt();
		int[] data = new int[n];
		for( int i = 0 ; i < n ; i++ )
			data[i] = sc.nextInt();
		data = bubbleSort( data, n );
		for( int i = 0 ; i < n-1 ; i++ )
			System.out.printf( "%d " ,data[i] );
		System.out.println( data[n-1] );
		System.out.println( count );
	}
	static int[] bubbleSort( int[] data, int n )
	{
		boolean flag = true;
		int work;
		while( flag )
		{
			flag = false;
			for( int j = n-1 ; j > 0 ; j-- )
			{
				if( data[j] < data[j-1] ){
					work = data[j];
					data[j] = data[j-1];
					data[j-1] = work;
					flag = true;//????????£??\????´?????????¨????????´???
					count++;
				}
			}
		}
		return data;
	}
}