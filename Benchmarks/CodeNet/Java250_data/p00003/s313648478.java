import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

class Main
{
	public static void main(String[] av)
	{
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();

		Vector<Boolean> bools = new Vector<Boolean>();
		for ( int i = 0; i < num; ++i )
		{
			Vector<Integer> ps = new Vector<Integer>();
			for ( int j = 0; j < 3; j++ )
			{
				ps.add( sc.nextInt() );
			}
			Collections.sort( ps );
			if ( ps.get(0)*ps.get(0) + ps.get(1)*ps.get(1)
				== ps.get(2)*ps.get(2) )
			{
				bools.add( true );
			}
			else
			{
				bools.add( false );
			}
		}
		for ( Boolean bool: bools )
		{
			if ( bool )
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
				
		