/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char ip = a.charAt(0);
		if(Character.isUpperCase(ip))
			System.out.println("A");
		else
			System.out.println("a");
		sc.close();
	}
}
