class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		double money = (100000*(1+0.05*n)+500)/100*100;
		
		System.out.printf( "%.0f" ,money );
	}
}