import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException
	    { BufferedReader br  =
			    new BufferedReader (new InputStreamReader(System.in));
				
				String x = br.readLine();
				int  b= Integer.parseInt(x);
				
				System.out.println(Math.pow(b, 3));

		}
}