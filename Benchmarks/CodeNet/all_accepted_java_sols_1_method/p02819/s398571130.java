import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		boolean found=false;
		int num=X,count=0,ans=-1;
		
		while(found!=true)
		{
			count=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					count++;
					
				if(count>0)//not a prime
					break;
			}
			if(count==0)
			{
				found=true;
				ans=num;
				break;		
			}
			
			else
				num++;
		}
		
		out.println(ans);
	
	}
}


