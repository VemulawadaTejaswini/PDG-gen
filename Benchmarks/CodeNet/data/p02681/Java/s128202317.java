import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
		String S= br.readLine();
		String T= br.readLine();
		String ans="";
		
		char ch[]=S.toCharArray();
		char ch1[]=T.toCharArray();
		boolean flag=true;
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch1[i])
			{
				flag=false;
				break;
			}
		}
		
		ans = flag==true? "Yes" : "No";
			
		out.println(ans);
		
	}
	
	
}


