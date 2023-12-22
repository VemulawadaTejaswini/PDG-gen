/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c = 0;
		for(int i = 0;i<2;i++){
			c += sc.nextInt()%2;
		}if(c==2)System.out.println("Yes");
		else System.out.println("No");
	}
}