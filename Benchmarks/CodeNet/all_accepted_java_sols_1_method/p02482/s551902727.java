import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)
	{
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	int x2 = in.nextInt();
		if (x>x2)
		{
			System.out.println("a > b");
		}else if(x<x2)
		{
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}

	
	}
}