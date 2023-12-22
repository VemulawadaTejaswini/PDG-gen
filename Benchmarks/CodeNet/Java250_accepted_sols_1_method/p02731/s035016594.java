/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double ans = (n*n*n)/27.0;
		System.out.printf("%.12f",ans);
		
	}
}