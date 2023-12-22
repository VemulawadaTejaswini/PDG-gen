class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int sum;
		int digitNum = 0;
		
		while( sc.hasNext() )
		{
			sum = sc.nextInt() +  sc.nextInt();
			
			digitNum = 0;
			while( sum > 0 )
			{
				sum /= 10;
				digitNum++;
			}
			System.out.println( digitNum );
		}
	}
}