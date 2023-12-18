import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//long X=Long.parseLong(br.readLine());
		String []s=br.readLine().split(" ");
		/*long X=Long.parseLong(s[0]);
		long N=Long.parseLong(s[1]);
		long C=Long.parseLong(s[2]);
		long K=Long.parseLong(s[3]);*/
		int X=Integer.parseInt(s[0]);
		int N=Integer.parseInt(s[1]);
		
		
		
		/*int a[][]=new int[N+1][N+1]; //you can use a set instead of array
		int ht[]=new int[N+1];
		boolean flag=false;*/
		//String ans="";
		
		int ans=0, mindiff=Integer.MAX_VALUE, diff=0;
		
		HashSet<Integer> h= new HashSet<Integer>();
		s=br.readLine().split(" ");
		
		for(int i=0;i<N;i++)
			h.add(Integer.parseInt(s[i]));
			
		for(int i=0;i<=101;i++)
		{
			if(!h.contains(i))
			{
				diff= abs(X-i);
				if(diff<mindiff)
				{
					mindiff=diff;
					ans=i;
				}
			}
		}
		
			//ans = flag==true? "Yes" : "No";
		
		out.println(ans);
		
	}
	
	
}


