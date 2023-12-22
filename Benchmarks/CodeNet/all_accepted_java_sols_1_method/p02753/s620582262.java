import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		if(s.charAt(0)!=s.charAt(1)||s.charAt(0)!=s.charAt(2)||s.charAt(1)!=s.charAt(2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
	