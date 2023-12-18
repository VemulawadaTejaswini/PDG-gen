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
		int M=Integer.parseInt(s[1]);
		int a[] = new int[N];
		
		double totvot=0,x=0,c=0;
		
		s=br.readLine().split(" ");
		for(int i=0;i<N;i++)
		{
			a[i]=Integer.parseInt(s[i]);
			//out.println(a[i]);
			totvot+=a[i];
		}
		
		x=(int)ceil((1.0/(4.0*M))*totvot);
		//out.println(x);
		
		for(int i=0;i<N;i++)
		{
			if(a[i]>=x)
				c++;
		}
		
		if(c>=M)
			out.println("Yes");
		else
			out.println("No");
		
		
	}
	
	
}


