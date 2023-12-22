import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		int evc=0,app=0;
		
		for(int i=0;i<N;i++)
		{
			int x= Integer.parseInt(s[i]);
			
			//if even then check 3 or 5
			if((x&1)!=1)
			{
				evc++;
				if(x%3==0 || x%5==0)
					app++;		
			}	
		}
		
		if(evc==app)
			out.println("APPROVED");
		else
			out.println("DENIED");
	
	}
}


