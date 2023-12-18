import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		String classname;
		int before,after;
		
		while(cin.hasNext())
		{	
			classname = cin.next();
			before = cin.nextInt();
			after = cin.nextInt();
			
			System.out.println(classname+" "+(before+after)+" "+(before*200+after*300));
		}
	}
}