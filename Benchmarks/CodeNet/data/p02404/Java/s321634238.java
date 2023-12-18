/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int xw, yw;
		String tmp;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			yw = sc.nextInt();
			xw = sc.nextInt();
			
			prtLine(xw);	//上
			
			for (int j = 0 ; j <yw-2; j++) {
				System.out.print("#");
				for (int i = 0 ; i <xw-2; i++) {
					System.out.print(".");
				}
				System.out.println("#");
			}
				
			prtLine(xw);	//下
			
			
			System.out.println("");
		}
		
	}
	
	static void prtLine(int length) 
	{
		for (int i = 0 ; i <length; i++) {
			System.out.print("#");
		}	
		System.out.println("");
		return;
		
	}
}
