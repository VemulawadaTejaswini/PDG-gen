import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		if (c.equals(s))
			a--;
		else
			b--;
		System.out.println(a + " " + b);
	} 
}
