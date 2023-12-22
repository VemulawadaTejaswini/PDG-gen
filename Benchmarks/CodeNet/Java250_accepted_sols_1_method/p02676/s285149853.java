import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String ans="";
		//int c=0;
		
		
		int K = Integer.parseInt(br.readLine());
		String s=br.readLine();
		
		int len=s.length();
	
		if(len<=K)
			ans=s;
		
		else
			ans=s.substring(0,K)+"...";
		
		out.println(ans);
		
	}
	
	
}


