import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().split(" ");
		int a=0;float b=0;int c=0;
		float ti=0;
		a=Integer.parseInt(arr[0]);
		b=Float.parseFloat(arr[1]);
		c=Integer.parseInt(arr[2]);
		ti=(float)(a/c);
		//System.out.println(ti);
		if(ti<=b)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	catch(Exception e){}
}}