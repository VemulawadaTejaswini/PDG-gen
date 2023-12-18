
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x3 
{
	public static void main(String arg[]) throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();
	
	double x = Integer.parseInt(buf);
	
	
	x= Math.pow(x, 3);
	
	System.out.println(x);
	
	}
}