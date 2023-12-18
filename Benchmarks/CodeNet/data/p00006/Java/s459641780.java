import java.io.*;
import java.lang.*;


public class Main {
	public static void main(String[] args)  throws IOException
	{
	    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	    StringBuffer s = new StringBuffer(buf.readLine());
	    String sun = s.reverse().toString();
	    System.out.println(sun);
	}
		
}