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
	List<String> taroList = new ArrayList<String>();
	List<String> hanakoList = new ArrayList<String>();

	int n = scan.nextInt();

	for (int i = 0; i < n; i ++) {
		taroList.add(scan.next());
		hanakoList.add(scan.next());	
	}

	int tP = 0;
	int hP = 0;

	for (int i = 0; i < n; i ++) {
		String t = taroList.get(i);
		String h = hanakoList.get(i);
		
		if (t.compareTo(h) > 0) {
			tP += 3;	
		}
		else if (t.compareTo(h) < 0) {
			hP += 3;
		}
		else {
			hP++;
			tP++;
		}
	}
		
	System.out.println(tP + " " + hP); 

}
}