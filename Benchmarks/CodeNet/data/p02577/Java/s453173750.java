import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n="";
		n=br.readLine();
		long ans=0;
		for(int i=0;i<n.length();i++)
		{
			ans+=Long.parseLong(""+n.charAt(i));
		}
		if(ans%9==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}		