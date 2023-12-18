import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		long i1 = Long.parseLong(in.next());
		long i2 = Long.parseLong(in.next());
		
		System.out.println(i1*i2 + " " + (2*i1 + 2*i2));
	}
}