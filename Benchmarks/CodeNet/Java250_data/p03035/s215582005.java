import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner e = new Scanner(System.in);
		
		int a = e.nextInt();
		int b = e.nextInt();
		
		if(a <= 5)
		{
			System.out.println("0");
		}
		else if(a >= 13)
		{
			System.out.println(b);
		}
		else if(a >= 6 || a <= 12)
		{
			System.out.println(b / 2);
		}
	}
}