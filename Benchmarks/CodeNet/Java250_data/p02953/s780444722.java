
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
					
		boolean flag=true;
		
		for(int i=n-2;i>=0;i--)
		{
			if(a[i] > a[i+1])
				a[i]--;	
		}
		
		for(int i=1;i<n;i++)
		{
			if(a[i]-a[i-1]<0)
			{
				flag=false;
				//break;
			}
		}
		
		if(flag == true)
			System.out.println("Yes");	
		else
			System.out.println("No");		
	}
}


