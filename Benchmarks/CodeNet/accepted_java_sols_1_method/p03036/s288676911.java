import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner e = new Scanner(System.in);
		
		int r = e.nextInt();
		int d = e.nextInt();
		int x = e.nextInt();
		
		for(int i = 0; i < 10; i++)
		{
			x = r * x - d;
			System.out.println(x);
		}
	}
}