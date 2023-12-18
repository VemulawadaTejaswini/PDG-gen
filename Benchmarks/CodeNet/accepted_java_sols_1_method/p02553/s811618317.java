import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long a1 = a*c;
		long res =a1;
		long a2 = a*d;
		if(a2>res)
			res=a2;
		long a3 = b*c;
		if(a3>res)
			res=a3;
		long a4 = b*d;
		if(a4>res)
			res=a4;
		System.out.println(res);
	}
}
