import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(br.readLine());
		if(n==1)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
		}
	catch(Exception e){}
}}