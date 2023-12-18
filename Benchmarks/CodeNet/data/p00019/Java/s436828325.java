
import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		line=input.readLine();
		int a = Integer.parseInt(line);
		long sum = 1;
		for (int i=1; i <= a;i++){
			sum*=i;
		}
		System.out.println(sum);
			
	}
}	
		