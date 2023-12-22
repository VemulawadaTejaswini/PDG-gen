/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int h,w;
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0) break;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if ( i == 0 || i == h - 1 || j == 0 || j == w - 1)
						System.out.print("#");
					else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}