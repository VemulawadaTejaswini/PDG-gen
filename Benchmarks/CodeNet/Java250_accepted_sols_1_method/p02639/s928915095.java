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
		
		int ans=0;
		
		for(int i=0;i<5;i++)
		{
			int a=Integer.parseInt(s[i]);
				if(a==0)
					ans=i+1;
		}
			
		out.println(ans);
		
	}
	
	
}


