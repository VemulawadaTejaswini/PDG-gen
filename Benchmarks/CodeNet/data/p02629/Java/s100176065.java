import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		long n = scan.nextLong();
		char[] x = new char[26];
		for(int i=0;i<26;i++)
		{
			x[i]=(char)('a'+i);
		}
		String s="";
		while(n>0)
		{
			int a = (int)n%26;
			//System.out.println(a);
			if(a==0)
			{
				a=26;
				n=n/26-1;
			}
			else
				n/=26;
			s=x[a-1]+s;
		}
		System.out.println(s);
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			//int t= scan.nextInt();
			int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}