import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bu.readLine());
		System.out.print(2.0*Math.PI*n);
	}
}