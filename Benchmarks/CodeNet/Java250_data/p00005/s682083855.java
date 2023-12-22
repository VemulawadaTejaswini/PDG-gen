import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = in.readLine()) != null)
		{
			line=line.trim();
			StringTokenizer st = new StringTokenizer(line);
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}

	}
	
	public static long gcd(long a, long b)
	{
		if (a>=b) 
		{
			while (b!=0) 
			{
				long temp = b;
				b = a % b;
				a = temp;
			}
			return a;			

		}
		else return gcd(b,a);
	}
	
	public static long lcm(long a, long b)
	{
		long multiple = Math.abs(a*b);
		return multiple/gcd(a,b);
	}

}