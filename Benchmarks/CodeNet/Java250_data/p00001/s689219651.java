
class Main
{
	public static void main(String[] av)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.ArrayList<Integer> vec = new java.util.ArrayList<Integer>();
		while( sc.hasNextInt() )
		{
			vec.add( sc.nextInt() );	
		}
		java.util.Collections.sort( vec );
		java.util.Collections.reverse( vec );
		for ( int i = 0; i < 3; ++i )
		{
			System.out.println( vec.get(i) );
		}
	}
}