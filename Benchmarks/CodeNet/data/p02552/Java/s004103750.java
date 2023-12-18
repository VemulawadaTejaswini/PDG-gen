/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x == 1)
			System.out.println(0);
		else if(x == 0)
			System.out.println(1);
	}
}