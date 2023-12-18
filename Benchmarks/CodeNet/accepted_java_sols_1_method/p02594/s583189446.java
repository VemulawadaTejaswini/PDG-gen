/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x >= 30)
		    System.out.println("Yes");
		else
	        System.out.println("No");
	}
}