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
		boolean flag = true;
		String word = sc.next();
		char last = word.charAt(word.length()-1);
		while(sc.hasNext()) {
			word = sc.next();
			char first = word.charAt(0);
			if(last == first) {
				last = word.charAt(word.length()-1);
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}