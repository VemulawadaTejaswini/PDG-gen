/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String inputline = sc.next();
		String[] inputArray = inputline.split("\\s");
		
		int input1;
		int input2;
		input1 = Integer.parseInt(inputArray[0]);
		input2 = Integer.parseInt(inputArray[1]);
		
		int swap;
		if (input1 > input2) {
			
			swap = input2;
			input2 = input1;
			input1 = swap;
		}
		
		// ユークリッドの互除法を用いた最大公約数を
		swap = 0;
		while ((swap = input1 % input2) != 0) {
			input1 = input2;
			input2 = swap;
		}
		
		System.out.println(input2);
	}
}
