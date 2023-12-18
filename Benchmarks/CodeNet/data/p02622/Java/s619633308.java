import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int res = 0;
		String s = sc.next();
		String t = sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i))
				res++;
		}
		System.out.println(res);
		sc.close();

	}
}
