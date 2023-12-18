import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int a[]=new int [n.length()+1];
		int ans=0;
		for(int i=0;i<n.length();i++)
		{
			a[i]=n.charAt(i)-'0';
		}
		for(int i=0;i<n.length();i++)
		{
			ans=ans+a[i];
		}
		if(ans%9==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}