
class q2
{
	public static void main(string[] av)
	{
		java.util.scanner sc = new java.util.scanner(system.in);
		java.util.arraylist<integer> vec = new java.util.arraylist<>();
		while( sc.hasnextint() )
		{
			vec.add( sc.nextint() );	
		}
		java.util.collections.sort( vec );
		java.util.collections.reverse( vec );
		for ( int i = 0; i < 3; ++i )
		{
			system.out.println( vec.get(i) );
		}
	}
}