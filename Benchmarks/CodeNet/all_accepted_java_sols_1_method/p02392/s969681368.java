/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//文字列読込み
		Scanner sc = new Scanner(System.in);

		//結果格納
		int scInt;
		int befInt = 0; //前の値=0
		boolean result = true;

		while (sc.hasNext()) {
			//1行読込み
			scInt = sc.nextInt();
			if (befInt < scInt ) {
				result = true;	
			} else {
				result = false;
				break;
			}
			befInt = scInt;
		}
		
		if (result == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
