import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		int S, r;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		S = a * b;
		r = (a + b) * 2;
		System.out.println(S + " " + r);
	}
}