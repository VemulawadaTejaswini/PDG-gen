/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
        
		while (true) {
			String num = scan.next();
			
			if (num.equals("0")) {
				break;
			}
			
			list.add(num);
		}

		for (String s : list) {
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				sum += Integer.parseInt(s.substring(i, i+1));
			}
			System.out.println(sum);
		}    	
	}
}