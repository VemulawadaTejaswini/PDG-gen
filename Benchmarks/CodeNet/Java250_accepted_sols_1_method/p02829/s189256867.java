
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner io = new Scanner(System.in);
		int a = io.nextInt(), b = io.nextInt();
		if(a != 1 && b != 1) System.out.println(1);
		if(a != 2 && b != 2) System.out.println(2);
		if(a != 3 && b != 3) System.out.println(3);
	}
}