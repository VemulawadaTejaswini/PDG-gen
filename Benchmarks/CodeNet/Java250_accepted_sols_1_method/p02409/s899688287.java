/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int bill = 4;
		int floor = 3;
		int room = 10;

		int [][][] box = new int[bill][floor][room];

		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		//System.out.println(max);
		
		for (int i = 0; i < max ;i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			//System.out.println(b + " " + f + " " + r + " "  + v);
			
			box[b-1][f-1][r-1] = box[b-1][f-1][r-1] + v;
		}

		//result
		for (int b = 0; b < bill; b++) {
			for (int f = 0; f < floor; f++) {
				for (int r = 0; r < room; r++) {
					System.out.print(" " + box[b][f][r]);
				}
				System.out.println("");
			}
			if (b < bill-1) {
				System.out.println("####################");
			}
		}
		
		
	}
}
