/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if(s.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(s.equals("Cloudy")) {
			System.out.println("Rainy");
		}else if(s.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}
}