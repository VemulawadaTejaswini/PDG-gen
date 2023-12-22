import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		String s=in.next();
		int ans=0;
		for(int i=0;i<26;i++)
		{
			int check=0;
			for(int j=0;j<4;j++)
			{
				if(s.charAt(j)-'A'==i)
				{
					check++;					
				}				
			}
			if(check!=0&&check!=2)
			{
				ans=1;
			}			
		}
		if(ans==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
	