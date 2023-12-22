import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int K=Integer.parseInt(s[1]);
		
		int a[]=new int[N+1]; //you can use a set instead of array
		
		boolean flag=false;
		String ans="";
		int c=0;
		
		for(int i=0;i<K;i++)
		{
			int d=Integer.parseInt(br.readLine());
			s=br.readLine().split(" ");
			for(int j=0;j<d;j++)
			{
				int x=Integer.parseInt(s[j]);
				if(a[x]==0)
				{
					a[x]=1;
					c++;
				}				
			}
			
		}
		
		out.println(N-c);
		
	}
	
	
}


