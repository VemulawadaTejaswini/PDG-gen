import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=false;
		String ans="";
		
		String S = br.readLine();
		
		if(S.charAt(1) == 'B')
			ans="ARC";
		else
			ans="ABC";
		
		
		out.println(ans);
		
	}
	
	
}


