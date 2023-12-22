/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	   for(int i=1 ; i<= 5 ; i++) {
	       int num = in.nextInt();
	       if(num == 0)
	       System.out.println(i);
	   }
	}
}