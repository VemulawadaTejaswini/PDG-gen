/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String s = sc.next();
		if(Integer.valueOf(a)>=3200)
		System.out.println(s);
		else 
		System.out.println("red");
	}
}