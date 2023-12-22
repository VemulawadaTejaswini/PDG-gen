/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader stdReader =
        	new BufferedReader(new InputStreamReader(System.in));
      	String line;
      	
      	line = stdReader.readLine();
      	int x = Integer.parseInt(line);
      	
      	System.out.println(x * x * x);
      	
      	stdReader.close();
	}
}