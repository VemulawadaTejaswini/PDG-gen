/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%1000==0){
			System.out.println(0);
	}else{
		int mod = n%1000;
		System.out.println(1000-mod);
	}
}}