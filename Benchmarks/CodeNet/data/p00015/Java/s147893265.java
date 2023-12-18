import java.io.*;
import java.math.BigInteger;

class Main
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

		int n;
		n = Integer.parseInt( reader.readLine() );
	
		for ( int i = 0; i < n; i++ )
		{
			BigInteger a, b;
			String in;

			in = reader.readLine();
			a = new BigInteger( in );

			in = reader.readLine();
			b = new BigInteger( in );

			System.out.println( a.add( b ) );
		}
	}
}