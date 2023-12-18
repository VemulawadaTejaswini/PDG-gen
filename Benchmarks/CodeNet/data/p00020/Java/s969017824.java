import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line,up;
		line=input.readLine();
		up=line.toUpperCase();
		System.out.println(up);
	}
}	
		