import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException
	{

	BufferedReader br1 =
		new BufferedReader(new InputStreamReader(System.in));
		
	BufferedReader br2 =
		new BufferedReader(new InputStreamReader(System.in));

	String str1 = br1.readLine();
	int a = Integer.parseInt(str1);

	String str2 = br2.readLine();
	int b = Integer.parseInt(str2);

	System.out.println( a*b );
	System.out.println( 2*a+2*b );
	}
}