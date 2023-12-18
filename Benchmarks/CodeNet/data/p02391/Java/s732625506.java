/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
	    Integer int1 = scan.nextInt();
		Integer int2 = scan.nextInt();

	    if (int1 < int2) {
 			System.out.println(int1 + " < " + int2);
	    } else if (int1 > int2) {
 			System.out.println(int1 + " > " + int2);
	    } else {
 			System.out.println(int1 + " == " + int2);
	    }
	}
}