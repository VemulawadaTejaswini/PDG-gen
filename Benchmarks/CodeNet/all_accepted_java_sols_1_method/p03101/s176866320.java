import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{

	
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		
		System.out.println((r*c)-(c*m1+r*m2)+(m1*m2));
		
	}
}