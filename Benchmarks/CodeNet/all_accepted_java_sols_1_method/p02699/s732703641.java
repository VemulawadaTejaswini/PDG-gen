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
		
		long S=Long.parseLong(s[0]);
		long W=Long.parseLong(s[1]);
		
		
		if(W>=S)
			out.println("unsafe");
		else
			out.println("safe");
		
			
			
		
		
	}
	
	
}


