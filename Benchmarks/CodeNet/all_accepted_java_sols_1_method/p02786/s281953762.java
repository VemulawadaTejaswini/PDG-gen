/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		int p=(int)(Math.log(n)/Math.log(2));
		p++;
		System.out.println((long)(Math.pow(2,p)-1));
		
	}
}