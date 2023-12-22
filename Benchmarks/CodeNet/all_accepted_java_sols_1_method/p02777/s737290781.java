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
		String S = s[0];
		String T = s[1];
		
		s=br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		String U = br.readLine();
		
		if(U.equals(S))
			out.println((A-1)+" "+B);
		else
			out.println(A+" "+(B-1));
		
	}
}


