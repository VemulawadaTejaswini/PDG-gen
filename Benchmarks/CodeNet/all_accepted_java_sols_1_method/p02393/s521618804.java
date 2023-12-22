/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int work;
		int result[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		result[0] = sc.nextInt();
		result[1] = sc.nextInt();
		result[2] = sc.nextInt();
		
		
		if (result[0] > result[1]) {
			work = result[0];
			result[0] = result[1];
			result[1] = work;
		}

		if (result[1] > result[2]) {
			work = result[1];
			result[1] = result[2];
			result[2] = work;
		}
		//一番大きいのが一番右へ

		if (result[0] > result[1]) {
			work = result[0];
			result[0] = result[1];
			result[1] = work;
		}

		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
		
	}
}
