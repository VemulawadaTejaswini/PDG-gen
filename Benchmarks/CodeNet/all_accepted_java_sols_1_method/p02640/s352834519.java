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
		
		int X=Integer.parseInt(s[0]);
		int Y=Integer.parseInt(s[1]);
		
		String ans="Yes";
		
		if(Y<2*X || Y>4*X || (Y&1)==1)
			ans="No";
		
		out.println(ans);
		
	}
	
	
}


