import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int n = Integer.parseInt(s);
		n = n * n * n;
		System.out.println(n);
	}
}