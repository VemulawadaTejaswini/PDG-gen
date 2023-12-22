
import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		int a[]=new int[n];
		int min[]=new int[n];
		//boolean flag=true;
		int c=0,minval=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
			
		min[0]=a[0];
		minval=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<minval)
			{
				minval=a[i];
				min[i]=minval;
			}	
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<=min[i])
				c++;
			
		}
		out.println(c);
	}
}


