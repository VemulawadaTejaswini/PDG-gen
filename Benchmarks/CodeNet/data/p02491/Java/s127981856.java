import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		int d, r;
		double f;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		d = a / b;
		r = a % b;
		f = (double)a / b;
		
		System.out.print(d + " " + r);
		System.out.println(String.format(" %1$3f", f));
	}
}