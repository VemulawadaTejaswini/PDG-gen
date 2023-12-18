import java.io.*;
import java.util.*;
//import javafx.util.Pair;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		long X=Long.parseLong(br.readLine());
		long ans=0;
		
		long c500=(X/500)*1000;
		long c50=((X%500)/5)*5;
		ans=c500+c50;

		out.println(ans);
		
		
	}
	
	
}


