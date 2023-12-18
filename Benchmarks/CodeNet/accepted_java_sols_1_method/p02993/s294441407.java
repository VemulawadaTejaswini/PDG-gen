import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		String s=in.next();
		int flag=0;
		for(int i=1;i<4;i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Good");
		else
			System.out.println("Bad");
	}
}
	