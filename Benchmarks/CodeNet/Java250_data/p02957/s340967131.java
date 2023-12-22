import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		if((a+b)%2!=0)
		{
			System.out.println("IMPOSSIBLE");
		}
		else
		{
			System.out.println((a+b)/2);
		}
	}
}
	