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
        int n = sc.nextInt();
        int h = n / 3600;
        int m = n % 3600 / 60;
        int s = n % 3600 % 60;
        System.out.println(h + ":" + m + ":" + s);
	}
}
