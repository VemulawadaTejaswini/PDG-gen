import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		String t=in.next();
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i)+""+t.charAt(i));
		}
	}
}
	