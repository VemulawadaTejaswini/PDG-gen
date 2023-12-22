// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;
 
// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println(((n-m)*(n-m+1))/2-n);
	}
}