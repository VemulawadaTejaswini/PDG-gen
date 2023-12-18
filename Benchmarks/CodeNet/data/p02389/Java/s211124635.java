import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String A,B;
		int a,b,s,l;
		
		Scanner in = new Scanner(System.in);
		
		A = in.next();
		B = in.next();
		
		a = Integer.parseInt(A);
		b = Integer.parseInt(B);

		s = a * b;
		l = 2 * (a + b);
		
		System.out.println(s + " " + l);
	}
}