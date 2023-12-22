import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		int flag=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0&&s.charAt(i-1)=='R')
				flag=1;
			if(i%2==1&&s.charAt(i-1)=='L')
				flag=1;
		}
		if(flag==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
	