/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String stdin;
		while( (stdin=br.readLine()) != null )
		{
			String params[] = stdin.split( " " );
			if( params.length >= 2 )
			{
				int a = Integer.parseInt( params[0] );
				int b = Integer.parseInt( params[1] );
				System.out.println( gcd(a,b) + " " + lcm(a,b) );
			}
		}
	}
	
	public static int gcd( int a, int b )
	{
		return (b==0)? a : gcd(b,a%b);
	}
	public static int lcm( int a, int b )
	{
		return a / gcd(a,b) * b;
	}
}