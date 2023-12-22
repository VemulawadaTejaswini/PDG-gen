import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String []s=br.readLine().split(" ");
		String s=br.readLine(), ans="No";
		char ch[]=s.toCharArray();
		
				
		int len=s.length();
		if(len>=6)
			if(ch[2]==ch[3] && ch[4]==ch[5])
				ans="Yes";		
		
		out.println(ans);
		
		
	}
	
	
}


