import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		double n = Math.sqrt(s.nextDouble());
		n = Math.floor(n);
		System.out.println((int)Math.pow(n, 2));
		
	}
}