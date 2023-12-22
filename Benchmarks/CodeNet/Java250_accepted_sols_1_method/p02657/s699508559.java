import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s[]=br.readLine().split(" ");
      	int a=Integer.parseInt(s[0]);
		float b=Float.parseFloat(s[1]);
      	System.out.printf("%.0f",a*b);
      System.out.println();

    }
}
