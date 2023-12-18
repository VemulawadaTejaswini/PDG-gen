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
		long H = Long.parseLong(s[0]);
		long N = Long.parseLong(s[1]);
		long sum=0;
		
		s=br.readLine().split(" ");
		for(int i=0;i<N;i++)
			sum+=Long.parseLong(s[i]);
			
				
		if(sum>=H)
			out.println("Yes");
		else
			out.println("No");
	
	}
}


